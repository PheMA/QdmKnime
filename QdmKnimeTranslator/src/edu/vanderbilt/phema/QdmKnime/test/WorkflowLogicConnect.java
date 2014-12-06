/**
 * 
 */
package edu.vanderbilt.phema.QdmKnime.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.io.FileUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import edu.vanderbilt.phema.QdmKnime.Connection;
import edu.vanderbilt.phema.QdmKnime.LogicalOperator;
import edu.vanderbilt.phema.QdmKnime.Toolkit;
import edu.vanderbilt.phema.QdmKnimeInterfaces.LogicalRelationshipInterface.LogicalTypeCode;
import edu.vanderbilt.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.phema.knime.exceptions.WrittenAlreadyException;
import edu.vanderbilt.phema.knime.jaxb.Config;
import edu.vanderbilt.phema.knime.jaxb.ObjectFactory;

/**
 * @author Huan
 *
 */
public class WorkflowLogicConnect {

	/**
	 * 
	 */
	public WorkflowLogicConnect() {
		// TODO Auto-generated constructor stub
	}
	
	static int currentNodeId = 0;
	static int currentConnectionId = 0;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ZipException 
	 * @throws SetUpIncompleteException 
	 * @throws WrittenAlreadyException 
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws IOException, WrittenAlreadyException, SetUpIncompleteException, ZipException, JAXBException {
		// TODO Auto-generated method stub
		Path testPath = Paths.get(System.getProperty("java.io.tmpdir")).resolve("qdmKnime");
		testPath.toFile().mkdirs();
		
		String projectName = "foo";
		
		Path newPackagePath = testPath.resolve(projectName);
		if (Files.exists(newPackagePath)){
			FileUtils.deleteDirectory(newPackagePath.toFile());		
		}
		
		newPackagePath.toFile().mkdirs();
		
		ObjectFactory elementFactory = new ObjectFactory();
		
		Config rootConfig = elementFactory.createConfig();
		
		rootConfig.setKey("workflow.knime");
		
		JAXBElement<Config> jaxbRoot = elementFactory.createConfig(rootConfig);
		
		Toolkit.addWorkflowOverHeads(rootConfig, elementFactory);
		
		
		/*
		 * Set up the nodes
		 * */
		
		Config nodesConfig = elementFactory.createConfig();
		nodesConfig.setKey("nodes");
		
		rootConfig.getEntryOrConfig().add(nodesConfig);
		
		int nodeAId = newNode();
		LogicalOperator nodeA = new LogicalOperator(nodeAId, LogicalTypeCode.AND);
		
		nodeA.setWorkflowRoot(newPackagePath.toString());
		
		nodeA.setX(20);
		nodeA.setY(20);
		
		nodeA.write();
		nodesConfig.getEntryOrConfig().add(nodeA.getKnimeWorkflowConfig(elementFactory));
		
		int nodeBId = newNode();
		LogicalOperator nodeB = new LogicalOperator(nodeBId, LogicalTypeCode.OR);
		
		nodeB.setWorkflowRoot(newPackagePath.toString());
		
		nodeB.setX(150);
		nodeB.setY(150);
		
		nodeB.setLeftId(nodeAId);
		
		nodeB.write();
		nodesConfig.getEntryOrConfig().add(nodeB.getKnimeWorkflowConfig(elementFactory));

		/*
		 *  Now I am going to set up a connection
		 * */
		Config connectionsConfig = elementFactory.createConfig();
		connectionsConfig.setKey("connections");
		rootConfig.getEntryOrConfig().add(connectionsConfig);
		
		
		/*
		 * Need to make overhead setup
		 * 
		 * Verions, authors, time
		 * 
		 * */
		

		int connAId = newConnection();
		Connection connA = new Connection(connAId);
		connA.setSource(nodeAId, 1);
		connA.setDest(nodeBId, 1);
		connA.addBendpoint(100, 100);
		
		connectionsConfig.getEntryOrConfig().add(connA.getKnimeWorkflowConfig(elementFactory));
		
		Path workflowKnimePath = newPackagePath.resolve("workflow.knime");
		PrintWriter outStream = new PrintWriter(workflowKnimePath.toFile());
		
		JAXBContext contextA = JAXBContext.newInstance(ObjectFactory.class);
		
		Marshaller mars = contextA.createMarshaller();
		mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		mars.marshal(jaxbRoot, outStream);
		outStream.close();
		
		Path targetZipFile = testPath.resolve(projectName + ".zip");
		targetZipFile.toFile().delete();
		
		ZipFile zipFile = new ZipFile(targetZipFile.toString());
		ZipParameters parameters = new ZipParameters();
		parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
		parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		zipFile.addFolder(newPackagePath.toString(), parameters);
		
		System.out.println(newPackagePath.toString());
		
	}
	
	static int newNode(){
		return currentNodeId ++;
	}
	
	static int newConnection(){
		return currentConnectionId ++;
	}

}
