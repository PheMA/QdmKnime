//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 01:40:43 PM EST 
//


package edu.phema.jaxb.uvqm.hl7v3;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ActRelationshipHasExplanation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipHasExplanation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActRelationshipHasExplanation {

    EXPL;

    public String value() {
        return name();
    }

    public static ActRelationshipHasExplanation fromValue(String v) {
        return valueOf(v);
    }

}