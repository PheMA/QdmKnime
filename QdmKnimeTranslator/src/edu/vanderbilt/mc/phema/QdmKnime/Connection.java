/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime;

import java.awt.Point;

import edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface;

/**
 * @author Huan
 *
 */
public class Connection implements ConnectionInterface {

	/**
	 * 
	 */
	public Connection() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setId(int)
	 */
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setSource(int, int)
	 */
	@Override
	public void setSource(int sourceID, int port) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setDest(int, int)
	 */
	@Override
	public void setDest(int destID, int port) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#addBendpoint(int, int)
	 */
	@Override
	public void addBendpoint(int x, int y) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#getBendpoins()
	 */
	@Override
	public Point[] getBendpoins() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#getPmml()
	 */
	@Override
	public String getPmml() {
		// TODO Auto-generated method stub
		return null;
	}

}
