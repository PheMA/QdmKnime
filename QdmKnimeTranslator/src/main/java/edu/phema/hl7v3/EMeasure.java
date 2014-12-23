/**
 * 
 */
package edu.phema.hl7v3;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

import edu.phema.QdmKnime.Toolkit;
import edu.phema.jaxb.uvqm.hl7v3.POQMMT000001UVQualityMeasureDocument;
//import edu.phema.jaxb.queryHealth.hqmf.POQMMT000001UVQualityMeasureDocument;

/**
 * @author moh
 *
 */
public class EMeasure {

	/**
	 * 
	 */
	
	private final JAXBElement<POQMMT000001UVQualityMeasureDocument> emeasureRoot;
	
	public EMeasure(String emeasureXml) throws JAXBException {
		// TODO Auto-generated constructor stub
		emeasureRoot = JAXBContext.newInstance(
				POQMMT000001UVQualityMeasureDocument.class)
				.createUnmarshaller()
				.unmarshal(new StreamSource(new StringReader(emeasureXml)), 
						POQMMT000001UVQualityMeasureDocument.class);
		
		/*
		 * Run xpath on jaxb: 
		 * http://www.eclipse.org/eclipselink/documentation/2.4/moxy/runtime008.htm
		 * */
		
		
		
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
		String fileDir = 
				"src/main/resources/hqmf_queryHealth/samples/HQMF_Measure60.xml";
		EMeasure em = new EMeasure(Toolkit.readFile(fileDir));
	}

}
