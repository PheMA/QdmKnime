package edu.vanderbilt.mc.phema.QdmKnimeInterfaces;

import java.awt.Point;

public interface ConnectionInterface {
	void setId (int id);
	void setSource (int sourceID, int port);
	void setDest (int destID, int port);

	void addBendpoint (int x, int y);   // from source to destiny 
	Point[] getBendpoins();
	
	String getPmml();
}
