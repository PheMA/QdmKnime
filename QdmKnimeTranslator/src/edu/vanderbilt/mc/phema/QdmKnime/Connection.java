/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime;

import java.awt.Point;
import java.util.ArrayList;

import edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface;
import edu.vanderbilt.mc.phema.knime.jaxb.Config;
import edu.vanderbilt.mc.phema.knime.jaxb.Entry;
import edu.vanderbilt.mc.phema.knime.jaxb.EntryType;

/**
 * @author Huan
 *
 */
public class Connection implements ConnectionInterface {

	/**
	 * 
	 */
	
	private ArrayList <Point> bendpoints = new ArrayList<Point>();
	private int sourceID;
	private int sourcePort;
	private int destID;
	private int destPort;
	private int id;
	
	public Connection() {
		// TODO Auto-generated constructor stub
	}

	public Connection(int id){
		this.id = id;
	}
		
	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setId(int)
	 */
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setSource(int, int)
	 */
	@Override
	public void setSource(int sourceID, int port) {
		// TODO Auto-generated method stub
		this.sourceID = sourceID;
		this.sourcePort = port;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#setDest(int, int)
	 */
	@Override
	public void setDest(int destID, int port) {
		// TODO Auto-generated method stub
		this.destID = destID;
		this.destPort = port;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#addBendpoint(int, int)
	 */
	@Override
	public void addBendpoint(int x, int y) {
		// TODO Auto-generated method stub
		Point pt = new Point(x, y);
		bendpoints.add(pt);

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#getBendpoins()
	 */
	@Override
	public Point[] getBendpoins() {
		// TODO Auto-generated method stub
		return (Point[]) bendpoints.toArray();
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.ConnectionInterface#getKnimeWorkflowConfig()
	 */
	@Override
	public Config getKnimeWorkflowConfig() {
		// TODO Auto-generated method stub
		Config connectionXml = new Config();
		connectionXml.setKey("connnection_" + id);
		
		Entry entrySourceID = new Entry();
		entrySourceID.setKey("sourceID");
		entrySourceID.setType(EntryType.XINT);
		entrySourceID.setValue(String.valueOf(sourceID));		
		connectionXml.getEntryOrConfig().add(entrySourceID);
		
		Entry entryDestID = new Entry();
		entryDestID.setKey("destID");
		entryDestID.setType(EntryType.XINT);
		entryDestID.setValue(String.valueOf(destID));		
		connectionXml.getEntryOrConfig().add(entryDestID);

		Entry entrySourcePort = new Entry();
		entrySourcePort.setKey("sourcePort");
		entrySourcePort.setType(EntryType.XINT);
		entrySourcePort.setValue(String.valueOf(sourcePort));		
		connectionXml.getEntryOrConfig().add(entrySourcePort);
		
		Entry entryDestPort = new Entry();
		entryDestPort.setKey("destPort");
		entryDestPort.setType(EntryType.XINT);
		entryDestPort.setValue(String.valueOf(destPort));		
		connectionXml.getEntryOrConfig().add(entryDestPort);
		
		/* work on bendpoints */
		if (! bendpoints.isEmpty())	{
			Entry entryConnUIClass = new Entry();
			entryConnUIClass.setKey("ui_classname");
			entryConnUIClass.setType(EntryType.XSTRING);
			entryConnUIClass.setValue("org.knime.core.node.workflow.ConnectionUIInformation");
			connectionXml.getEntryOrConfig().add(entryConnUIClass);
		
			Config bendpointsXml = new Config();
			bendpointsXml.setKey("ui_settings");
			Entry entryBendpointsSize = new Entry();
			entryBendpointsSize.setKey("extrainfo.conn.bendpoints_size");
			entryBendpointsSize.setType(EntryType.XINT);
			entryBendpointsSize.setValue(String.valueOf(bendpoints.size()));
			bendpointsXml.getEntryOrConfig().add(entryBendpointsSize);
		
			for (int i = 0; i < bendpoints.size(); i++){
				Point pt = bendpoints.get(i);

				Config onePoint = new Config();
				onePoint.setKey("extrainfo.conn.bendpoints_" + i);

				Entry entryDim = new Entry();
				entryDim.setKey("array-size");
				entryDim.setType(EntryType.XINT);
				entryDim.setValue("2");
				onePoint.getEntryOrConfig().add(entryDim);

				Entry entryX = new Entry();
				entryX.setKey("0");
				entryX.setType(EntryType.XINT);
				entryX.setValue(String.valueOf(pt.x));
				onePoint.getEntryOrConfig().add(entryX);
				
				Entry entryY = new Entry();
				entryY.setKey("1");
				entryY.setType(EntryType.XINT);
				entryY.setValue(String.valueOf(pt.y));
				onePoint.getEntryOrConfig().add(entryY);
				
				bendpointsXml.getEntryOrConfig().add(onePoint);
			}
			
			connectionXml.getEntryOrConfig().add(bendpointsXml);
		
		}
		
		return connectionXml;
	}

}
