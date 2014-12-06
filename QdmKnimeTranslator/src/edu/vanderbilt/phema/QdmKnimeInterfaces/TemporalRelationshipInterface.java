package edu.vanderbilt.phema.QdmKnimeInterfaces;

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
	void setLeftId (int element_node_id);
	void setRightId (int element_node_id);
	void setTemporalTypeCode (TemporalTypeCode typeCode);
	int getLeftId ();  // QDM data element node ID
	int getRightId();
	void setOperator(Operator operator);
	void setQuantity(float quantity);
	void setUnit(Unit unit);
}

