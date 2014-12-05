/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime.test;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
//import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//import javax.xml.bind.util.JAXBSource;
//import javax.xml.namespace.QName;



import edu.vanderbilt.mc.phema.QdmKnime.Connection;
import edu.vanderbilt.mc.phema.knime.jaxb.Config;
import edu.vanderbilt.mc.phema.knime.jaxb.ObjectFactory;

/**
 * @author Huan
 *
 */
public class ConnectionTest {

	/**
	 * 
	 */
	public ConnectionTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectFactory elementFactory = new ObjectFactory();
		Connection conn = new Connection();
		conn.setId(2);
		conn.setSource(-1, 0);
		conn.setDest(61, 1);
		conn.addBendpoint(178, 95);
		conn.addBendpoint(578, 95);
		
		JAXBElement jaxbConn = elementFactory.createConfig(conn.getKnimeWorkflowConfig(elementFactory));
		try {
			JAXBContext contextA = JAXBContext.newInstance(ObjectFactory.class);
			Marshaller m = contextA.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//m.setProperty(Marshaller.JAXB_FRAGMENT, true);
			m.marshal(jaxbConn, System.out);
			
			
			/*			
			 * JAXBElement<Config> jaxbElementA = new JAXBElement<Config>(
					new QName(""), 
					Config.class, jaxbConn);
			*/
			// JAXBSource sourceA = new JAXBSource(contextA, jaxbElementA);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
