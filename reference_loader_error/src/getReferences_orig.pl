#!/usr/bin/perl

#this script takes XB-ART ID and PMID from a user-specified file with header of format xbART \t PMID 
#it then goes to get XML from two different eUtility links for each pubmed ID (PMID) in that list.  
#another script (CitationUpdater) will take another trip to each PMID page to retrieve the first author and publication year
#It exports a single file to be processed by CitationUpdater.pl which exports a perl-hash to be used by a tampermonkey script to display the articles cited by an XB-ART
#takes about 5h to run on the whole XB library

#3.0	just goes and gets the PMID and exports PMID cited_by PMID... therefore relies on citation updater to get new reference names, skipping the output splitter algorithms, added cited by in same loop
#Author: Kevin Burns
#Modified by: Vaneet Lotay

use LWP::Simple;
use Math::Round;
use DBI;
require XenbaseChadoTools;
require JgiQueryTools;
require SqlQueryTools;
require GenericTools;

#do "/scripts/PerlDb2Config.pl";
do "/home/db2inst1/scripts/PerlDb2Config.pl";

my $currPMID = -1;
my $paperID = -1;
my $paperHits = 0;
my $currPMIDhit = -1;
my @results = ();
my $count = 1;
my $notFound = 0;#Number of Xenbase papers with no response from E-Utilities
my $refNotFound = 0;#Number of referenced papers with no response from E-Utilities
my $hitsCount = 1;
my $xbHitsFound = 0;
my $noRefs = 0;
my $cvTermID = 65742; #CVtermID for 'refers to'

my $hasError = 1;
my $statusEmailSubject;
my $sendmail = "/usr/lib/sendmail";
my $toStatusEmail = "vaneet.lotay\@ucalgary.ca";
#my $toStatusEmail = "vaneet.lotay\@ucalgary.ca; xendevs\@ucalgary.ca";
my $fromEmail = "srv-xenbase-noreply\@ucalgary.ca";

my $DB = $ARGV[0];#database name to add references to for Xenbase papers

my $database = lc($DB);

if($database ne "devel31" && $database ne "test12" && $database ne "xbprod27" && $database ne "ebtest1" && $database ne "ebtest2" && $database ne "ebprod1"){
	die "Must enter a valid database to import Xenbase or Echinobase articles from.\nMust be one of the following: devel31, test12, xbprod27, ebtest1, ebtest2, ebprod1\n";
}

$website = "Xenbase";

if($database =~ /^eb/){
	$website = "Echinobase";
	$dbh = XenbaseChadoTools::ConnectToEchinobaseLob($database, $echinobaseUserName, $echinobasePassword);	
	#die "Connected to Echinobase successfully, quitting\n"
}
else{	
	$dbh = XenbaseChadoTools::ConnectToXenbase($database, $xenbaseUserName, $xenbasePassword);
	#die "Connected to Xenbase successfully, quitting\n";	
}

open SUMM, ">ref_summary_$database.txt" or die $!;

my $sqlStatement = "select paper_id, pubmed_id from paper";
my @papers = SqlQueryTools::RunSqlSelectQuery($sqlStatement,$dbh);

open(LOG, ">getReferences_$database.log") or die $!;
open(PAP, ">DBpapers_$database.txt") or die $!;

for(my $j=0; $j<scalar(@papers); $j++){
	print PAP "J=$j, PaperID = $papers[$j][0], PMID = $papers[$j][1]\n";
}
close(PAP);

print SUMM ("Number of $website papers in DB = ", scalar(@papers), "\n");

open(OUTPUT, '>', "ref_table_$database.txt") or die$!;
print OUTPUT "PAPER_ID1\tPUBMED_ID1\tRELATIONSHIP\tPAPER_ID2\tPUBMED_ID2\tPUB_YEAR2\tAUTHOR2\tTITLE2\n";

#my $startFound = 0;
$hitsCount = 0;
$count = 0;
$pmFound = 0;

