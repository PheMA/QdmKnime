//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ActStatusSuspended.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActStatusSuspended">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActStatusSuspended {

    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    ActStatusSuspended(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActStatusSuspended fromValue(String v) {
        for (ActStatusSuspended c: ActStatusSuspended.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}