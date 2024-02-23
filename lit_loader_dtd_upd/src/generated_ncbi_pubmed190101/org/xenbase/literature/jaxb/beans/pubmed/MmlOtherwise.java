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
    "mmlPiecewiseOrMmlRelnOrMmlFnOrMmlDeclareOrMmlIntervalOrMmlInverseOrMmlIdentOrMmlDomainOrMmlCodomainOrMmlImageOrMmlLnOrMmlLogOrMmlMomentOrMmlLambdaOrMmlComposeOrMmlQuotientOrMmlDivideOrMmlMinusOrMmlPowerOrMmlRemOrMmlRootOrMmlFactorialOrMmlAbsOrMmlConjugateOrMmlArgOrMmlRealOrMmlImaginaryOrMmlFloorOrMmlCeilingOrMmlExpOrMmlMaxOrMmlMinOrMmlPlusOrMmlTimesOrMmlGcdOrMmlLcmOrMmlAndOrMmlOrOrMmlXorOrMmlNotOrMmlImpliesOrMmlEquivalentOrMmlForallOrMmlExistsOrMmlEqOrMmlGtOrMmlLtOrMmlGeqOrMmlLeqOrMmlNeqOrMmlApproxOrMmlFactorofOrMmlTendstoOrMmlIntOrMmlDiffOrMmlPartialdiffOrMmlDivergenceOrMmlGradOrMmlCurlOrMmlLaplacianOrMmlSetOrMmlListOrMmlUnionOrMmlIntersectOrMmlCartesianproductOrMmlInOrMmlNotinOrMmlNotsubsetOrMmlNotprsubsetOrMmlSetdiffOrMmlSubsetOrMmlPrsubsetOrMmlCardOrMmlSumOrMmlProductOrMmlLimitOrMmlSinOrMmlCosOrMmlTanOrMmlSecOrMmlCscOrMmlCotOrMmlSinhOrMmlCoshOrMmlTanhOrMmlSechOrMmlCschOrMmlCothOrMmlArcsinOrMmlArccosOrMmlArctanOrMmlArccoshOrMmlArccotOrMmlArccothOrMmlArccscOrMmlArccschOrMmlArcsecOrMmlArcsechOrMmlArcsinhOrMmlArctanhOrMmlMeanOrMmlSdevOrMmlVarianceOrMmlMedianOrMmlModeOrMmlVectorOrMmlMatrixOrMmlMatrixrowOrMmlDeterminantOrMmlTransposeOrMmlSelectorOrMmlVectorproductOrMmlScalarproductOrMmlOuterproductOrMmlIntegersOrMmlRealsOrMmlRationalsOrMmlNaturalnumbersOrMmlComplexesOrMmlPrimesOrMmlEmptysetOrMmlExponentialeOrMmlImaginaryiOrMmlNotanumberOrMmlTrueOrMmlFalseOrMmlPiOrMmlEulergammaOrMmlInfinityOrMmlSemanticsOrMmlCnOrMmlCiOrMmlCsymbolOrMmlApplyOrMmlBindOrMmlShareOrMmlCerrorOrMmlCbytesOrMmlCs"
})
@XmlRootElement(name = "mml:otherwise")
public class MmlOtherwise {

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
    @XmlElements({
        @XmlElement(name = "mml:piecewise", required = true, type = MmlPiecewise.class),
        @XmlElement(name = "mml:reln", required = true, type = MmlReln.class),
        @XmlElement(name = "mml:fn", required = true, type = MmlFn.class),
        @XmlElement(name = "mml:declare", required = true, type = MmlDeclare.class),
        @XmlElement(name = "mml:interval", required = true, type = MmlInterval.class),
        @XmlElement(name = "mml:inverse", required = true, type = MmlInverse.class),
        @XmlElement(name = "mml:ident", required = true, type = MmlIdent.class),
        @XmlElement(name = "mml:domain", required = true, type = MmlDomain.class),
        @XmlElement(name = "mml:codomain", required = true, type = MmlCodomain.class),
        @XmlElement(name = "mml:image", required = true, type = MmlImage.class),
        @XmlElement(name = "mml:ln", required = true, type = MmlLn.class),
        @XmlElement(name = "mml:log", required = true, type = MmlLog.class),
        @XmlElement(name = "mml:moment", required = true, type = MmlMoment.class),
        @XmlElement(name = "mml:lambda", required = true, type = MmlLambda.class),
        @XmlElement(name = "mml:compose", required = true, type = MmlCompose.class),
        @XmlElement(name = "mml:quotient", required = true, type = MmlQuotient.class),
        @XmlElement(name = "mml:divide", required = true, type = MmlDivide.class),
        @XmlElement(name = "mml:minus", required = true, type = MmlMinus.class),
        @XmlElement(name = "mml:power", required = true, type = MmlPower.class),
        @XmlElement(name = "mml:rem", required = true, type = MmlRem.class),
        @XmlElement(name = "mml:root", required = true, type = MmlRoot.class),
        @XmlElement(name = "mml:factorial", required = true, type = MmlFactorial.class),
        @XmlElement(name = "mml:abs", required = true, type = MmlAbs.class),
        @XmlElement(name = "mml:conjugate", required = true, type = MmlConjugate.class),
        @XmlElement(name = "mml:arg", required = true, type = MmlArg.class),
        @XmlElement(name = "mml:real", required = true, type = MmlReal.class),
        @XmlElement(name = "mml:imaginary", required = true, type = MmlImaginary.class),
        @XmlElement(name = "mml:floor", required = true, type = MmlFloor.class),
        @XmlElement(name = "mml:ceiling", required = true, type = MmlCeiling.class),
        @XmlElement(name = "mml:exp", required = true, type = MmlExp.class),
        @XmlElement(name = "mml:max", required = true, type = MmlMax.class),
        @XmlElement(name = "mml:min", required = true, type = MmlMin.class),
        @XmlElement(name = "mml:plus", required = true, type = MmlPlus.class),
        @XmlElement(name = "mml:times", required = true, type = MmlTimes.class),
        @XmlElement(name = "mml:gcd", required = true, type = MmlGcd.class),
        @XmlElement(name = "mml:lcm", required = true, type = MmlLcm.class),
        @XmlElement(name = "mml:and", required = true, type = MmlAnd.class),
        @XmlElement(name = "mml:or", required = true, type = MmlOr.class),
        @XmlElement(name = "mml:xor", required = true, type = MmlXor.class),
        @XmlElement(name = "mml:not", required = true, type = MmlNot.class),
        @XmlElement(name = "mml:implies", required = true, type = MmlImplies.class),
        @XmlElement(name = "mml:equivalent", required = true, type = MmlEquivalent.class),
        @XmlElement(name = "mml:forall", required = true, type = MmlForall.class),
        @XmlElement(name = "mml:exists", required = true, type = MmlExists.class),
        @XmlElement(name = "mml:eq", required = true, type = MmlEq.class),
        @XmlElement(name = "mml:gt", required = true, type = MmlGt.class),
        @XmlElement(name = "mml:lt", required = true, type = MmlLt.class),
        @XmlElement(name = "mml:geq", required = true, type = MmlGeq.class),
        @XmlElement(name = "mml:leq", required = true, type = MmlLeq.class),
        @XmlElement(name = "mml:neq", required = true, type = MmlNeq.class),
        @XmlElement(name = "mml:approx", required = true, type = MmlApprox.class),
        @XmlElement(name = "mml:factorof", required = true, type = MmlFactorof.class),
        @XmlElement(name = "mml:tendsto", required = true, type = MmlTendsto.class),
        @XmlElement(name = "mml:int", required = true, type = MmlInt.class),
        @XmlElement(name = "mml:diff", required = true, type = MmlDiff.class),
        @XmlElement(name = "mml:partialdiff", required = true, type = MmlPartialdiff.class),
        @XmlElement(name = "mml:divergence", required = true, type = MmlDivergence.class),
        @XmlElement(name = "mml:grad", required = true, type = MmlGrad.class),
        @XmlElement(name = "mml:curl", required = true, type = MmlCurl.class),
        @XmlElement(name = "mml:laplacian", required = true, type = MmlLaplacian.class),
        @XmlElement(name = "mml:set", required = true, type = MmlSet.class),
        @XmlElement(name = "mml:list", required = true, type = MmlList.class),
        @XmlElement(name = "mml:union", required = true, type = MmlUnion.class),
        @XmlElement(name = "mml:intersect", required = true, type = MmlIntersect.class),
        @XmlElement(name = "mml:cartesianproduct", required = true, type = MmlCartesianproduct.class),
        @XmlElement(name = "mml:in", required = true, type = MmlIn.class),
        @XmlElement(name = "mml:notin", required = true, type = MmlNotin.class),
        @XmlElement(name = "mml:notsubset", required = true, type = MmlNotsubset.class),
        @XmlElement(name = "mml:notprsubset", required = true, type = MmlNotprsubset.class),
        @XmlElement(name = "mml:setdiff", required = true, type = MmlSetdiff.class),
        @XmlElement(name = "mml:subset", required = true, type = MmlSubset.class),
        @XmlElement(name = "mml:prsubset", required = true, type = MmlPrsubset.class),
        @XmlElement(name = "mml:card", required = true, type = MmlCard.class),
        @XmlElement(name = "mml:sum", required = true, type = MmlSum.class),
        @XmlElement(name = "mml:product", required = true, type = MmlProduct.class),
        @XmlElement(name = "mml:limit", required = true, type = MmlLimit.class),
        @XmlElement(name = "mml:sin", required = true, type = MmlSin.class),
        @XmlElement(name = "mml:cos", required = true, type = MmlCos.class),
        @XmlElement(name = "mml:tan", required = true, type = MmlTan.class),
        @XmlElement(name = "mml:sec", required = true, type = MmlSec.class),
        @XmlElement(name = "mml:csc", required = true, type = MmlCsc.class),
        @XmlElement(name = "mml:cot", required = true, type = MmlCot.class),
        @XmlElement(name = "mml:sinh", required = true, type = MmlSinh.class),
        @XmlElement(name = "mml:cosh", required = true, type = MmlCosh.class),
        @XmlElement(name = "mml:tanh", required = true, type = MmlTanh.class),
        @XmlElement(name = "mml:sech", required = true, type = MmlSech.class),
        @XmlElement(name = "mml:csch", required = true, type = MmlCsch.class),
        @XmlElement(name = "mml:coth", required = true, type = MmlCoth.class),
        @XmlElement(name = "mml:arcsin", required = true, type = MmlArcsin.class),
        @XmlElement(name = "mml:arccos", required = true, type = MmlArccos.class),
        @XmlElement(name = "mml:arctan", required = true, type = MmlArctan.class),
        @XmlElement(name = "mml:arccosh", required = true, type = MmlArccosh.class),
        @XmlElement(name = "mml:arccot", required = true, type = MmlArccot.class),
        @XmlElement(name = "mml:arccoth", required = true, type = MmlArccoth.class),
        @XmlElement(name = "mml:arccsc", required = true, type = MmlArccsc.class),
        @XmlElement(name = "mml:arccsch", required = true, type = MmlArccsch.class),
        @XmlElement(name = "mml:arcsec", required = true, type = MmlArcsec.class),
        @XmlElement(name = "mml:arcsech", required = true, type = MmlArcsech.class),
        @XmlElement(name = "mml:arcsinh", required = true, type = MmlArcsinh.class),
        @XmlElement(name = "mml:arctanh", required = true, type = MmlArctanh.class),
        @XmlElement(name = "mml:mean", required = true, type = MmlMean.class),
        @XmlElement(name = "mml:sdev", required = true, type = MmlSdev.class),
        @XmlElement(name = "mml:variance", required = true, type = MmlVariance.class),
        @XmlElement(name = "mml:median", required = true, type = MmlMedian.class),
        @XmlElement(name = "mml:mode", required = true, type = MmlMode.class),
        @XmlElement(name = "mml:vector", required = true, type = MmlVector.class),
        @XmlElement(name = "mml:matrix", required = true, type = MmlMatrix.class),
        @XmlElement(name = "mml:matrixrow", required = true, type = MmlMatrixrow.class),
        @XmlElement(name = "mml:determinant", required = true, type = MmlDeterminant.class),
        @XmlElement(name = "mml:transpose", required = true, type = MmlTranspose.class),
        @XmlElement(name = "mml:selector", required = true, type = MmlSelector.class),
        @XmlElement(name = "mml:vectorproduct", required = true, type = MmlVectorproduct.class),
        @XmlElement(name = "mml:scalarproduct", required = true, type = MmlScalarproduct.class),
        @XmlElement(name = "mml:outerproduct", required = true, type = MmlOuterproduct.class),
        @XmlElement(name = "mml:integers", required = true, type = MmlIntegers.class),
        @XmlElement(name = "mml:reals", required = true, type = MmlReals.class),
        @XmlElement(name = "mml:rationals", required = true, type = MmlRationals.class),
        @XmlElement(name = "mml:naturalnumbers", required = true, type = MmlNaturalnumbers.class),
        @XmlElement(name = "mml:complexes", required = true, type = MmlComplexes.class),
        @XmlElement(name = "mml:primes", required = true, type = MmlPrimes.class),
        @XmlElement(name = "mml:emptyset", required = true, type = MmlEmptyset.class),
        @XmlElement(name = "mml:exponentiale", required = true, type = MmlExponentiale.class),
        @XmlElement(name = "mml:imaginaryi", required = true, type = MmlImaginaryi.class),
        @XmlElement(name = "mml:notanumber", required = true, type = MmlNotanumber.class),
        @XmlElement(name = "mml:true", required = true, type = MmlTrue.class),
        @XmlElement(name = "mml:false", required = true, type = MmlFalse.class),
        @XmlElement(name = "mml:pi", required = true, type = MmlPi.class),
        @XmlElement(name = "mml:eulergamma", required = true, type = MmlEulergamma.class),
        @XmlElement(name = "mml:infinity", required = true, type = MmlInfinity.class),
        @XmlElement(name = "mml:semantics", required = true, type = MmlSemantics.class),
        @XmlElement(name = "mml:cn", required = true, type = MmlCn.class),
        @XmlElement(name = "mml:ci", required = true, type = MmlCi.class),
        @XmlElement(name = "mml:csymbol", required = true, type = MmlCsymbol.class),
        @XmlElement(name = "mml:apply", required = true, type = MmlApply.class),
        @XmlElement(name = "mml:bind", required = true, type = MmlBind.class),
        @XmlElement(name = "mml:share", required = true, type = MmlShare.class),
        @XmlElement(name = "mml:cerror", required = true, type = MmlCerror.class),
        @XmlElement(name = "mml:cbytes", required = true, type = MmlCbytes.class),
        @XmlElement(name = "mml:cs", required = true, type = MmlCs.class)
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
