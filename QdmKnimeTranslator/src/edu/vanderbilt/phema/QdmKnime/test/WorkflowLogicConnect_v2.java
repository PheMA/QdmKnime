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
import edu.vanderbilt.phema.QdmKnime.KnimeProject;
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
public class WorkflowLogicConnect_v2 {

	/**
	 * 
	 */
	public WorkflowLogicConnect_v2() {
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

		KnimeProject project = new KnimeProject (testPath, projectName);
		
		
		/*
		 * Set up the nodes
		 * */
				
		int nodeAId = newNode();
		
		LogicalOperator nodeA = new LogicalOperator(nodeAId, LogicalTypeCode.AND);

		project.addKnimeNode(nodeA);
		
		nodeA.setX(20);
		nodeA.setY(20);
		
		
		int nodeBId = newNode();
		LogicalOperator nodeB = new LogicalOperator(nodeBId, LogicalTypeCode.OR);
		
		project.addKnimeNode(nodeB);
		
		nodeB.setX(150);
		nodeB.setY(150);
		
		nodeB.setLeftId(nodeAId);
		
		
		/*
		 *  Now I am going to set up a connection
		 * */
		

		int connAId = newConnection();
		Connection connA = new Connection(connAId);
		project.addKnimeConnection(connA);
		connA.setSource(nodeAId, 1);
		connA.setDest(nodeBId, 1);
		connA.addBendpoint(100, 100);
		
		project.buildProject();
		
		System.out.println(project.getProjectDir().toString());
		
	}
	
	static int newNode(){
		return currentNodeId ++;
	}
	
	static int newConnection(){
		return currentConnectionId ++;
	}

}
