//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.20 at 02:20:29 PM MST 
//


package org.xenbase.literature.jaxb.beans.pubmed;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mmlBvar",
    "mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit",
    "mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs"
})
@XmlRootElement(name = "mml:list")
public class MmlList {

    @XmlAttribute(name = "xmlns:mml")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsMml;
    @XmlAttribute(name = "xlink:href")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xlinkHref;
    @XmlAttribute(name = "xlink:type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xlinkType;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlLang;
    @XmlAttribute(name = "xml:space")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlSpace;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "xref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xref;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "href")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String href;
    @XmlAttribute(name = "other")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String other;
    @XmlAttribute(name = "encoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String encoding;
    @XmlAttribute(name = "definitionURL")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String definitionURL;
    @XmlAttribute(name = "order")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String order;
    @XmlElement(name = "mml:bvar")
    protected List<MmlBvar> mmlBvar;
    @XmlElements({
        @XmlElement(name = "mml:domainofapplication", type = MmlDomainofapplication.class),
        @XmlElement(name = "mml:condition", type = MmlCondition.class),
        @XmlElement(name = "mml:lowlimit", type = MmlLowlimit.class),
        @XmlElement(name = "mml:uplimit", type = MmlUplimit.class)
    })
    protected List<java.lang.Object> mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit;
    @XmlElements({
        @XmlElement(name = "mml:piecewise", type = MmlPiecewise.class),
        @XmlElement(name = "mml:reln", type = MmlReln.class),
        @XmlElement(name = "mml:fn", type = MmlFn.class),
        @XmlElement(name = "mml:declare", type = MmlDeclare.class),
        @XmlElement(name = "mml:interval", type = MmlInterval.class),
        @XmlElement(name = "mml:inverse", type = MmlInverse.class),
        @XmlElement(name = "mml:ident", type = MmlIdent.class),
        @XmlElement(name = "mml:domain", type = MmlDomain.class),
        @XmlElement(name = "mml:codomain", type = MmlCodomain.class),
        @XmlElement(name = "mml:image", type = MmlImage.class),
        @XmlElement(name = "mml:ln", type = MmlLn.class),
        @XmlElement(name = "mml:log", type = MmlLog.class),
        @XmlElement(name = "mml:moment", type = MmlMoment.class),
        @XmlElement(name = "mml:lambda", type = MmlLambda.class),
        @XmlElement(name = "mml:compose", type = MmlCompose.class),
        @XmlElement(name = "mml:quotient", type = MmlQuotient.class),
        @XmlElement(name = "mml:divide", type = MmlDivide.class),
        @XmlElement(name = "mml:minus", type = MmlMinus.class),
        @XmlElement(name = "mml:power", type = MmlPower.class),
        @XmlElement(name = "mml:rem", type = MmlRem.class),
        @XmlElement(name = "mml:root", type = MmlRoot.class),
        @XmlElement(name = "mml:factorial", type = MmlFactorial.class),
        @XmlElement(name = "mml:abs", type = MmlAbs.class),
        @XmlElement(name = "mml:conjugate", type = MmlConjugate.class),
        @XmlElement(name = "mml:arg", type = MmlArg.class),
        @XmlElement(name = "mml:real", type = MmlReal.class),
        @XmlElement(name = "mml:imaginary", type = MmlImaginary.class),
        @XmlElement(name = "mml:floor", type = MmlFloor.class),
        @XmlElement(name = "mml:ceiling", type = MmlCeiling.class),
        @XmlElement(name = "mml:exp", type = MmlExp.class),
        @XmlElement(name = "mml:max", type = MmlMax.class),
        @XmlElement(name = "mml:min", type = MmlMin.class),
        @XmlElement(name = "mml:plus", type = MmlPlus.class),
        @XmlElement(name = "mml:times", type = MmlTimes.class),
        @XmlElement(name = "mml:gcd", type = MmlGcd.class),
        @XmlElement(name = "mml:lcm", type = MmlLcm.class),
        @XmlElement(name = "mml:and", type = MmlAnd.class),
        @XmlElement(name = "mml:or", type = MmlOr.class),
        @XmlElement(name = "mml:xor", type = MmlXor.class),
        @XmlElement(name = "mml:not", type = MmlNot.class),
        @XmlElement(name = "mml:implies", type = MmlImplies.class),
        @XmlElement(name = "mml:equivalent", type = MmlEquivalent.class),
        @XmlElement(name = "mml:forall", type = MmlForall.class),
        @XmlElement(name = "mml:exists", type = MmlExists.class),
        @XmlElement(name = "mml:eq", type = MmlEq.class),
        @XmlElement(name = "mml:gt", type = MmlGt.class),
        @XmlElement(name = "mml:lt", type = MmlLt.class),
        @XmlElement(name = "mml:geq", type = MmlGeq.class),
        @XmlElement(name = "mml:leq", type = MmlLeq.class),
        @XmlElement(name = "mml:neq", type = MmlNeq.class),
        @XmlElement(name = "mml:approx", type = MmlApprox.class),
        @XmlElement(name = "mml:factorof", type = MmlFactorof.class),
        @XmlElement(name = "mml:tendsto", type = MmlTendsto.class),
        @XmlElement(name = "mml:int", type = MmlInt.class),
        @XmlElement(name = "mml:diff", type = MmlDiff.class),
        @XmlElement(name = "mml:partialdiff", type = MmlPartialdiff.class),
        @XmlElement(name = "mml:divergence", type = MmlDivergence.class),
        @XmlElement(name = "mml:grad", type = MmlGrad.class),
        @XmlElement(name = "mml:curl", type = MmlCurl.class),
        @XmlElement(name = "mml:laplacian", type = MmlLaplacian.class),
        @XmlElement(name = "mml:set", type = MmlSet.class),
        @XmlElement(name = "mml:list", type = MmlList.class),
        @XmlElement(name = "mml:union", type = MmlUnion.class),
        @XmlElement(name = "mml:intersect", type = MmlIntersect.class),
        @XmlElement(name = "mml:cartesianproduct", type = MmlCartesianproduct.class),
        @XmlElement(name = "mml:in", type = MmlIn.class),
        @XmlElement(name = "mml:notin", type = MmlNotin.class),
        @XmlElement(name = "mml:notsubset", type = MmlNotsubset.class),
        @XmlElement(name = "mml:notprsubset", type = MmlNotprsubset.class),
        @XmlElement(name = "mml:setdiff", type = MmlSetdiff.class),
        @XmlElement(name = "mml:subset", type = MmlSubset.class),
        @XmlElement(name = "mml:prsubset", type = MmlPrsubset.class),
        @XmlElement(name = "mml:card", type = MmlCard.class),
        @XmlElement(name = "mml:sum", type = MmlSum.class),
        @XmlElement(name = "mml:product", type = MmlProduct.class),
        @XmlElement(name = "mml:limit", type = MmlLimit.class),
        @XmlElement(name = "mml:sin", type = MmlSin.class),
        @XmlElement(name = "mml:cos", type = MmlCos.class),
        @XmlElement(name = "mml:tan", type = MmlTan.class),
        @XmlElement(name = "mml:sec", type = MmlSec.class),
        @XmlElement(name = "mml:csc", type = MmlCsc.class),
        @XmlElement(name = "mml:cot", type = MmlCot.class),
        @XmlElement(name = "mml:sinh", type = MmlSinh.class),
        @XmlElement(name = "mml:cosh", type = MmlCosh.class),
        @XmlElement(name = "mml:tanh", type = MmlTanh.class),
        @XmlElement(name = "mml:sech", type = MmlSech.class),
        @XmlElement(name = "mml:csch", type = MmlCsch.class),
        @XmlElement(name = "mml:coth", type = MmlCoth.class),
        @XmlElement(name = "mml:arcsin", type = MmlArcsin.class),
        @XmlElement(name = "mml:arccos", type = MmlArccos.class),
        @XmlElement(name = "mml:arctan", type = MmlArctan.class),
        @XmlElement(name = "mml:arccosh", type = MmlArccosh.class),
        @XmlElement(name = "mml:arccot", type = MmlArccot.class),
        @XmlElement(name = "mml:arccoth", type = MmlArccoth.class),
        @XmlElement(name = "mml:arccsc", type = MmlArccsc.class),
        @XmlElement(name = "mml:arccsch", type = MmlArccsch.class),
        @XmlElement(name = "mml:arcsec", type = MmlArcsec.class),
        @XmlElement(name = "mml:arcsech", type = MmlArcsech.class),
        @XmlElement(name = "mml:arcsinh", type = MmlArcsinh.class),
        @XmlElement(name = "mml:arctanh", type = MmlArctanh.class),
        @XmlElement(name = "mml:mean", type = MmlMean.class),
        @XmlElement(name = "mml:sdev", type = MmlSdev.class),
        @XmlElement(name = "mml:variance", type = MmlVariance.class),
        @XmlElement(name = "mml:median", type = MmlMedian.class),
        @XmlElement(name = "mml:mode", type = MmlMode.class),
        @XmlElement(name = "mml:vector", type = MmlVector.class),
        @XmlElement(name = "mml:matrix", type = MmlMatrix.class),
        @XmlElement(name = "mml:matrixrow", type = MmlMatrixrow.class),
        @XmlElement(name = "mml:determinant", type = MmlDeterminant.class),
        @XmlElement(name = "mml:transpose", type = MmlTranspose.class),
        @XmlElement(name = "mml:selector", type = MmlSelector.class),
        @XmlElement(name = "mml:vectorproduct", type = MmlVectorproduct.class),
        @XmlElement(name = "mml:scalarproduct", type = MmlScalarproduct.class),
        @XmlElement(name = "mml:outerproduct", type = MmlOuterproduct.class),
        @XmlElement(name = "mml:integers", type = MmlIntegers.class),
        @XmlElement(name = "mml:reals", type = MmlReals.class),
        @XmlElement(name = "mml:rationals", type = MmlRationals.class),
        @XmlElement(name = "mml:naturalnumbers", type = MmlNaturalnumbers.class),
        @XmlElement(name = "mml:complexes", type = MmlComplexes.class),
        @XmlElement(name = "mml:primes", type = MmlPrimes.class),
        @XmlElement(name = "mml:emptyset", type = MmlEmptyset.class),
        @XmlElement(name = "mml:exponentiale", type = MmlExponentiale.class),
        @XmlElement(name = "mml:imaginaryi", type = MmlImaginaryi.class),
        @XmlElement(name = "mml:notanumber", type = MmlNotanumber.class),
        @XmlElement(name = "mml:true", type = MmlTrue.class),
        @XmlElement(name = "mml:false", type = MmlFalse.class),
        @XmlElement(name = "mml:pi", type = MmlPi.class),
        @XmlElement(name = "mml:eulergamma", type = MmlEulergamma.class),
        @XmlElement(name = "mml:infinity", type = MmlInfinity.class),
        @XmlElement(name = "mml:semantics", type = MmlSemantics.class),
        @XmlElement(name = "mml:cn", type = MmlCn.class),
        @XmlElement(name = "mml:ci", type = MmlCi.class),
        @XmlElement(name = "mml:csymbol", type = MmlCsymbol.class),
        @XmlElement(name = "mml:apply", type = MmlApply.class),
        @XmlElement(name = "mml:bind", type = MmlBind.class),
        @XmlElement(name = "mml:share", type = MmlShare.class),
        @XmlElement(name = "mml:cerror", type = MmlCerror.class),
        @XmlElement(name = "mml:cbytes", type = MmlCbytes.class),
        @XmlElement(name = "mml:cs", type = MmlCs.class)
    })
    protected List<java.lang.Object> mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs;

    /**
     * Gets the value of the xmlnsMml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsMml() {
        if (xmlnsMml == null) {
            return "http://www.w3.org/1998/Math/MathML";
        } else {
            return xmlnsMml;
        }
    }

    /**
     * Sets the value of the xmlnsMml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsMml(String value) {
        this.xmlnsMml = value;
    }

    /**
     * Gets the value of the xlinkHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkHref() {
        return xlinkHref;
    }

    /**
     * Sets the value of the xlinkHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkHref(String value) {
        this.xlinkHref = value;
    }

    /**
     * Gets the value of the xlinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkType() {
        return xlinkType;
    }

    /**
     * Sets the value of the xlinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkType(String value) {
        this.xlinkType = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the xmlSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSpace() {
        return xmlSpace;
    }

    /**
     * Sets the value of the xmlSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSpace(String value) {
        this.xmlSpace = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXref() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXref(String value) {
        this.xref = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the definitionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionURL() {
        return definitionURL;
    }

    /**
     * Sets the value of the definitionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionURL(String value) {
        this.definitionURL = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the mmlBvar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlBvar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmlBvar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MmlBvar }
     * 
     * 
     */
    public List<MmlBvar> getMmlBvar() {
        if (mmlBvar == null) {
            mmlBvar = new ArrayList<MmlBvar>();
        }
        return this.mmlBvar;
    }

    /**
     * Gets the value of the mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MmlDomainofapplication }
     * {@link MmlCondition }
     * {@link MmlLowlimit }
     * {@link MmlUplimit }
     * 
     * 
     */
    public List<java.lang.Object> getMmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit() {
        if (mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit == null) {
            mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit = new ArrayList<java.lang.Object>();
        }
        return this.mmlDomainofapplicationOrMmlConditionOrMmlLowlimitOrMmlUplimit;
    }

    /**
     * Gets the value of the mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MmlPiecewise }
     * {@link MmlReln }
     * {@link MmlFn }
     * {@link MmlDeclare }
     * {@link MmlInterval }
     * {@link MmlInverse }
     * {@link MmlIdent }
     * {@link MmlDomain }
     * {@link MmlCodomain }
     * {@link MmlImage }
     * {@link MmlLn }
     * {@link MmlLog }
     * {@link MmlMoment }
     * {@link MmlLambda }
     * {@link MmlCompose }
     * {@link MmlQuotient }
     * {@link MmlDivide }
     * {@link MmlMinus }
     * {@link MmlPower }
     * {@link MmlRem }
     * {@link MmlRoot }
     * {@link MmlFactorial }
     * {@link MmlAbs }
     * {@link MmlConjugate }
     * {@link MmlArg }
     * {@link MmlReal }
     * {@link MmlImaginary }
     * {@link MmlFloor }
     * {@link MmlCeiling }
     * {@link MmlExp }
     * {@link MmlMax }
     * {@link MmlMin }
     * {@link MmlPlus }
     * {@link MmlTimes }
     * {@link MmlGcd }
     * {@link MmlLcm }
     * {@link MmlAnd }
     * {@link MmlOr }
     * {@link MmlXor }
     * {@link MmlNot }
     * {@link MmlImplies }
     * {@link MmlEquivalent }
     * {@link MmlForall }
     * {@link MmlExists }
     * {@link MmlEq }
     * {@link MmlGt }
     * {@link MmlLt }
     * {@link MmlGeq }
     * {@link MmlLeq }
     * {@link MmlNeq }
     * {@link MmlApprox }
     * {@link MmlFactorof }
     * {@link MmlTendsto }
     * {@link MmlInt }
     * {@link MmlDiff }
     * {@link MmlPartialdiff }
     * {@link MmlDivergence }
     * {@link MmlGrad }
     * {@link MmlCurl }
     * {@link MmlLaplacian }
     * {@link MmlSet }
     * {@link MmlList }
     * {@link MmlUnion }
     * {@link MmlIntersect }
     * {@link MmlCartesianproduct }
     * {@link MmlIn }
     * {@link MmlNotin }
     * {@link MmlNotsubset }
     * {@link MmlNotprsubset }
     * {@link MmlSetdiff }
     * {@link MmlSubset }
     * {@link MmlPrsubset }
     * {@link MmlCard }
     * {@link MmlSum }
     * {@link MmlProduct }
     * {@link MmlLimit }
     * {@link MmlSin }
     * {@link MmlCos }
     * {@link MmlTan }
     * {@link MmlSec }
     * {@link MmlCsc }
     * {@link MmlCot }
     * {@link MmlSinh }
     * {@link MmlCosh }
     * {@link MmlTanh }
     * {@link MmlSech }
     * {@link MmlCsch }
     * {@link MmlCoth }
     * {@link MmlArcsin }
     * {@link MmlArccos }
     * {@link MmlArctan }
     * {@link MmlArccosh }
     * {@link MmlArccot }
     * {@link MmlArccoth }
     * {@link MmlArccsc }
     * {@link MmlArccsch }
     * {@link MmlArcsec }
     * {@link MmlArcsech }
     * {@link MmlArcsinh }
     * {@link MmlArctanh }
     * {@link MmlMean }
     * {@link MmlSdev }
     * {@link MmlVariance }
     * {@link MmlMedian }
     * {@link MmlMode }
     * {@link MmlVector }
     * {@link MmlMatrix }
     * {@link MmlMatrixrow }
     * {@link MmlDeterminant }
     * {@link MmlTranspose }
     * {@link MmlSelector }
     * {@link MmlVectorproduct }
     * {@link MmlScalarproduct }
     * {@link MmlOuterproduct }
     * {@link MmlIntegers }
     * {@link MmlReals }
     * {@link MmlRationals }
     * {@link MmlNaturalnumbers }
     * {@link MmlComplexes }
     * {@link MmlPrimes }
     * {@link MmlEmptyset }
     * {@link MmlExponentiale }
     * {@link MmlImaginaryi }
     * {@link MmlNotanumber }
     * {@link MmlTrue }
     * {@link MmlFalse }
     * {@link MmlPi }
     * {@link MmlEulergamma }
     * {@link MmlInfinity }
     * {@link MmlSemantics }
     * {@link MmlCn }
     * {@link MmlCi }
     * {@link MmlCsymbol }
     * {@link MmlApply }
     * {@link MmlBind }
     * {@link MmlShare }
     * {@link MmlCerror }
     * {@link MmlCbytes }
     * {@link MmlCs }
     * 
     * 
     */
    public List<java.lang.Object> getMmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs() {
        if (mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs == null) {
            mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs = new ArrayList<java.lang.Object>();
        }
        return this.mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs;
    }

}
