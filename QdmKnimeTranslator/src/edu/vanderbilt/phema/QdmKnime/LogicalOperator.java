/**
 * 
 */
package edu.vanderbilt.phema.QdmKnime;

import java.awt.Point;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import edu.vanderbilt.phema.QdmKnimeInterfaces.LogicalRelationshipInterface;
import edu.vanderbilt.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.phema.knime.exceptions.WrittenAlreadyException;
import edu.vanderbilt.phema.knime.jaxb.Config;
import edu.vanderbilt.phema.knime.jaxb.EntryType;
import edu.vanderbilt.phema.knime.jaxb.ObjectFactory;

/**
 * @author Huan
 *
 */
public class LogicalOperator extends MetaNode implements LogicalRelationshipInterface {

	/**
	 * 
	 */
	
	// private Path workflowRoot;  // moved to MetaNode
	
	private Path tempFolder;
	
	private LogicalTypeCode logic; 
	
	private boolean written = false;
	
	// private int id = Integer.MIN_VALUE;  // serial number of nodes, moved to MetaNode
	
	// private final Point nodeLocation = new Point(0, 0);  // moved to MetaNode
	
	
	private final int NUM_INPORTS = 2;
	
	/*
	 * You don't actually need to set them up.  
	 * I try to calculate them through charachtors/lines of names
	 * moved to MetaNode
	 */
	// private int nodeWidth = 130;
	// private int nodeHeight = 67;
	
	private int leftElementNodeId  = Integer.MIN_VALUE;
	private int rightElementNodeId = Integer.MIN_VALUE;
	
	private ArrayList<m_OutPort> myOutPorts;   // Not sure if it is a good design
	
	private String folderName;   // end folder name for the node "AND (#3)", defined in method write
	
	private Path sourceFolder = Paths.get("resources/metaNodeRepos/logicalOperators");
	
	
	public LogicalOperator() {
		// TODO Auto-generated constructor stub
		super();
	}

	public LogicalOperator(LogicalTypeCode typeCode){
		super();
		logic = typeCode;
		myOutPorts = m_getOutPorts();
	}
	
	public LogicalOperator(int id, LogicalTypeCode typeCode){
		super(id);
		logic = typeCode;
		myOutPorts = m_getOutPorts();
	}

