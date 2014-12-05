/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime.test;

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

import net.lingala.zip4j.exception.ZipException;
import edu.vanderbilt.mc.phema.QdmKnime.Connection;
import edu.vanderbilt.mc.phema.QdmKnime.LogicalRelationship;
import edu.vanderbilt.mc.phema.QdmKnimeInterfaces.LogicalRelationshipInterface.LogicalTypeCode;
import edu.vanderbilt.mc.phema.knime.exceptions.SetUpIncompleteException;
import edu.vanderbilt.mc.phema.knime.exceptions.WrittenAlreadyException;
import edu.vanderbilt.mc.phema.knime.jaxb.Config;
import edu.vanderbilt.mc.phema.knime.jaxb.ObjectFactory;

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
	
	static int currentNodeId = 1;
	static int currentConnectionId = 1;

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
		
		Path newPackagePath = testPath.resolve("foo");
		if (Files.exists(newPackagePath)){
			FileUtils.deleteDirectory(newPackagePath.toFile());		
		}
		
		newPackagePath.toFile().mkdirs();
		
		ObjectFactory elementFactory = new ObjectFactory();
		
		Config rootConfig = elementFactory.createConfig();
		
		rootConfig.setKey("workflow.knime");
		
		JAXBElement<Config> jaxbRoot = elementFactory.createConfig(rootConfig);
		
		/*
		 * Set up the nodes
		 * */
		
		Config nodesConfig = elementFactory.createConfig();
		nodesConfig.setKey("nodes");
		
		rootConfig.getEntryOrConfig().add(nodesConfig);
		
		int nodeAId = newNode();
		LogicalRelationship nodeA = new LogicalRelationship(nodeAId, LogicalTypeCode.AND);
		
		nodeA.setRoot(newPackagePath.toString());
		
		nodeA.setX(20);
		nodeA.setY(20);
		
		nodeA.write();
		nodesConfig.getEntryOrConfig().add(nodeA.getKnimeWorkflowConfig(elementFactory));
		
		int nodeBId = newNode();
		LogicalRelationship nodeB = new LogicalRelationship(nodeBId, LogicalTypeCode.OR);
		
		nodeB.setRoot(newPackagePath.toString());
		
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
		
		System.out.println(newPackagePath.toString());
		
	}
	
	static int newNode(){
		return currentNodeId ++;
	}
	
	static int newConnection(){
		return currentConnectionId ++;
	}

}
