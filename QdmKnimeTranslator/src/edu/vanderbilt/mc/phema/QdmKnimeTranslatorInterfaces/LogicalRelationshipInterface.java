package edu.vanderbilt.mc.phema.QdmKnimeTranslatorInterfaces;

public interface LogicalRelationshipInterface extends NodeInterface {
	public static enum EntityLevel {patient, event};
	public static enum LogicalTypeCode {AND, OR, AND_NOT};
	void setLeftId (String element_id);
	void setRightId (String element_id);
	void setLogicalTypeCode(LogicalTypeCode typeCode);
	LogicalTypeCode getLogicalTypeCode();
	String getOutputElementId(int port);  // null if it is patient level data?
	EntityLevel getOutputEntityLevel(int port);
}
