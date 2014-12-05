package edu.vanderbilt.mc.phema.QdmKnimeInterfaces;

import java.awt.Point;

import edu.vanderbilt.mc.phema.knime.jaxb.Config;
import edu.vanderbilt.mc.phema.knime.jaxb.ObjectFactory;

public interface ConnectionInterface {
	void setId (int id);
	void setSource (int sourceID, int port);
	void setDest (int destID, int port);

	void addBendpoint (int x, int y);   // from source to destiny 
	Point[] getBendpoins();
	
	Config getKnimeWorkflowConfig(ObjectFactory elementFactory);
}
