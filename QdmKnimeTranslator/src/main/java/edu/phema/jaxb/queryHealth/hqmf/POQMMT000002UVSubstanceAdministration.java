//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POQM_MT000002UV.SubstanceAdministration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000002UV.SubstanceAdministration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="derivationExpr" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="recordStatusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}SXCM_TS" minOccurs="0"/>
 *         &lt;element name="activityTime" type="{urn:hl7-org:v3}SXCM_TS" minOccurs="0"/>
 *         &lt;element name="availabilityTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repeatNumber" type="{urn:hl7-org:v3}IVL_INT" minOccurs="0"/>
 *         &lt;element name="interruptibleInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="independentInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="uncertaintyCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="methodCode" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="approachSiteCode" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetSiteCode" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="routeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{urn:hl7-org:v3}IVL_PQ" minOccurs="0"/>
 *         &lt;element name="rateQuantity" type="{urn:hl7-org:v3}IVL_PQ" minOccurs="0"/>
 *         &lt;element name="doseCheckQuantity" type="{urn:hl7-org:v3}RTO_QTY_QTY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxDoseQuantity" type="{urn:hl7-org:v3}RTO_QTY_QTY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="administrationUnitCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="participant" type="{urn:hl7-org:v3}POQM_MT000002UV.Participant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sourceOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="actionNegationInd" type="{urn:hl7-org:v3}bl" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClass" />
 *       &lt;attribute name="isCriterionInd" type="{urn:hl7-org:v3}bl" default="false" />
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" default="EVN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POQM_MT000002UV.SubstanceAdministration", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "derivationExpr",
    "title",
    "text",
    "statusCode",
    "recordStatusCode",
    "effectiveTime",
    "activityTime",
    "availabilityTime",
    "priorityCode",
    "confidentialityCode",
    "repeatNumber",
    "interruptibleInd",
    "independentInd",
    "uncertaintyCode",
    "reasonCode",
    "languageCode",
    "methodCode",
    "approachSiteCode",
    "targetSiteCode",
    "routeCode",
    "doseQuantity",
    "rateQuantity",
    "doseCheckQuantity",
    "maxDoseQuantity",
    "administrationUnitCode",
    "participant",
    "sourceOf",
    "targetOf"
})
public class POQMMT000002UVSubstanceAdministration {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected CD code;
    protected ST derivationExpr;
    protected ED title;
    protected ED text;
    protected CS statusCode;
    protected CS recordStatusCode;
    protected SXCMTS effectiveTime;
    protected SXCMTS activityTime;
    protected TS availabilityTime;
    protected List<CE> priorityCode;
    protected List<CE> confidentialityCode;
    protected IVLINT repeatNumber;
    protected BL interruptibleInd;
    protected BL independentInd;
    protected CE uncertaintyCode;
    protected List<CE> reasonCode;
    protected CE languageCode;
    protected List<CD> methodCode;
    protected List<CD> approachSiteCode;
    protected List<CD> targetSiteCode;
    protected CE routeCode;
    protected IVLPQ doseQuantity;
    protected IVLPQ rateQuantity;
    protected List<RTOQTYQTY> doseCheckQuantity;
    protected List<RTOQTYQTY> maxDoseQuantity;
    protected CE administrationUnitCode;
    protected List<POQMMT000002UVParticipant> participant;
    protected List<POQMMT000002UVSourceOf> sourceOf;
    protected List<POQMMT000002UVSourceOf2> targetOf;
    @XmlAttribute
    protected Boolean actionNegationInd;
    @XmlAttribute(required = true)
    protected ActClass classCode;
    @XmlAttribute
    protected Boolean isCriterionInd;
    @XmlAttribute
    protected ActMood moodCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the derivationExpr property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getDerivationExpr() {
        return derivationExpr;
    }

