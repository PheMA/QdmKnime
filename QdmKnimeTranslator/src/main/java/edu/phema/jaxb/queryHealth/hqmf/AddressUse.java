//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for AddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressUse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="CONF"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="WP"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="PST"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="HV"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="PUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AddressUse {

    BAD,
    CONF,
    H,
    TMP,
    WP,
    PHYS,
    PST,
    AS,
    EC,
    MC,
    PG,
    HP,
    HV,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static AddressUse fromValue(String v) {
        return valueOf(v);
    }

}