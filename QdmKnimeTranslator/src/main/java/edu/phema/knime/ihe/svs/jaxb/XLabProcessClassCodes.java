//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for x_LabProcessClassCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabProcessClassCodes">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="ACSN"/>
 *     &lt;enumeration value="CONTREG"/>
 *     &lt;enumeration value="PROC"/>
 *     &lt;enumeration value="SPCTRT"/>
 *     &lt;enumeration value="TRNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum XLabProcessClassCodes {

    ACSN,
    CONTREG,
    PROC,
    SPCTRT,
    TRNS;

    public String value() {
        return name();
    }

    public static XLabProcessClassCodes fromValue(String v) {
        return valueOf(v);
    }

}