    /**
     * Sets the value of the derivationExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setDerivationExpr(ST value) {
        this.derivationExpr = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setTitle(ED value) {
        this.title = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setText(ED value) {
        this.text = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the recordStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getRecordStatusCode() {
        return recordStatusCode;
    }

    /**
     * Sets the value of the recordStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setRecordStatusCode(CS value) {
        this.recordStatusCode = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link SXCMTS }
     *     
     */
    public SXCMTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SXCMTS }
     *     
     */
    public void setEffectiveTime(SXCMTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the activityTime property.
     * 
     * @return
     *     possible object is
     *     {@link SXCMTS }
     *     
     */
    public SXCMTS getActivityTime() {
        return activityTime;
    }

    /**
     * Sets the value of the activityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SXCMTS }
     *     
     */
    public void setActivityTime(SXCMTS value) {
        this.activityTime = value;
    }

    /**
     * Gets the value of the availabilityTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getAvailabilityTime() {
        return availabilityTime;
    }

    /**
     * Sets the value of the availabilityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setAvailabilityTime(TS value) {
        this.availabilityTime = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getPriorityCode() {
        if (priorityCode == null) {
            priorityCode = new ArrayList<CE>();
        }
        return this.priorityCode;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confidentialityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfidentialityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getConfidentialityCode() {
        if (confidentialityCode == null) {
            confidentialityCode = new ArrayList<CE>();
        }
        return this.confidentialityCode;
    }

    /**
     * Gets the value of the repeatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IVLINT }
     *     
     */
    public IVLINT getRepeatNumber() {
        return repeatNumber;
    }

    /**
     * Sets the value of the repeatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLINT }
     *     
     */
    public void setRepeatNumber(IVLINT value) {
        this.repeatNumber = value;
    }

    /**
     * Gets the value of the interruptibleInd property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getInterruptibleInd() {
        return interruptibleInd;
    }

    /**
     * Sets the value of the interruptibleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setInterruptibleInd(BL value) {
        this.interruptibleInd = value;
    }

    /**
     * Gets the value of the independentInd property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getIndependentInd() {
        return independentInd;
    }

    /**
     * Sets the value of the independentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setIndependentInd(BL value) {
        this.independentInd = value;
    }

    /**
     * Gets the value of the uncertaintyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getUncertaintyCode() {
        return uncertaintyCode;
    }

    /**
     * Sets the value of the uncertaintyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setUncertaintyCode(CE value) {
        this.uncertaintyCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CE }
     * 
     * 
     */
    public List<CE> getReasonCode() {
        if (reasonCode == null) {
            reasonCode = new ArrayList<CE>();
        }
        return this.reasonCode;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setLanguageCode(CE value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getMethodCode() {
        if (methodCode == null) {
            methodCode = new ArrayList<CD>();
        }
        return this.methodCode;
    }

    /**
     * Gets the value of the approachSiteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approachSiteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproachSiteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getApproachSiteCode() {
        if (approachSiteCode == null) {
            approachSiteCode = new ArrayList<CD>();
        }
        return this.approachSiteCode;
    }

    /**
     * Gets the value of the targetSiteCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetSiteCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetSiteCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getTargetSiteCode() {
        if (targetSiteCode == null) {
            targetSiteCode = new ArrayList<CD>();
        }
        return this.targetSiteCode;
    }

    /**
     * Gets the value of the routeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRouteCode(CE value) {
        this.routeCode = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setDoseQuantity(IVLPQ value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the rateQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPQ }
     *     
     */
    public IVLPQ getRateQuantity() {
        return rateQuantity;
    }

    /**
     * Sets the value of the rateQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPQ }
     *     
     */
    public void setRateQuantity(IVLPQ value) {
        this.rateQuantity = value;
    }

    /**
     * Gets the value of the doseCheckQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doseCheckQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoseCheckQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTOQTYQTY }
     * 
     * 
     */
    public List<RTOQTYQTY> getDoseCheckQuantity() {
        if (doseCheckQuantity == null) {
            doseCheckQuantity = new ArrayList<RTOQTYQTY>();
        }
        return this.doseCheckQuantity;
    }

    /**
     * Gets the value of the maxDoseQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxDoseQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxDoseQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RTOQTYQTY }
     * 
     * 
     */
    public List<RTOQTYQTY> getMaxDoseQuantity() {
        if (maxDoseQuantity == null) {
            maxDoseQuantity = new ArrayList<RTOQTYQTY>();
        }
        return this.maxDoseQuantity;
    }

    /**
     * Gets the value of the administrationUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getAdministrationUnitCode() {
        return administrationUnitCode;
    }

    /**
     * Sets the value of the administrationUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setAdministrationUnitCode(CE value) {
        this.administrationUnitCode = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000002UVParticipant }
     * 
     * 
     */
    public List<POQMMT000002UVParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<POQMMT000002UVParticipant>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the sourceOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000002UVSourceOf }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf> getSourceOf() {
        if (sourceOf == null) {
            sourceOf = new ArrayList<POQMMT000002UVSourceOf>();
        }
        return this.sourceOf;
    }

    /**
     * Gets the value of the targetOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000002UVSourceOf2 }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf2> getTargetOf() {
        if (targetOf == null) {
            targetOf = new ArrayList<POQMMT000002UVSourceOf2>();
        }
        return this.targetOf;
    }

    /**
     * Gets the value of the actionNegationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActionNegationInd() {
        return actionNegationInd;
    }

    /**
     * Sets the value of the actionNegationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActionNegationInd(Boolean value) {
        this.actionNegationInd = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActClass }
     *     
     */
    public ActClass getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClass }
     *     
     */
    public void setClassCode(ActClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the isCriterionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCriterionInd() {
        if (isCriterionInd == null) {
            return false;
        } else {
            return isCriterionInd;
        }
    }

    /**
     * Sets the value of the isCriterionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCriterionInd(Boolean value) {
        this.isCriterionInd = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActMood }
     *     
     */
    public ActMood getMoodCode() {
        if (moodCode == null) {
            return ActMood.EVN;
        } else {
            return moodCode;
        }
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActMood }
     *     
     */
    public void setMoodCode(ActMood value) {
        this.moodCode = value;
    }

}
