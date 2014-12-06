package edu.vanderbilt.phema.QdmKnimeInterfaces;

import edu.vanderbilt.phema.knime.exceptions.SetUpIncompleteException;

public interface LogicalRelationshipInterface extends NodeInterface {
	public static enum EntityLevel {patient, event};
	public static enum LogicalTypeCode {AND, OR, AND_NOT};
	void setLeftId (int element_node_id);
	void setRightId (int element_node_id);
	void setLogicalTypeCode(LogicalTypeCode typeCode);
	LogicalTypeCode getLogicalTypeCode();
	int getOutputElementId(int port) throws IndexOutOfBoundsException, SetUpIncompleteException;  // null if it is patient level data?
	EntityLevel getOutputEntityLevel(int port) throws IndexOutOfBoundsException, SetUpIncompleteException;
}