	public LogicalOperator(int id){
		super(id);
	}
	
	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#setRoot(java.lang.String)
	 */
	@Override
	public void setWorkflowRoot(String dir) throws WrittenAlreadyException {
		// TODO Auto-generated method stub
		if (written){
			throw new WrittenAlreadyException(super.getId());
		} else {
			super.setWorkflowRoot(dir);
			tempFolder = getWorkflowRoot().resolve("temp");
		}
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#setId(int)
	 */
	@Override
	public void setId(int id) throws WrittenAlreadyException {
		// TODO Auto-generated method stub
		if (written){
			throw new WrittenAlreadyException(super.getId(), 
					new Throwable("Attend to set Node " + super.getId() + " to " + id + " fails. "));
		} else {
			super.setId(id);
		}
	}



	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#write()
	 */
	@Override
	public void write() throws WrittenAlreadyException,
			SetUpIncompleteException, IOException, ZipException {
		// TODO Auto-generated method stub
		
		Path workflowRoot = super.getWorkflowRoot();
		if (written) {
			throw new WrittenAlreadyException(super.getId());
		}
		if (workflowRoot == null){
			throw new SetUpIncompleteException("Workflow root is not set up for Node" + super.getId());
		}
		
		Path tempZipPath = tempFolder.resolve(m_getZipFileName());
		tempZipPath.toFile().mkdirs();  // To make sure the "temp" folder is there. Do I need to check success? 
		
		Path sourceZipPath = sourceFolder.resolve(m_getZipFileName());
		
		Files.copy(sourceZipPath, tempZipPath, StandardCopyOption.REPLACE_EXISTING); // throws IOException
		
		Path tempFolderForUnzip = tempFolder.resolve("unzip");

		if (Files.exists(tempFolderForUnzip)){
			FileUtils.deleteDirectory(tempFolderForUnzip.toFile());		
		}

		tempFolderForUnzip.toFile().mkdir();
		
		ZipFile zipFile = new ZipFile(tempZipPath.toString());
		zipFile.extractAll(tempFolderForUnzip.toString());
		
		/*
		 *  Set up $%{customDescription}%$
		 *  no use actually
		 * 
		
		Path workflowTemplate = tempFolderForUnzip.resolve(m_getInZipFolderName()).resolve("workflow.knime.template");
		Path workflowInTemp = tempFolderForUnzip.resolve(m_getInZipFolderName()).resolve("workflow.knime");
		
		String workflowTemplateContent = Toolkit.readFile(
				workflowTemplate.toString(), 
				Charset.defaultCharset());
		
		String workflowOutContent = workflowTemplateContent.replace(
				"$%{customDescription}%$", 
				customDescription.isEmpty() ? getNodeName() : customDescription);
		
		PrintWriter outStream = new PrintWriter(workflowInTemp.toFile());
		
		outStream.print(workflowOutContent);
		
		outStream.close();
		
		workflowTemplate.toFile().delete();
		*/
		
		/*
		 * Set up final target folder name, and make copy from temp
		 * */
		// String nodeName = getNodeName();
		folderName = m_makeFolderName(); 
		
		Files.move(tempFolderForUnzip.resolve(m_getInZipFolderName()), 
				workflowRoot.resolve(folderName), StandardCopyOption.REPLACE_EXISTING);
		
		written = true;
		
	}
	
	
	/*
	 *  After unzip, the folder name
	 * */
	private String m_getInZipFolderName(){
		String name = "";
		switch (logic) {
			case AND: name = "AND"; break;
			case OR: name = "OR"; break;
			case AND_NOT: name = "AND_NOT"; break;
		}
		return name;
	}
	
	private String m_getZipFileName(){
		String name = "";
		switch (logic) {
			case AND: name = "AND.zip"; break;
			case OR: name = "OR.zip"; break;
			case AND_NOT: name = "AND_NOT.zip"; break;
		}
		return name;
	}
	
	private String m_makeFolderName(){
		String logicName = logic.name();
		String fn = logicName.substring(0, Math.min(logicName.length(), 12))
				+ " (#" + super.getId() + ")"; 
		return fn;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#getKnimeWorkflowConfig()
	 */
	@Override
	public Config getKnimeWorkflowConfig(ObjectFactory elementFactory) throws SetUpIncompleteException {
		// TODO Auto-generated method stub
		/*
		 * Example:
		 * <config key="node_1">
		 * <entry key="id" type="xint" value="1"/>
		 * <entry key="node_settings_file" type="xstring" value="StartBeforeS (#1)/workflow.knime"/>
		 * <entry key="node_is_meta" type="xboolean" value="true"/>
		 * <entry key="node_type" type="xstring" value="MetaNode"/>
		 * <entry key="ui_classname" type="xstring" value="org.knime.core.node.workflow.NodeUIInformation"/>
		 * <config key="ui_settings">
		 * <config key="extrainfo.node.bounds">
		 * <entry key="array-size" type="xint" value="4"/>
		 * <entry key="0" type="xint" value="391"/>
		 * <entry key="1" type="xint" value="324"/>
		 * <entry key="2" type="xint" value="114"/>
		 * <entry key="3" type="xint" value="66"/>
		 * </config>
		 * </config>
		 * </config>
		 */
		
		
		if (/* logic is not set up*/ myOutPorts == null ||
			/*	super.getWorkflowRoot() == null || */  super.getId() == Integer.MIN_VALUE) {
			throw new SetUpIncompleteException();
		}
		
		return super.getKnimeWorkflowConfig(elementFactory);
		
	}

	
	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#getNumberOfInPorts()
	 */
	@Override
	public int getNumberOfInPorts() {
		// TODO Auto-generated method stub
		return NUM_INPORTS;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#getNumberOfOutPorts()
	 */
	@Override
	public int getNumberOfOutPorts() throws SetUpIncompleteException {
		// TODO Auto-generated method stub
		if (myOutPorts == null){
			throw new SetUpIncompleteException("Relation type is not set up yet. ");
		}

		return myOutPorts.size();
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#getNoteName()
	 */
	@Override
	public String getNodeName() {
		// TODO Auto-generated method stub
		String nodeName = "";
		switch (logic){
			case AND:
				nodeName = "Logical: AND";
				break;
			case OR:
				nodeName = "Logical: OR";
				break;
			case AND_NOT:
				nodeName = "Logical: AND NOT";
				break;
		}
		return nodeName;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#setLeftId(java.lang.String)
	 */
	@Override
	public void setLeftId(int element_node_id) {
		// TODO Auto-generated method stub
		leftElementNodeId = element_node_id;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#setRightId(java.lang.String)
	 */
	@Override
	public void setRightId(int element_node_id) {
		// TODO Auto-generated method stub
		rightElementNodeId = element_node_id;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#setLogicalTypeCode(edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface.LogicalTypeCode)
	 */
	@Override
	public void setLogicalTypeCode(LogicalTypeCode typeCode) {
		// TODO Auto-generated method stub
		logic = typeCode;
		myOutPorts = m_getOutPorts();
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#getLogicalTypeCode()
	 */
	@Override
	public LogicalTypeCode getLogicalTypeCode() {
		// TODO Auto-generated method stub
		return logic;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#getOutputElementId(int)
	 */
	@Override
	public int getOutputElementId(int port) throws IndexOutOfBoundsException, SetUpIncompleteException {
		// TODO Auto-generated method stub
		if (myOutPorts == null){
			throw new SetUpIncompleteException("Relation type is not set up yet. ");
		}
		return myOutPorts.get(port).getElementNodeId();
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface#getOutputEntityLevel(int)
	 */
	@Override
	public EntityLevel getOutputEntityLevel(int port) throws IndexOutOfBoundsException, SetUpIncompleteException {
		// TODO Auto-generated method stub
		if (myOutPorts == null){
			throw new SetUpIncompleteException("Relation type is not set up yet. ");
		}
		return myOutPorts.get(port).getEventsOrPatients();
	}

	private ArrayList<m_OutPort> m_getOutPorts(){
		int currentNodeId = super.getId();
		ArrayList<m_OutPort> outPorts = new ArrayList<m_OutPort>();
		switch (logic) {
			case OR:
				outPorts.add(new m_OutPort(currentNodeId, EntityLevel.patient));
				outPorts.add(new m_OutPort(
						leftElementNodeId == rightElementNodeId ? leftElementNodeId : currentNodeId, 
						EntityLevel.event));
				break;
			case AND:
				outPorts.add(new m_OutPort(leftElementNodeId, EntityLevel.event));
				outPorts.add(new m_OutPort(leftElementNodeId, EntityLevel.event));
				outPorts.add(new m_OutPort(currentNodeId, EntityLevel.patient));
				outPorts.add(new m_OutPort(rightElementNodeId, EntityLevel.event));
				outPorts.add(new m_OutPort(rightElementNodeId, EntityLevel.event));
				break;
			case AND_NOT:
				outPorts.add(new m_OutPort(leftElementNodeId, EntityLevel.event));
				outPorts.add(new m_OutPort(leftElementNodeId, EntityLevel.event));
				break;
		}
		return outPorts;
	}
	
	private class m_OutPort {
		int elementNodeId;
		EntityLevel level;
		m_OutPort(int elementNodeId, EntityLevel eventsOrPatients){
			this.elementNodeId = elementNodeId;
			level = eventsOrPatients;
		}
		public int getElementNodeId(){
			return elementNodeId;
		}
		public EntityLevel getEventsOrPatients (){
			return level;
		}
	}

	@Override
	public String getFolderName() {
		// TODO Auto-generated method stub
		return folderName == null ? m_makeFolderName() : folderName;
	}

	@Override
	public int[] getGoodOutPorts() {
		// TODO Auto-generated method stub
		
		int[] GoodOutPorts;
		
		switch (logic) {
			case AND:
				GoodOutPorts = 
					leftElementNodeId == rightElementNodeId ? new int[]{0, 2, 4} : new int[]{1, 2, 3};
				break;
			case OR:
				GoodOutPorts = 
					leftElementNodeId == rightElementNodeId ? new int[]{1} : new int[]{0};
				break;
			case AND_NOT:
				GoodOutPorts = 
					leftElementNodeId == rightElementNodeId ? new int[]{0} : new int[]{1};
				break;
			default:
				GoodOutPorts = new int[]{};
				break;
		}
		
		return GoodOutPorts;
	}


}
