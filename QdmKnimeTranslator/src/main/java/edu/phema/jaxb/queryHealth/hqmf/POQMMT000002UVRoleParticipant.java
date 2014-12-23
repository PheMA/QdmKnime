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
 * <p>Java class for POQM_MT000002UV.RoleParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000002UV.RoleParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="certificateText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}RTO_PQ_PQ" minOccurs="0"/>
 *         &lt;element name="positionNumber" type="{urn:hl7-org:v3}INT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="playingContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="playingManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="playingDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="playingPerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="playingNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="playingEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="playingMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="playingOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="playingPlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="scopingContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="scopingManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="scopingDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="scopingPerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="scopingNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="scopingEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="scopingMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="scopingOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="scopingPlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="sourceOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassRoot" />
 *       &lt;attribute name="negationInd" type="{urn:hl7-org:v3}bl" />
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POQM_MT000002UV.RoleParticipant", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "name",
    "addr",
    "telecom",
    "statusCode",
    "effectiveTime",
    "certificateText",
    "confidentialityCode",
    "quantity",
    "positionNumber",
    "playingContainer",
    "playingManufacturedMaterial",
    "playingDevice",
    "playingPerson",
    "playingNonPersonLivingSubject",
    "playingEntity",
    "playingMaterial",
    "playingOrganization",
    "playingPlace",
    "scopingContainer",
    "scopingManufacturedMaterial",
    "scopingDevice",
    "scopingPerson",
    "scopingNonPersonLivingSubject",
    "scopingEntity",
    "scopingMaterial",
    "scopingOrganization",
    "scopingPlace",
    "sourceOf",
    "targetOf"
})
public class POQMMT000002UVRoleParticipant {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected CE code;
    protected List<EN> name;
    protected List<AD> addr;
    protected List<TEL> telecom;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    protected ED certificateText;
    protected List<CE> confidentialityCode;
    protected RTOPQPQ quantity;
    protected List<INT> positionNumber;
    protected POQMMT000002UVContainer playingContainer;
    protected POQMMT000002UVManufacturedMaterial playingManufacturedMaterial;
    protected POQMMT000002UVDevice playingDevice;
    protected POQMMT000002UVPerson playingPerson;
    protected POQMMT000002UVNonPersonLivingSubject playingNonPersonLivingSubject;
    protected POQMMT000002UVEntity playingEntity;
    protected POQMMT000002UVMaterial playingMaterial;
    protected POQMMT000002UVOrganization playingOrganization;
    protected POQMMT000002UVPlace playingPlace;
    protected POQMMT000002UVContainer scopingContainer;
    protected POQMMT000002UVManufacturedMaterial scopingManufacturedMaterial;
    protected POQMMT000002UVDevice scopingDevice;
    protected POQMMT000002UVPerson scopingPerson;
    protected POQMMT000002UVNonPersonLivingSubject scopingNonPersonLivingSubject;
    protected POQMMT000002UVEntity scopingEntity;
    protected POQMMT000002UVMaterial scopingMaterial;
    protected POQMMT000002UVOrganization scopingOrganization;
    protected POQMMT000002UVPlace scopingPlace;
    protected List<POQMMT000002UVSourceOf3> sourceOf;
    protected List<POQMMT000002UVSourceOf4> targetOf;
    @XmlAttribute(required = true)
    protected RoleClassRoot classCode;
    @XmlAttribute
    protected Boolean negationInd;
    @XmlAttribute
    protected NullFlavor nullFlavor;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EN }
     * 
     * 
     */
    public List<EN> getName() {
        if (name == null) {
            name = new ArrayList<EN>();
        }
        return this.name;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AD }
     * 
     * 
     */
    public List<AD> getAddr() {
        if (addr == null) {
            addr = new ArrayList<AD>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEL }
     * 
     * 
     */
    public List<TEL> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<TEL>();
        }
        return this.telecom;
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
     * Gets the value of the certificateText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getCertificateText() {
        return certificateText;
    }

    /**
     * Sets the value of the certificateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setCertificateText(ED value) {
        this.certificateText = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link RTOPQPQ }
     *     
     */
    public RTOPQPQ getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTOPQPQ }
     *     
     */
    public void setQuantity(RTOPQPQ value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INT }
     * 
     * 
     */
    public List<INT> getPositionNumber() {
        if (positionNumber == null) {
            positionNumber = new ArrayList<INT>();
        }
        return this.positionNumber;
    }

    /**
     * Gets the value of the playingContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getPlayingContainer() {
        return playingContainer;
    }

    /**
     * Sets the value of the playingContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setPlayingContainer(POQMMT000002UVContainer value) {
        this.playingContainer = value;
    }

    /**
     * Gets the value of the playingManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getPlayingManufacturedMaterial() {
        return playingManufacturedMaterial;
    }

    /**
     * Sets the value of the playingManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setPlayingManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.playingManufacturedMaterial = value;
    }

    /**
     * Gets the value of the playingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getPlayingDevice() {
        return playingDevice;
    }

    /**
     * Sets the value of the playingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setPlayingDevice(POQMMT000002UVDevice value) {
        this.playingDevice = value;
    }

    /**
     * Gets the value of the playingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getPlayingPerson() {
        return playingPerson;
    }

    /**
     * Sets the value of the playingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setPlayingPerson(POQMMT000002UVPerson value) {
        this.playingPerson = value;
    }

    /**
     * Gets the value of the playingNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getPlayingNonPersonLivingSubject() {
        return playingNonPersonLivingSubject;
    }

    /**
     * Sets the value of the playingNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setPlayingNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.playingNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the playingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getPlayingEntity() {
        return playingEntity;
    }

    /**
     * Sets the value of the playingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setPlayingEntity(POQMMT000002UVEntity value) {
        this.playingEntity = value;
    }

    /**
     * Gets the value of the playingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getPlayingMaterial() {
        return playingMaterial;
    }

    /**
     * Sets the value of the playingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setPlayingMaterial(POQMMT000002UVMaterial value) {
        this.playingMaterial = value;
    }

    /**
     * Gets the value of the playingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getPlayingOrganization() {
        return playingOrganization;
    }

    /**
     * Sets the value of the playingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setPlayingOrganization(POQMMT000002UVOrganization value) {
        this.playingOrganization = value;
    }

    /**
     * Gets the value of the playingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getPlayingPlace() {
        return playingPlace;
    }

    /**
     * Sets the value of the playingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setPlayingPlace(POQMMT000002UVPlace value) {
        this.playingPlace = value;
    }

    /**
     * Gets the value of the scopingContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getScopingContainer() {
        return scopingContainer;
    }

    /**
     * Sets the value of the scopingContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setScopingContainer(POQMMT000002UVContainer value) {
        this.scopingContainer = value;
    }

    /**
     * Gets the value of the scopingManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getScopingManufacturedMaterial() {
        return scopingManufacturedMaterial;
    }

    /**
     * Sets the value of the scopingManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setScopingManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.scopingManufacturedMaterial = value;
    }

    /**
     * Gets the value of the scopingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getScopingDevice() {
        return scopingDevice;
    }

    /**
     * Sets the value of the scopingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setScopingDevice(POQMMT000002UVDevice value) {
        this.scopingDevice = value;
    }

    /**
     * Gets the value of the scopingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getScopingPerson() {
        return scopingPerson;
    }

    /**
     * Sets the value of the scopingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setScopingPerson(POQMMT000002UVPerson value) {
        this.scopingPerson = value;
    }

    /**
     * Gets the value of the scopingNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getScopingNonPersonLivingSubject() {
        return scopingNonPersonLivingSubject;
    }

    /**
     * Sets the value of the scopingNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setScopingNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.scopingNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the scopingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getScopingEntity() {
        return scopingEntity;
    }

    /**
     * Sets the value of the scopingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setScopingEntity(POQMMT000002UVEntity value) {
        this.scopingEntity = value;
    }

    /**
     * Gets the value of the scopingMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getScopingMaterial() {
        return scopingMaterial;
    }

    /**
     * Sets the value of the scopingMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setScopingMaterial(POQMMT000002UVMaterial value) {
        this.scopingMaterial = value;
    }

    /**
     * Gets the value of the scopingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getScopingOrganization() {
        return scopingOrganization;
    }

    /**
     * Sets the value of the scopingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setScopingOrganization(POQMMT000002UVOrganization value) {
        this.scopingOrganization = value;
    }

    /**
     * Gets the value of the scopingPlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getScopingPlace() {
        return scopingPlace;
    }

    /**
     * Sets the value of the scopingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setScopingPlace(POQMMT000002UVPlace value) {
        this.scopingPlace = value;
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
     * {@link POQMMT000002UVSourceOf3 }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf3> getSourceOf() {
        if (sourceOf == null) {
            sourceOf = new ArrayList<POQMMT000002UVSourceOf3>();
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
     * {@link POQMMT000002UVSourceOf4 }
     * 
     * 
     */
    public List<POQMMT000002UVSourceOf4> getTargetOf() {
        if (targetOf == null) {
            targetOf = new ArrayList<POQMMT000002UVSourceOf4>();
        }
        return this.targetOf;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassRoot }
     *     
     */
    public RoleClassRoot getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassRoot }
     *     
     */
    public void setClassCode(RoleClassRoot value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the negationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegationInd() {
        return negationInd;
    }

    /**
     * Sets the value of the negationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

}
