//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.14 at 06:16:21 PM CST 
//


package edu.phema.knime.ihe.svs.jaxb;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActClassPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPolicy">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="POLICY"/>
 *     &lt;enumeration value="JURISPOL"/>
 *     &lt;enumeration value="ORGPOL"/>
 *     &lt;enumeration value="SCOPOL"/>
 *     &lt;enumeration value="STDPOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActClassPolicy {

    POLICY,
    JURISPOL,
    ORGPOL,
    SCOPOL,
    STDPOL;

    public String value() {
        return name();
    }

    public static ActClassPolicy fromValue(String v) {
        return valueOf(v);
    }

}
