//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POQM_MT000002UV.EmploymentParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POQM_MT000002UV.EmploymentParticipant">
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
 *         &lt;element name="jobCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="jobTitleName" type="{urn:hl7-org:v3}SC" minOccurs="0"/>
 *         &lt;element name="jobClassCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="occupationCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="salaryTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="salaryQuantity" type="{urn:hl7-org:v3}MO" minOccurs="0"/>
 *         &lt;element name="hazardExposureText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="protectiveEquipmentText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="employeeContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="employeeManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="employeeDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="employeePerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="employeeNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="employeeEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="employeeMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="employeeOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="employeePlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="employerContainer" type="{urn:hl7-org:v3}POQM_MT000002UV.Container" minOccurs="0"/>
 *           &lt;element name="employerManufacturedMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.ManufacturedMaterial" minOccurs="0"/>
 *           &lt;element name="employerDevice" type="{urn:hl7-org:v3}POQM_MT000002UV.Device" minOccurs="0"/>
 *           &lt;element name="employerPerson" type="{urn:hl7-org:v3}POQM_MT000002UV.Person" minOccurs="0"/>
 *           &lt;element name="employerNonPersonLivingSubject" type="{urn:hl7-org:v3}POQM_MT000002UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;element name="employerEntity" type="{urn:hl7-org:v3}POQM_MT000002UV.Entity" minOccurs="0"/>
 *           &lt;element name="employerMaterial" type="{urn:hl7-org:v3}POQM_MT000002UV.Material" minOccurs="0"/>
 *           &lt;element name="employerOrganization" type="{urn:hl7-org:v3}POQM_MT000002UV.Organization" minOccurs="0"/>
 *           &lt;element name="employerPlace" type="{urn:hl7-org:v3}POQM_MT000002UV.Place" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="sourceOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetOf" type="{urn:hl7-org:v3}POQM_MT000002UV.SourceOf4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClass" />
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
@XmlType(name = "POQM_MT000002UV.EmploymentParticipant", propOrder = {
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
    "jobCode",
    "jobTitleName",
    "jobClassCode",
    "occupationCode",
    "salaryTypeCode",
    "salaryQuantity",
    "hazardExposureText",
    "protectiveEquipmentText",
    "employeeContainer",
    "employeeManufacturedMaterial",
    "employeeDevice",
    "employeePerson",
    "employeeNonPersonLivingSubject",
    "employeeEntity",
    "employeeMaterial",
    "employeeOrganization",
    "employeePlace",
    "employerContainer",
    "employerManufacturedMaterial",
    "employerDevice",
    "employerPerson",
    "employerNonPersonLivingSubject",
    "employerEntity",
    "employerMaterial",
    "employerOrganization",
    "employerPlace",
    "sourceOf",
    "targetOf"
})
public class POQMMT000002UVEmploymentParticipant {

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
    protected CE jobCode;
    protected SC jobTitleName;
    protected CE jobClassCode;
    protected CE occupationCode;
    protected CE salaryTypeCode;
    protected MO salaryQuantity;
    protected ED hazardExposureText;
    protected ED protectiveEquipmentText;
    protected POQMMT000002UVContainer employeeContainer;
    protected POQMMT000002UVManufacturedMaterial employeeManufacturedMaterial;
    protected POQMMT000002UVDevice employeeDevice;
    protected POQMMT000002UVPerson employeePerson;
    protected POQMMT000002UVNonPersonLivingSubject employeeNonPersonLivingSubject;
    protected POQMMT000002UVEntity employeeEntity;
    protected POQMMT000002UVMaterial employeeMaterial;
    protected POQMMT000002UVOrganization employeeOrganization;
    protected POQMMT000002UVPlace employeePlace;
    protected POQMMT000002UVContainer employerContainer;
    protected POQMMT000002UVManufacturedMaterial employerManufacturedMaterial;
    protected POQMMT000002UVDevice employerDevice;
    protected POQMMT000002UVPerson employerPerson;
    protected POQMMT000002UVNonPersonLivingSubject employerNonPersonLivingSubject;
    protected POQMMT000002UVEntity employerEntity;
    protected POQMMT000002UVMaterial employerMaterial;
    protected POQMMT000002UVOrganization employerOrganization;
    protected POQMMT000002UVPlace employerPlace;
    protected List<POQMMT000002UVSourceOf3> sourceOf;
    protected List<POQMMT000002UVSourceOf4> targetOf;
    @XmlAttribute(required = true)
    protected RoleClass classCode;
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
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setJobCode(CE value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the jobTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getJobTitleName() {
        return jobTitleName;
    }

    /**
     * Sets the value of the jobTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setJobTitleName(SC value) {
        this.jobTitleName = value;
    }

    /**
     * Gets the value of the jobClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getJobClassCode() {
        return jobClassCode;
    }

    /**
     * Sets the value of the jobClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setJobClassCode(CE value) {
        this.jobClassCode = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setOccupationCode(CE value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the salaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getSalaryTypeCode() {
        return salaryTypeCode;
    }

    /**
     * Sets the value of the salaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setSalaryTypeCode(CE value) {
        this.salaryTypeCode = value;
    }

    /**
     * Gets the value of the salaryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MO }
     *     
     */
    public MO getSalaryQuantity() {
        return salaryQuantity;
    }

    /**
     * Sets the value of the salaryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MO }
     *     
     */
    public void setSalaryQuantity(MO value) {
        this.salaryQuantity = value;
    }

    /**
     * Gets the value of the hazardExposureText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getHazardExposureText() {
        return hazardExposureText;
    }

    /**
     * Sets the value of the hazardExposureText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setHazardExposureText(ED value) {
        this.hazardExposureText = value;
    }

    /**
     * Gets the value of the protectiveEquipmentText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getProtectiveEquipmentText() {
        return protectiveEquipmentText;
    }

    /**
     * Sets the value of the protectiveEquipmentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setProtectiveEquipmentText(ED value) {
        this.protectiveEquipmentText = value;
    }

    /**
     * Gets the value of the employeeContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getEmployeeContainer() {
        return employeeContainer;
    }

    /**
     * Sets the value of the employeeContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setEmployeeContainer(POQMMT000002UVContainer value) {
        this.employeeContainer = value;
    }

    /**
     * Gets the value of the employeeManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getEmployeeManufacturedMaterial() {
        return employeeManufacturedMaterial;
    }

    /**
     * Sets the value of the employeeManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setEmployeeManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.employeeManufacturedMaterial = value;
    }

    /**
     * Gets the value of the employeeDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getEmployeeDevice() {
        return employeeDevice;
    }

    /**
     * Sets the value of the employeeDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setEmployeeDevice(POQMMT000002UVDevice value) {
        this.employeeDevice = value;
    }

    /**
     * Gets the value of the employeePerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getEmployeePerson() {
        return employeePerson;
    }

    /**
     * Sets the value of the employeePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setEmployeePerson(POQMMT000002UVPerson value) {
        this.employeePerson = value;
    }

    /**
     * Gets the value of the employeeNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getEmployeeNonPersonLivingSubject() {
        return employeeNonPersonLivingSubject;
    }

    /**
     * Sets the value of the employeeNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setEmployeeNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.employeeNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the employeeEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getEmployeeEntity() {
        return employeeEntity;
    }

    /**
     * Sets the value of the employeeEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setEmployeeEntity(POQMMT000002UVEntity value) {
        this.employeeEntity = value;
    }

    /**
     * Gets the value of the employeeMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getEmployeeMaterial() {
        return employeeMaterial;
    }

    /**
     * Sets the value of the employeeMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setEmployeeMaterial(POQMMT000002UVMaterial value) {
        this.employeeMaterial = value;
    }

    /**
     * Gets the value of the employeeOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getEmployeeOrganization() {
        return employeeOrganization;
    }

    /**
     * Sets the value of the employeeOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setEmployeeOrganization(POQMMT000002UVOrganization value) {
        this.employeeOrganization = value;
    }

    /**
     * Gets the value of the employeePlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getEmployeePlace() {
        return employeePlace;
    }

    /**
     * Sets the value of the employeePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setEmployeePlace(POQMMT000002UVPlace value) {
        this.employeePlace = value;
    }

    /**
     * Gets the value of the employerContainer property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public POQMMT000002UVContainer getEmployerContainer() {
        return employerContainer;
    }

    /**
     * Sets the value of the employerContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVContainer }
     *     
     */
    public void setEmployerContainer(POQMMT000002UVContainer value) {
        this.employerContainer = value;
    }

    /**
     * Gets the value of the employerManufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public POQMMT000002UVManufacturedMaterial getEmployerManufacturedMaterial() {
        return employerManufacturedMaterial;
    }

    /**
     * Sets the value of the employerManufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVManufacturedMaterial }
     *     
     */
    public void setEmployerManufacturedMaterial(POQMMT000002UVManufacturedMaterial value) {
        this.employerManufacturedMaterial = value;
    }

    /**
     * Gets the value of the employerDevice property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public POQMMT000002UVDevice getEmployerDevice() {
        return employerDevice;
    }

    /**
     * Sets the value of the employerDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVDevice }
     *     
     */
    public void setEmployerDevice(POQMMT000002UVDevice value) {
        this.employerDevice = value;
    }

    /**
     * Gets the value of the employerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public POQMMT000002UVPerson getEmployerPerson() {
        return employerPerson;
    }

    /**
     * Sets the value of the employerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPerson }
     *     
     */
    public void setEmployerPerson(POQMMT000002UVPerson value) {
        this.employerPerson = value;
    }

    /**
     * Gets the value of the employerNonPersonLivingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public POQMMT000002UVNonPersonLivingSubject getEmployerNonPersonLivingSubject() {
        return employerNonPersonLivingSubject;
    }

    /**
     * Sets the value of the employerNonPersonLivingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVNonPersonLivingSubject }
     *     
     */
    public void setEmployerNonPersonLivingSubject(POQMMT000002UVNonPersonLivingSubject value) {
        this.employerNonPersonLivingSubject = value;
    }

    /**
     * Gets the value of the employerEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public POQMMT000002UVEntity getEmployerEntity() {
        return employerEntity;
    }

    /**
     * Sets the value of the employerEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVEntity }
     *     
     */
    public void setEmployerEntity(POQMMT000002UVEntity value) {
        this.employerEntity = value;
    }

    /**
     * Gets the value of the employerMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public POQMMT000002UVMaterial getEmployerMaterial() {
        return employerMaterial;
    }

    /**
     * Sets the value of the employerMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVMaterial }
     *     
     */
    public void setEmployerMaterial(POQMMT000002UVMaterial value) {
        this.employerMaterial = value;
    }

    /**
     * Gets the value of the employerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public POQMMT000002UVOrganization getEmployerOrganization() {
        return employerOrganization;
    }

    /**
     * Sets the value of the employerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVOrganization }
     *     
     */
    public void setEmployerOrganization(POQMMT000002UVOrganization value) {
        this.employerOrganization = value;
    }

    /**
     * Gets the value of the employerPlace property.
     * 
     * @return
     *     possible object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public POQMMT000002UVPlace getEmployerPlace() {
        return employerPlace;
    }

    /**
     * Sets the value of the employerPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link POQMMT000002UVPlace }
     *     
     */
    public void setEmployerPlace(POQMMT000002UVPlace value) {
        this.employerPlace = value;
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
     *     {@link RoleClass }
     *     
     */
    public RoleClass getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClass }
     *     
     */
    public void setClassCode(RoleClass value) {
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