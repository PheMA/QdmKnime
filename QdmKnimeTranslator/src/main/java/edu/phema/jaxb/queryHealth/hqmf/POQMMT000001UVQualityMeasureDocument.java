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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POQM_MT000001UV.QualityMeasureDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000001UV.QualityMeasureDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/>
 *         &lt;element name="title" type="{urn:hl7-org:v3}ST"/>
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="availabilityTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="setId" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="versionNumber" type="{urn:hl7-org:v3}INT"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}POQM_MT000001UV.Author" maxOccurs="unbounded"/>
 *         &lt;element name="custodian" type="{urn:hl7-org:v3}POQM_MT000001UV.Custodian"/>
 *         &lt;element name="verifier" type="{urn:hl7-org:v3}POQM_MT000001UV.Verifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participant" type="{urn:hl7-org:v3}POQM_MT000001UV.Participant2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedDocument" type="{urn:hl7-org:v3}POQM_MT000001UV.RelatedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}POQM_MT000001UV.Subject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="controlVariable" type="{urn:hl7-org:v3}POQM_MT000001UV.ControlVariable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentOf" type="{urn:hl7-org:v3}POQM_MT000001UV.Component" minOccurs="0"/>
 *         &lt;element name="component" type="{urn:hl7-org:v3}POQM_MT000001UV.Component2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="DOC" />
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POQM_MT000001UV.QualityMeasureDocument", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "text",
    "statusCode",
    "effectiveTime",
    "availabilityTime",
    "languageCode",
    "setId",
    "versionNumber",
    "author",
    "custodian",
    "verifier",
    "participant",
    "relatedDocument",
    "subjectOf",
    "controlVariable",
    "componentOf",
    "component"
})
public class POQMMT000001UVQualityMeasureDocument {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CE code;
    @XmlElement(required = true)
    protected ST title;
    protected ED text;
    @XmlElement(required = true)
    protected CS statusCode;
    protected IVLTS effectiveTime;
    protected TS availabilityTime;
    protected CE languageCode;
    @XmlElement(required = true)
    protected II setId;
    @XmlElement(required = true)
    protected INT versionNumber;
    @XmlElement(required = true)
    protected List<POQMMT000001UVAuthor> author;
    @XmlElement(required = true)
    protected POQMMT000001UVCustodian custodian;
    protected List<POQMMT000001UVVerifier> verifier;
    protected List<POQMMT000001UVParticipant2> participant;
    protected List<POQMMT000001UVRelatedDocument> relatedDocument;
    protected List<POQMMT000001UVSubject> subjectOf;
    protected List<POQMMT000001UVControlVariable> controlVariable;
    protected POQMMT000001UVComponent componentOf;
    protected List<POQMMT000001UVComponent2> component;
    @XmlAttribute
    protected ActClass classCode;
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
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTitle(ST value) {
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
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
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
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setSetId(II value) {
        this.setId = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setVersionNumber(INT value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVAuthor }
     * 
     * 
     */
    public List<POQMMT000001UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<POQMMT000001UVAuthor>();
        }
        return this.author;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVCustodian }
     *     
     */
    public POQMMT000001UVCustodian getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVCustodian }
     *     
     */
    public void setCustodian(POQMMT000001UVCustodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVVerifier }
     * 
     * 
     */
    public List<POQMMT000001UVVerifier> getVerifier() {
        if (verifier == null) {
            verifier = new ArrayList<POQMMT000001UVVerifier>();
        }
        return this.verifier;
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
     * {@link POQMMT000001UVParticipant2 }
     * 
     * 
     */
    public List<POQMMT000001UVParticipant2> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<POQMMT000001UVParticipant2>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the relatedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVRelatedDocument }
     * 
     * 
     */
    public List<POQMMT000001UVRelatedDocument> getRelatedDocument() {
        if (relatedDocument == null) {
            relatedDocument = new ArrayList<POQMMT000001UVRelatedDocument>();
        }
        return this.relatedDocument;
    }

    /**
     * Gets the value of the subjectOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVSubject }
     * 
     * 
     */
    public List<POQMMT000001UVSubject> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<POQMMT000001UVSubject>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the controlVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVControlVariable }
     * 
     * 
     */
    public List<POQMMT000001UVControlVariable> getControlVariable() {
        if (controlVariable == null) {
            controlVariable = new ArrayList<POQMMT000001UVControlVariable>();
        }
        return this.controlVariable;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000001UVComponent }
     *     
     */
    public POQMMT000001UVComponent getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000001UVComponent }
     *     
     */
    public void setComponentOf(POQMMT000001UVComponent value) {
        this.componentOf = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POQMMT000001UVComponent2 }
     * 
     * 
     */
    public List<POQMMT000001UVComponent2> getComponent() {
        if (component == null) {
            component = new ArrayList<POQMMT000001UVComponent2>();
        }
        return this.component;
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
        if (classCode == null) {
            return ActClass.DOC;
        } else {
            return classCode;
        }
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
