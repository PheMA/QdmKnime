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
 * <p>Java class for ActMoodPredicate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodPredicate">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CRT"/>
 *     &lt;enumeration value="EVN.CRT"/>
 *     &lt;enumeration value="GOL.CRT"/>
 *     &lt;enumeration value="INT.CRT"/>
 *     &lt;enumeration value="PRMS.CRT"/>
 *     &lt;enumeration value="RQO.CRT"/>
 *     &lt;enumeration value="RSK.CRT"/>
 *     &lt;enumeration value="EXPEC"/>
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="RSK"/>
 *     &lt;enumeration value="OPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActMoodPredicate {

    CRT("CRT"),
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    @XmlEnumValue("GOL.CRT")
    GOL_CRT("GOL.CRT"),
    @XmlEnumValue("INT.CRT")
    INT_CRT("INT.CRT"),
    @XmlEnumValue("PRMS.CRT")
    PRMS_CRT("PRMS.CRT"),
    @XmlEnumValue("RQO.CRT")
    RQO_CRT("RQO.CRT"),
    @XmlEnumValue("RSK.CRT")
    RSK_CRT("RSK.CRT"),
    EXPEC("EXPEC"),
    GOL("GOL"),
    RSK("RSK"),
    OPT("OPT");
    private final String value;

    ActMoodPredicate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActMoodPredicate fromValue(String v) {
        for (ActMoodPredicate c: ActMoodPredicate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}