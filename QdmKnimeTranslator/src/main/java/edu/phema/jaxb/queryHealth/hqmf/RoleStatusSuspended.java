//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for RoleStatusSuspended.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleStatusSuspended">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RoleStatusSuspended {

    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    RoleStatusSuspended(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleStatusSuspended fromValue(String v) {
        for (RoleStatusSuspended c: RoleStatusSuspended.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}