//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 03:09:44 PM CST 
//


package edu.phema.jaxb.ihe.svs;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActInformationCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationCategoryCode">
 *   &lt;restriction base="{urn:ihe:iti:svs:2008}cs">
 *     &lt;enumeration value="ALLGCAT"/>
 *     &lt;enumeration value="COBSCAT"/>
 *     &lt;enumeration value="DEMOCAT"/>
 *     &lt;enumeration value="DICAT"/>
 *     &lt;enumeration value="IMMUCAT"/>
 *     &lt;enumeration value="LABCAT"/>
 *     &lt;enumeration value="MEDCCAT"/>
 *     &lt;enumeration value="RXCAT"/>
 *     &lt;enumeration value="PSVCCAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActInformationCategoryCode {

    ALLGCAT,
    COBSCAT,
    DEMOCAT,
    DICAT,
    IMMUCAT,
    LABCAT,
    MEDCCAT,
    RXCAT,
    PSVCCAT;

    public String value() {
        return name();
    }

    public static ActInformationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}