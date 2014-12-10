/**
 * 
 */
package edu.phema.QdmKnime.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBException;

import net.lingala.zip4j.exception.ZipException;
import edu.phema.QdmKnime.Connection;
import edu.phema.QdmKnime.KnimeProject;
import edu.phema.QdmKnime.LogicalOperator;
import edu.phema.QdmKnime.TemporalRelationship;
import edu.phema.QdmKnimeInterfaces.LogicalRelationshipInterface.LogicalTypeCode;
import edu.phema.QdmKnimeInterfaces.TemporalRelationshipInterface.Operator;
import edu.phema.QdmKnimeInterfaces.TemporalRelationshipInterface.TemporalTypeCode;
import edu.phema.QdmKnimeInterfaces.TemporalRelationshipInterface.Unit;
import edu.phema.knime.exceptions.SetUpIncompleteException;
import edu.phema.knime.exceptions.WrittenAlreadyException;

/**
 * @author Huan
 *
 */
public class WorkflowTest {

	/**
	 * 
	 */
	public WorkflowTest() {
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
		
//		nodeA.setX(20);
//		nodeA.setY(20);
		
		
		int nodeBId = newNode();
		LogicalOperator nodeB = new LogicalOperator(nodeBId, LogicalTypeCode.OR);
		
		project.addKnimeNode(nodeB);
		
//		nodeB.setX(150);
//		nodeB.setY(150);
		
		nodeB.setLeftId(nodeAId);
		
		
		int nodeCId = newNode();
		TemporalRelationship nodeC = new TemporalRelationship(nodeCId, TemporalTypeCode.SBS);
		nodeC.setOperator(Operator.lessThanOrEqualTo);
		nodeC.setQuantity(120);
		nodeC.setUnit(Unit.days);
		
		project.addKnimeNode(nodeC);
		
//		nodeB.setX(150);
//		nodeB.setY(150);
		
		nodeB.setLeftId(nodeAId);
		
		
		
		/*
		 *  Now I am going to set up a connection
		 * */
		

		int connAId = newConnection();
		Connection connA = new Connection(connAId);
		project.addKnimeConnection(connA);
		connA.setSource(nodeAId, 1);
		connA.setDest(nodeBId, 1);
//		connA.addBendpoint(100, 100);
		
		int connBId = newConnection();
		Connection connB = new Connection(connBId);
		project.addKnimeConnection(connB);
		connB.setSource(nodeAId, 1);
		connB.setDest(nodeCId, 1);

		
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
