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
 * <p>Java class for Sahaptian.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Sahaptian">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="x-WAR"/>
 *     &lt;enumeration value="x-UMA"/>
 *     &lt;enumeration value="x-WAA"/>
 *     &lt;enumeration value="x-YAK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum Sahaptian {

    @XmlEnumValue("x-WAR")
    X_WAR("x-WAR"),
    @XmlEnumValue("x-UMA")
    X_UMA("x-UMA"),
    @XmlEnumValue("x-WAA")
    X_WAA("x-WAA"),
    @XmlEnumValue("x-YAK")
    X_YAK("x-YAK");
    private final String value;

    Sahaptian(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Sahaptian fromValue(String v) {
        for (Sahaptian c: Sahaptian.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}