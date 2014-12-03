package edu.vanderbilt.mc.phema.QdmKnimeTranslatorInterfaces;

public interface TemporalRelationshipInterface extends NodeInterface {
	public static enum Unit {
		seconds, minutes, hours, days, weeks, months, years
	};
	public static enum Operator {
		equalTo, greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo
	};
	public static enum TemporalTypeCode {
		CONCURRENT, DURING, EAE, EAS, EBE, EBS, ECW, ECWS, EDU, OVERLAP, SAE, SAS, SBE, SBS, SCW, SCWE, SDU		
	};
	void setLeftId (String element_id);
	void setRightId (String element_id);
	void setTemporalTypeCode (TemporalTypeCode typeCode);
	String getLeftId ();  // QDM data element ID
	String getRightId();
	void setOperator(Operator operator);
	void setQuantity(float quantity);
	void setUnit(Unit unit);
}

