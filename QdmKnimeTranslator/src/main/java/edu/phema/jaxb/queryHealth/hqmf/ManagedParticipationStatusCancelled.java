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
 * <p>Java class for ManagedParticipationStatusCancelled.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedParticipationStatusCancelled">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ManagedParticipationStatusCancelled {

    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    ManagedParticipationStatusCancelled(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagedParticipationStatusCancelled fromValue(String v) {
        for (ManagedParticipationStatusCancelled c: ManagedParticipationStatusCancelled.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
