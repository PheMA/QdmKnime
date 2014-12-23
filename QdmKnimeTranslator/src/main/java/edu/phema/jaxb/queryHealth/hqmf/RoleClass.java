//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.23 at 03:59:37 PM EST 
//


package edu.phema.jaxb.queryHealth.hqmf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for RoleClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClass">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="CRED"/>
 *     &lt;enumeration value="NURPRAC"/>
 *     &lt;enumeration value="NURS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="ROL"/>
 *     &lt;enumeration value="CAREGIVER"/>
 *     &lt;enumeration value="PRS"/>
 *     &lt;enumeration value="EQUIV"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="INST"/>
 *     &lt;enumeration value="SUBS"/>
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="EXPAGTCAR"/>
 *     &lt;enumeration value="INGR"/>
 *     &lt;enumeration value="LOCE"/>
 *     &lt;enumeration value="MBR"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="SPEC"/>
 *     &lt;enumeration value="ACCESS"/>
 *     &lt;enumeration value="ADJY"/>
 *     &lt;enumeration value="ADMM"/>
 *     &lt;enumeration value="BIRTHPL"/>
 *     &lt;enumeration value="DEATHPLC"/>
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="EXPR"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="HLTHCHRT"/>
 *     &lt;enumeration value="IDENT"/>
 *     &lt;enumeration value="MANU"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="OWN"/>
 *     &lt;enumeration value="RGPR"/>
 *     &lt;enumeration value="SDLOC"/>
 *     &lt;enumeration value="TERR"/>
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="WRTE"/>
 *     &lt;enumeration value="AFFL"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="CIT"/>
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="CRINV"/>
 *     &lt;enumeration value="CRSPNSR"/>
 *     &lt;enumeration value="EMP"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="INVSBJ"/>
 *     &lt;enumeration value="LIC"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PAYEE"/>
 *     &lt;enumeration value="PAYOR"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="QUAL"/>
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="UNDWRT"/>
 *     &lt;enumeration value="ACTIB"/>
 *     &lt;enumeration value="ACTIM"/>
 *     &lt;enumeration value="ACTIR"/>
 *     &lt;enumeration value="CONC"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="GUARD"/>
 *     &lt;enumeration value="COMPAR"/>
 *     &lt;enumeration value="SGNOFF"/>
 *     &lt;enumeration value="ECON"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="BOND"/>
 *     &lt;enumeration value="CONY"/>
 *     &lt;enumeration value="CLAIM"/>
 *     &lt;enumeration value="NAMED"/>
 *     &lt;enumeration value="PROG"/>
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="MIL"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SUBY"/>
 *     &lt;enumeration value="EXPVECTOR"/>
 *     &lt;enumeration value="FOMITE"/>
 *     &lt;enumeration value="GRIC"/>
 *     &lt;enumeration value="COLR"/>
 *     &lt;enumeration value="FLVR"/>
 *     &lt;enumeration value="PRSV"/>
 *     &lt;enumeration value="STBL"/>
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="ADJV"/>
 *     &lt;enumeration value="ADTV"/>
 *     &lt;enumeration value="BASE"/>
 *     &lt;enumeration value="IACT"/>
 *     &lt;enumeration value="MECH"/>
 *     &lt;enumeration value="CASEBJ"/>
 *     &lt;enumeration value="RESBJ"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="STOR"/>
 *     &lt;enumeration value="THER"/>
 *     &lt;enumeration value="DEPEN"/>
 *     &lt;enumeration value="INDIV"/>
 *     &lt;enumeration value="SUBSCR"/>
 *     &lt;enumeration value="ACTM"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="ISDLOC"/>
 *     &lt;enumeration value="ALQT"/>
 *     &lt;enumeration value="ISLT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RoleClass {

    CHILD,
    CRED,
    NURPRAC,
    NURS,
    PA,
    PHYS,
    ROL,
    CAREGIVER,
    PRS,
    EQUIV,
    GEN,
    INST,
    SUBS,
    CONT,
    EXPAGTCAR,
    INGR,
    LOCE,
    MBR,
    PART,
    SPEC,
    ACCESS,
    ADJY,
    ADMM,
    BIRTHPL,
    DEATHPLC,
    DST,
    EXPR,
    HLD,
    HLTHCHRT,
    IDENT,
    MANU,
    MNT,
    OWN,
    RGPR,
    SDLOC,
    TERR,
    USED,
    WRTE,
    AFFL,
    AGNT,
    CIT,
    COVPTY,
    CRINV,
    CRSPNSR,
    EMP,
    GUAR,
    INVSBJ,
    LIC,
    PAT,
    PAYEE,
    PAYOR,
    POLHOLD,
    QUAL,
    SPNSR,
    STD,
    UNDWRT,
    ACTIB,
    ACTIM,
    ACTIR,
    CONC,
    ASSIGNED,
    CON,
    GUARD,
    COMPAR,
    SGNOFF,
    ECON,
    NOK,
    BOND,
    CONY,
    CLAIM,
    NAMED,
    PROG,
    RET,
    MIL,
    SAME,
    SUBY,
    EXPVECTOR,
    FOMITE,
    GRIC,
    COLR,
    FLVR,
    PRSV,
    STBL,
    ACTI,
    ADJV,
    ADTV,
    BASE,
    IACT,
    MECH,
    CASEBJ,
    RESBJ,
    NOT,
    PROV,
    STOR,
    THER,
    DEPEN,
    INDIV,
    SUBSCR,
    ACTM,
    DSDLOC,
    ISDLOC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClass fromValue(String v) {
        return valueOf(v);
    }

}
