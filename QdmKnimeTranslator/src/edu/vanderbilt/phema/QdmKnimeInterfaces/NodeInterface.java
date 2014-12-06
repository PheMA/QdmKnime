package edu.vanderbilt.phema.QdmKnimeInterfaces;

import java.io.IOException;

import net.lingala.zip4j.exception.ZipException;
import edu.vanderbilt.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.phema.knime.exceptions.WrittenAlreadyException;
import edu.vanderbilt.phema.knime.jaxb.Config;
import edu.vanderbilt.phema.knime.jaxb.ObjectFactory;


public interface NodeInterface {
	
	void setWorkflowRoot(String dir) throws WrittenAlreadyException;
	void setId(int id) throws WrittenAlreadyException;  // serial number of nodes
	void setX(int x);
	void setY(int y);
//	void setWidth(int width);
//	void setHeight(int height);
	void setCustomDescription(String description) throws WrittenAlreadyException;

	void write() throws WrittenAlreadyException, SetUpIncompleteException, IOException, ZipException;    // Execution, write files. Final step. After this step, the object should be write only
//	String getPmml();  // The PMML segment for KNIME work flow

	Config getKnimeWorkflowConfig(ObjectFactory elementFactory) throws SetUpIncompleteException;
	
//	boolean isReadOnly();   // after write(), the node should be read only
	int getId();
	String getNodeKey();     // "node_10"
	int getNumberOfInPorts();    // 2 for temporalRelationship (0, 1)
	int getNumberOfOutPorts() throws SetUpIncompleteException;   // 2 for temporalRelationship
	int getX();        // Left upper point on the canvas
	int getY();
	void setWidth(int w);
	void setHeight(int h);
	int getWidth();    // around 110
	int getHeight();  // 66 if all single line
	String getNodeName();      // The words above a node. Example: "StartsBeforeStartOf"
	String getFolderName();
}
