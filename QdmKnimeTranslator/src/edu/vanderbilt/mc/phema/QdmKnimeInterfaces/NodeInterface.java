package edu.vanderbilt.mc.phema.QdmKnimeInterfaces;

import edu.vanderbilt.mc.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.mc.phema.knime.exceptions.WrittenAlreadyException;
import edu.vanderbilt.mc.phema.knime.jaxb.Config;


public interface NodeInterface {
	
	void setRoot(String dir) throws WrittenAlreadyException;
	void setId(int id) throws WrittenAlreadyException;  // serial number of nodes
	void setX(int x);
	void setY(int y);
	void setWidth(int width);
	void setHeight(int height);
	void setCustomDescription(String description) throws WrittenAlreadyException;

	void write() throws WrittenAlreadyException, SetUpIncompleteException;    // Execution, write files. Final step. After this step, the object should be write only
//	String getPmml();  // The PMML segment for KNIME work flow

	Config getKnimeWorkflowConfig() throws SetUpIncompleteException;
	
//	boolean isReadOnly();   // after write(), the node should be read only
	int getId();
	String getNodeKey();     // "node_10"
	int getNumberOfInPorts();    // 2 for temporalRelationship (0, 1)
	int getNumberOfOutPorts();   // 2 for temporalRelationship
	int getX();        // Left upper point on the canvas
	int getY();
	int getWidth();    // around 110
	int getHeight();  // 66 if all single line
	String getNoteName();      // The words above a node. Example: "StartsBeforeStartOf"
}
