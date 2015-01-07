//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for EntityNamePartQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNamePartQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TITLE"/>
 *     &lt;enumeration value="VV"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="FRM"/>
 *     &lt;enumeration value="INV"/>
 *     &lt;enumeration value="SCI"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="TMK"/>
 *     &lt;enumeration value="USE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EntityNamePartQualifier {

    AC,
    AD,
    BR,
    CL,
    IN,
    LS,
    NB,
    PR,
    SP,
    TITLE,
    VV,
    CON,
    DEV,
    FRM,
    INV,
    SCI,
    STR,
    TMK,
    USE;

    public String value() {
        return name();
    }

    public static EntityNamePartQualifier fromValue(String v) {
        return valueOf(v);
    }

}