for(my $i = 0; $i < scalar(@papers); $i++){
	$paperID = $papers[$i][0];
	$currPMID = $papers[$i][1];
	$pmFound = 0;
	
	#open url to get articles this PMID references
	$url = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?db=pubmed&retmode=xml&id="."$currPMID&api_key=8cf449df06c40f73e17085fa7422eaf20008";
	print LOG "Querying PubMedID $currPMID (ART=$paperID)\n";
	
	#get all XML on page for a regex extraction
	$text = get($url);	
	$count++;
	
	if($text eq ""){
		print LOG "NO_RESP1: No response for $website paper on 1st attempt with PMID=$currPMID (ART=$paperID)\n";
		for($j = 2; $j<4; $j++){
			sleep(1);
			$text = get($url);
			if($text eq ""){
				print LOG "NO_RESP$j: No response for $website paper on $j"."nd attempt with PMID=$currPMID (ART=$paperID)\n";
			}
			else{
				$pmFound = 1;
				print LOG "RESP_FND: Valid response found for $website paper on $j"."nd attempt with PMID=$currPMID (ART=$paperID)\n";
				last;
			}
		}
		if(!($pmFound)){
			print LOG "NO_RESPONSE: No response for $website paper with PMID=$currPMID (ART=$paperID)\n\n";
			$notFound++;
			next;
		}
	}
	my (@hits) = ($text =~ m/<ArticleId IdType="pubmed">(\d+)<\/ArticleId>/g);
	
	shift(@hits); # gets rid of an instance of the PMID that we're querying appears on the page first
	if(scalar(@hits) == 0){
		print LOG "WARNING: No reference hits found for PubMed $currPMID(ART=$paperID)\n";
		$noRefs++;
	}
	else{
		print LOG ("# of references: ", scalar(@hits), "\n");
	}
	for ($thatPMID = 0; $thatPMID <=$#hits;$thatPMID ++){
		$pmFound = 0;
		$hitsCount++;
		$year = "";
		$lastName = "";
		$title = "";
		$currPMIDhit = $hits[$thatPMID];
		$sqlStatement = "select paper_id from paper where pubmed_id = $currPMIDhit";
		@results = SqlQueryTools::RunSqlSelectQuery($sqlStatement,$dbh);
		if(scalar(@results) > 0){
			print LOG "XHIT: Found a/an $website article hit: PMID = $currPMIDhit (ART=$results[0][0]) references ART=$paperID\n";
			$paperID2 = $results[0][0];
			$xbHitsFound++;
		}
		else{
			$paperID2 = "-";
		}
		$url2 = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi?db=pubmed&retmode=xml&id="."$currPMIDhit&api_key=8cf449df06c40f73e17085fa7422eaf20008";
		print LOG "Querying reference PubMedID $currPMIDhit\n";
		$text = get($url2);
		
		if($text eq ""){
			print LOG "NO_REF_RESP1: No response on 1st attempt for $website reference with PMID=$currPMIDhit\n";
			for($j = 2; $j<4; $j++){
				sleep(1);
				$text = get($url2);
				if($text eq ""){
					print LOG "NO_REF RESP$j: No response on $j"."nd attempt for $website reference with PMID=$currPMIDhit\n";
				}
				else{
					$pmFound = 1;
					print LOG "REF_RESP_FND: Valid response found on $j"."nd attempt for $website reference with PMID=$currPMIDhit\n";
					last;
				}
			}
			if(!($pmFound)){
				print LOG "NO_REF_RESPONSE: No response for $website reference with PMID=$currPMIDhit (ART=$paperID)\n\n";
				$refNotFound++;
				next;
			}
		}		
		($year) = ($text =~ /<Year>(\d+)<\/Year>/);
		($lastName) =($text =~ /<LastName>(.+)<\/LastName>/);
		($title) =($text =~ /<ArticleTitle>(.+)<\/ArticleTitle>/);
		#Check for empty fields related to reference hits
		if($year eq ""){
			print LOG "NO_YEAR: No year found for reference hit PMID=$currPMIDhit\n";
		}
		if($lastName eq ""){
			print LOG "NO_NAME: No author's last name for reference hit PMID=$currPMIDhit\n";
		}
		if($title eq ""){
			print LOG "NO_TITLE: No article title for reference hit PMID=$currPMIDhit\n";
		}
		
		#escape quotes within reference fields before inserting into DB
		if($lastName =~ /'/){
			$lastName =~ s/'/''/g;
		}
		if($title =~ /'/){
			$title =~ s/'/''/g;
		}
		
		if(length($title) > 510){
			$title = substr($title, 0, 510);
		}
		
		#Insert paper citation into DB
		print OUTPUT "$paperID\t$currPMID\treferences\t$paperID2\t$currPMIDhit\t$year\t$lastName\t$title\n";
		$citationId = XenbaseChadoTools::InsertPaperCitation($paperID, $currPMIDhit, $cvTermID, $title, $lastName, $year, 3650, $dbh);
		if(!defined $citationId){
			print LOG "WARNING: Problem inserting citation info for reference paper $currPMIDhit referenced by $currPMID: Year = $year, Author-LastName = $lastName, Title = $title\n";
		}
	}
#	if($count == 50 || $count == 51){
#		print "Ending script after $count papers were processed\n";
#		last;
#	}
	if($count == 1000){
		print LOG "1000 papers processed\n";
	}
	elsif($count == 5000){
		print LOG "5000 papers processed\n";
	}
	elsif($count == 10000){
		print LOG "10000 papers processed\n";
	}
	elsif($count == 20000){
		print LOG "20000 papers processed\n";
	}
	elsif($count == 30000){
		print LOG "30000 papers processed\n";
	} 
	elsif($count == 40000){
		print LOG "40000 papers processed\n";
	}	
}

print LOG "Finished processing all $count papers in $database\n";

$hasError = 0;

END{
	if(defined $dbh){
		$dbh->disconnect();
	}
	
	$xbScore = round($xbHitsFound/$hitsCount* 100);
	$refScore = round($noRefs/$count * 100);
	$nfScore = round($notFound/$count * 100);
	print SUMM "$xbScore% of $hitsCount references are $website papers\n";  
	print SUMM "$notFound ($nfScore%) papers that obtained no response from EUtilities queries\n";	
	print SUMM "$refNotFound referenced papers that obtained no response from EUtilities queries\n";  
	print SUMM "$refScore% of Echinobase papers had no references listed from EUtilities queries\n";
	
	if($hasError){
		$statusEmailSubject = "Error obtaining reference info for $website papers\n";
		unless(open (MAIL, "| /usr/sbin/sendmail -t")) {
			print "error.\n";
			warn "Error starting sendmail: $!";
		}
		else{
			print MAIL "From: " . $fromEmail . "\n";
			print MAIL "To: " . $toStatusEmail . "\n";
			print MAIL "Subject: " . $statusEmailSubject ."\n\n";
			close(MAIL) || warn "Error closing mail: $!";
		}
		print LOG "Script ended prematurely at iteration $count with Paper=$paperID and PMID=$currPMID\n";
	}
	
	close(SUMM);
	close(OUTPUT);
	close(LOG);

}