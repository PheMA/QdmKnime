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
 * <p>Java class for TableCellVerticalAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TableCellVerticalAlign">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="baseline"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="middle"/>
 *     &lt;enumeration value="top"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TableCellVerticalAlign {

    @XmlEnumValue("baseline")
    BASELINE("baseline"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("top")
    TOP("top");
    private final String value;

    TableCellVerticalAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableCellVerticalAlign fromValue(String v) {
        for (TableCellVerticalAlign c: TableCellVerticalAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}