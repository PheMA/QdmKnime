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
 * <p>Java class for x_PhoneOrEmailURLScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PhoneOrEmailURLScheme">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="mailto"/>
 *     &lt;enumeration value="tel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum XPhoneOrEmailURLScheme {

    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    @XmlEnumValue("tel")
    TEL("tel");
    private final String value;

    XPhoneOrEmailURLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPhoneOrEmailURLScheme fromValue(String v) {
        for (XPhoneOrEmailURLScheme c: XPhoneOrEmailURLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
