//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HXIT_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HXIT_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}PQ">
 *       &lt;sequence>
 *         &lt;element name="validTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="controlInformationExtension" type="{urn:hl7-org:v3}st" />
 *       &lt;attribute name="controlInformationRoot" type="{urn:hl7-org:v3}uid" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HXIT_PQ", propOrder = {
    "validTime"
})
public class HXITPQ
    extends PQ
{

    protected IVLTS validTime;
    @XmlAttribute
    protected String controlInformationExtension;
    @XmlAttribute
    protected String controlInformationRoot;

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setValidTime(IVLTS value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the controlInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInformationExtension() {
        return controlInformationExtension;
    }

    /**
     * Sets the value of the controlInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInformationExtension(String value) {
        this.controlInformationExtension = value;
    }

    /**
     * Gets the value of the controlInformationRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInformationRoot() {
        return controlInformationRoot;
    }

    /**
     * Sets the value of the controlInformationRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInformationRoot(String value) {
        this.controlInformationRoot = value;
    }

}
