//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.03 at 05:11:47 PM CST 
//


package edu.vanderbilt.phema.knime.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entry-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entry-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xstring"/>
 *     &lt;enumeration value="xint"/>
 *     &lt;enumeration value="xdouble"/>
 *     &lt;enumeration value="xfloat"/>
 *     &lt;enumeration value="xboolean"/>
 *     &lt;enumeration value="xbyte"/>
 *     &lt;enumeration value="xchar"/>
 *     &lt;enumeration value="xlong"/>
 *     &lt;enumeration value="xshort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entry-type")
@XmlEnum
public enum EntryType {

    @XmlEnumValue("xstring")
    XSTRING("xstring"),
    @XmlEnumValue("xint")
    XINT("xint"),
    @XmlEnumValue("xdouble")
    XDOUBLE("xdouble"),
    @XmlEnumValue("xfloat")
    XFLOAT("xfloat"),
    @XmlEnumValue("xboolean")
    XBOOLEAN("xboolean"),
    @XmlEnumValue("xbyte")
    XBYTE("xbyte"),
    @XmlEnumValue("xchar")
    XCHAR("xchar"),
    @XmlEnumValue("xlong")
    XLONG("xlong"),
    @XmlEnumValue("xshort")
    XSHORT("xshort");
    private final String value;

    EntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryType fromValue(String v) {
        for (EntryType c: EntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}