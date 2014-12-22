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
 * <p>Java class for TableRuleStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TableRuleStyle">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="Botrule"/>
 *     &lt;enumeration value="Lrule"/>
 *     &lt;enumeration value="Rrule"/>
 *     &lt;enumeration value="Toprule"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TableRuleStyle {

    @XmlEnumValue("Botrule")
    BOTRULE("Botrule"),
    @XmlEnumValue("Lrule")
    LRULE("Lrule"),
    @XmlEnumValue("Rrule")
    RRULE("Rrule"),
    @XmlEnumValue("Toprule")
    TOPRULE("Toprule");
    private final String value;

    TableRuleStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableRuleStyle fromValue(String v) {
        for (TableRuleStyle c: TableRuleStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}