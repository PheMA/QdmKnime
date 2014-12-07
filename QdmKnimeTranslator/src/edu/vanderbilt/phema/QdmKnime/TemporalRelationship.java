/**
 * 
 */
package edu.vanderbilt.phema.QdmKnime;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface;
import edu.vanderbilt.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.phema.knime.exceptions.WrittenAlreadyException;

/**
 * @author Huan
 *
 */
public class TemporalRelationship extends MetaNode implements
		TemporalRelationshipInterface {

	/**
	 * 
	 */
	private final TemporalTypeCode temporalType;
	
	private int leftElementNodeId = Integer.MIN_VALUE;
	private int rightElementNodeId = Integer.MIN_VALUE;

	@SuppressWarnings("unused")
	private Operator operator = Operator.none;

	@SuppressWarnings("unused")
	private int quantity = 0;

	@SuppressWarnings("unused")
	private Unit unit = Unit.days;
	
	String folderName;
	
	private Path sourceFolder = Paths.get("resources/metaNodeRepos/temporalRelationships");
	
	private Path tempFolder = Paths.get("");

	private Random randMachine = new Random();

	
	public TemporalRelationship(TemporalTypeCode temporalType) {
		// TODO Auto-generated constructor stub
		this.temporalType = temporalType;
		folderName = m_makeFolderName();
		super.setX(300 + randMachine.nextInt(5) * 50);
		super.setY(100 + randMachine.nextInt(5) * 25);
	}

	/**
	 * @param id
	 */
	public TemporalRelationship(int id, TemporalTypeCode temporalType) {
		super(id);
		// TODO Auto-generated constructor stub
		this.temporalType = temporalType;
		folderName = m_makeFolderName();
		super.setX(300 + randMachine.nextInt(5) * 50);
		super.setY(100 + randMachine.nextInt(5) * 25);
		
		/*
		 * The following is useless mostly
		 * */
		leftElementNodeId = id;
		rightElementNodeId = id;
	}
	
	@Override
	public void setId(int id){
		super.setId(id);
		folderName = m_makeFolderName();
		/*
		 * The following is useless mostly
		 * */
		if (leftElementNodeId == Integer.MIN_VALUE) {
			leftElementNodeId = id;
		}
		if (leftElementNodeId == Integer.MIN_VALUE) {
			leftElementNodeId = id;
		}
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#setLeftId(int)
	 */
	@Override
	public void setLeftId(int element_node_id) {
		// TODO Auto-generated method stub
		leftElementNodeId = element_node_id;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#setRightId(int)
	 */
	@Override
	public void setRightId(int element_node_id) {
		// TODO Auto-generated method stub
		rightElementNodeId = element_node_id;
	}


	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#getLeftId()
	 */
	@Override
	public synchronized int getLeftId() {
		// TODO Auto-generated method stub
		return leftElementNodeId;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#getRightId()
	 */
	@Override
	public synchronized int getRightId() {
		// TODO Auto-generated method stub
		return rightElementNodeId;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#setOperator(edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface.Operator)
	 * <= 120 days: <=
	 */
	@Override
	public synchronized void setOperator(Operator operator) {
		// TODO Auto-generated method stub
		this.operator = operator;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#setQuantity(float)
	 * <= 120 days: 120
	 */
	@Override
	public synchronized void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity = quantity;

	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface#setUnit(edu.vanderbilt.phema.QdmKnimeInterfaces.TemporalRelationshipInterface.Unit)
	 * <= 120 days: days
	 */
	@Override
	public synchronized void setUnit(Unit unit) {
		// TODO Auto-generated method stub
		this.unit = unit;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#write()
	 */
	@Override
	public synchronized void write() throws WrittenAlreadyException,
			SetUpIncompleteException, IOException, ZipException {
		// TODO Auto-generated method stub
		
		Path workflowRoot = super.getWorkflowRoot();
		//folderName = m_makeFolderName();
		Path nodeFolderPath = workflowRoot.resolve(folderName);
		if (nodeFolderPath.toFile().exists()) {
			throw new WrittenAlreadyException(nodeFolderPath.toString() + " exists already! ");
		}
		if (workflowRoot.getNameCount() == 0){
			throw new SetUpIncompleteException("Workflow root is not set up for Node" + super.getId());
		}
		
		String zipFileName = temporalType.name() + ".zip";
		
		Path tempZipPath = tempFolder.resolve(zipFileName);
		tempZipPath.toFile().mkdirs();  // To make sure the "temp" folder is there. Do I need to check success? 
		
		Path sourceZipPath = sourceFolder.resolve(zipFileName);
		
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
		 
		
		Files.move(tempFolderForUnzip.resolve(temporalType.name()), 
				nodeFolderPath, StandardCopyOption.REPLACE_EXISTING);
		


	}
	
	/* (non-Javadoc)
	 * @see edu.vanderbilt.mc.phema.QdmKnimeInterfaces.NodeInterface#setRoot(java.lang.String)
	 */
	@Override
	public synchronized void setWorkflowRoot(String dir) {
		// TODO Auto-generated method stub

		super.setWorkflowRoot(dir);
		tempFolder = getWorkflowRoot().resolve("temp");		
	}


	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#getNumberOfInPorts()
	 */
	@Override
	public synchronized int getNumberOfInPorts() {
		// TODO Auto-generated method stub
		return 2;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#getNumberOfOutPorts()
	 */
	@Override
	public synchronized int getNumberOfOutPorts() throws SetUpIncompleteException {
		// TODO Auto-generated method stub
		return 2;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#getNodeName()
	 */
	@Override
	public synchronized String getNodeName() {
		// TODO Auto-generated method stub
		String nodeName = "";
		switch (temporalType) {
			case CONCURRENT: nodeName = "Concurrent With"; break;
			case DURING: nodeName = "Occurs During"; break;
			case EAE: nodeName = "Ends After End Of"; break;
			case EBE: nodeName = "Ends Before End Of"; break;
			case EBS: nodeName = "Ends Before Start Of"; break;
			case ECW: nodeName = "Ends Concurrrent With"; break;
			case ECWS: nodeName = "Ends Concurrent With Start Of"; break;
			case EDU: nodeName = "Ends During"; break;
			case OVERLAP: nodeName = "Overlaps With"; break;
			case SAE: nodeName = "Starts After Start Of"; break;
			case SBE: nodeName = "Start Before End Of"; break;
			case SBS: nodeName = "Starts Before Start Of"; break;
			case SCW: nodeName = "Starts Concurrent With"; break;
			case SCWE: nodeName = "Start Concurrent With End Of"; break;
			case SDU: nodeName = "Start During"; break;
		}
		
		return nodeName;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#getFolderName()
	 */
	@Override
	public synchronized String getFolderName() {
		// TODO Auto-generated method stub
		return folderName;
	}

	/* (non-Javadoc)
	 * @see edu.vanderbilt.phema.QdmKnime.MetaNode#getGoodOutPorts()
	 */
	@Override
	public synchronized int[] getGoodOutPorts() {
		// TODO Auto-generated method stub
		return new int[] {0, 1};
	}
	
	private synchronized String m_makeFolderName(){
		String temperalName = temporalType.name();
		String sn = super.getId() == Integer.MIN_VALUE ? "Unknown" : String.valueOf(super.getId());
		String fn = temperalName.substring(0, Math.min(temperalName.length(), 12))
				+ " (#" + sn + ")"; 
		return fn;
	}


}