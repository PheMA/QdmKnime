//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SirenikskiYupik.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SirenikskiYupik">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="x-ESU"/>
 *     &lt;enumeration value="x-ESS"/>
 *     &lt;enumeration value="x-EMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SirenikskiYupik {

    @XmlEnumValue("x-ESU")
    X_ESU("x-ESU"),
    @XmlEnumValue("x-ESS")
    X_ESS("x-ESS"),
    @XmlEnumValue("x-EMS")
    X_EMS("x-EMS");
    private final String value;

    SirenikskiYupik(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SirenikskiYupik fromValue(String v) {
        for (SirenikskiYupik c: SirenikskiYupik.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
