//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for TherapeuticProductDetectedIssueCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TherapeuticProductDetectedIssueCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="TPROD"/>
 *     &lt;enumeration value="DRG"/>
 *     &lt;enumeration value="NHP"/>
 *     &lt;enumeration value="NONRX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TherapeuticProductDetectedIssueCode {

    TPROD,
    DRG,
    NHP,
    NONRX;

    public String value() {
        return name();
    }

    public static TherapeuticProductDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
