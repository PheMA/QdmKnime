//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_MO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_MO">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ihe:iti:svs:2008}SXCM_MO">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:ihe:iti:svs:2008}IVXB_MO"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:ihe:iti:svs:2008}MO" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:ihe:iti:svs:2008}IVXB_MO" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:ihe:iti:svs:2008}IVXB_MO"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:ihe:iti:svs:2008}MO"/>
 *           &lt;element name="high" type="{urn:ihe:iti:svs:2008}IVXB_MO" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:ihe:iti:svs:2008}MO"/>
 *           &lt;element name="width" type="{urn:ihe:iti:svs:2008}MO" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_MO", propOrder = {
    "rest"
})
public class IVLMO
    extends SXCMMO
{

    @XmlElementRefs({
        @XmlElementRef(name = "high", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "center", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "low", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class),
        @XmlElementRef(name = "width", namespace = "urn:ihe:iti:svs:2008", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends MO>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "High" is used by two different parts of a schema. See: 
     * line 1003 of file:/home/moh/git/QdmKnime/QdmKnimeTranslator/src/main/resources/epsos-common-components-cee4b42409a7/ihe-profiles/src/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * line 994 of file:/home/moh/git/QdmKnime/QdmKnimeTranslator/src/main/resources/epsos-common-components-cee4b42409a7/ihe-profiles/src/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}
     * {@link JAXBElement }{@code <}{@link MO }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}
     * {@link JAXBElement }{@code <}{@link MO }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends MO>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends MO>>();
        }
        return this.rest;
    }

}
