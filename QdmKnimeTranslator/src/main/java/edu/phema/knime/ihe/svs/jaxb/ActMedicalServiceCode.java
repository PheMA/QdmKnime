//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActMedicalServiceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicalServiceCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="ALC"/>
 *     &lt;enumeration value="CARD"/>
 *     &lt;enumeration value="CHR"/>
 *     &lt;enumeration value="DNTL"/>
 *     &lt;enumeration value="DRGRHB"/>
 *     &lt;enumeration value="GENRL"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="OBS"/>
 *     &lt;enumeration value="ONC"/>
 *     &lt;enumeration value="PALL"/>
 *     &lt;enumeration value="PED"/>
 *     &lt;enumeration value="PHAR"/>
 *     &lt;enumeration value="PHYRHB"/>
 *     &lt;enumeration value="PSYCH"/>
 *     &lt;enumeration value="SURG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActMedicalServiceCode {

    ALC,
    CARD,
    CHR,
    DNTL,
    DRGRHB,
    GENRL,
    MED,
    OBS,
    ONC,
    PALL,
    PED,
    PHAR,
    PHYRHB,
    PSYCH,
    SURG;

    public String value() {
        return name();
    }

    public static ActMedicalServiceCode fromValue(String v) {
        return valueOf(v);
    }

}
