//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ActNonObservationIndicationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActNonObservationIndicationCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="IND02"/>
 *     &lt;enumeration value="IND01"/>
 *     &lt;enumeration value="IND05"/>
 *     &lt;enumeration value="IND03"/>
 *     &lt;enumeration value="IND04"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActNonObservationIndicationCode {

    @XmlEnumValue("IND02")
    IND_02("IND02"),
    @XmlEnumValue("IND01")
    IND_01("IND01"),
    @XmlEnumValue("IND05")
    IND_05("IND05"),
    @XmlEnumValue("IND03")
    IND_03("IND03"),
    @XmlEnumValue("IND04")
    IND_04("IND04");
    private final String value;

    ActNonObservationIndicationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActNonObservationIndicationCode fromValue(String v) {
        for (ActNonObservationIndicationCode c: ActNonObservationIndicationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}