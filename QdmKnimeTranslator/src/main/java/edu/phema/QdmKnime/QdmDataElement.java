/**
 * 
 */
package edu.phema.QdmKnime;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

//import org.eclipse.persistence.jaxb.JAXBContext;



import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import edu.phema.Enum.QdmKnime.CodeSystemEnum;
import edu.phema.Enum.QdmKnime.CreateTableColumnClassEnum;
import edu.phema.QdmKnimeInterfaces.QdmDataElementInterface;
import edu.phema.jaxb.ihe.svs.CD;
import edu.phema.jaxb.ihe.svs.ConceptListType;
import edu.phema.jaxb.ihe.svs.ObjectFactory;
import edu.phema.jaxb.ihe.svs.RetrieveValueSetResponseType;
import edu.phema.jaxb.ihe.svs.ValueSetResponseType;
import edu.phema.knime.exceptions.SetUpIncompleteException;
import edu.phema.knime.exceptions.WrittenAlreadyException;
import edu.phema.knime.nodeSettings.TableCreator;

/**
 * @author moh
 *
 */
public class QdmDataElement extends MetaNode implements QdmDataElementInterface {

	/**
	 * 
	 */
	
	private final ArrayList<CD> valueSet = new ArrayList<CD>();
	private String qdmText = "";
	private String qdmDataType = "";
	private String valueSetOid = "";
	private String valueSetDisplayName = "";
	private String valueSetVersion = "";
	private final HashMap<String, String> variablesForSQL = new HashMap<String, String>();
	
	public QdmDataElement() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 */
	public QdmDataElement(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setQdmDataElementText(java.lang.String)
	 * Descriptive text from HQMF
	 */
	@Override
	public void setQdmDataElementText(String text) {
		// TODO Auto-generated method stub
		qdmText = text;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setQdmDataType(java.lang.String)
	 */
	@Override
	public void setQdmDataType(String qdmDataType) {
		// TODO Auto-generated method stub
		this.qdmDataType = qdmDataType;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getQdmDataType()
	 */
	@Override
	public String getQdmDataType() {
		// TODO Auto-generated method stub
		return qdmDataType;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addValueSet(java.lang.String)
	 */
	@Override
	public void setValueSet(String vsacXml) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext jaxbContext = JAXBContext.newInstance(
				RetrieveValueSetResponseType.class);
		
		JAXBElement<RetrieveValueSetResponseType> node = jaxbContext.createUnmarshaller()
				.unmarshal(
				new StreamSource(new StringReader(vsacXml)), 
				RetrieveValueSetResponseType.class);
		setValueSet(node);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addValueSet(javax.xml.bind.JAXBElement)
	 */
	@Override
	public void setValueSet(
			JAXBElement<RetrieveValueSetResponseType> vsacXmlJaxb) {
		// TODO Auto-generated method stub
		for(int i = 0; 
				i < vsacXmlJaxb.getValue().getValueSet().getConceptList().size(); 
				i++){
			this.addValues(
					vsacXmlJaxb.getValue().getValueSet()
					.getConceptList().get(i));
		}
		setValueSetOid(vsacXmlJaxb.getValue().getValueSet().getId());
		setValueSetVersion(vsacXmlJaxb.getValue().getValueSet().getVersion());
		setValueSetDisplayName(vsacXmlJaxb.getValue()
				.getValueSet().getDisplayName());
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addValueSet(edu.phema.jaxb.ihe.svs.ConceptListType)
	 */
	@Override
	public void addValues(ConceptListType conceptList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < conceptList.getConcept().size(); i ++){
			this.addValue(conceptList.getConcept().get(i));
		}
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addValue(edu.phema.jaxb.ihe.svs.CD)
	 */
	@Override
	public void addValue(CD code) {
		// TODO Auto-generated method stub
		valueSet.add(code);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setValueSetOid(java.lang.String)
	 */
	@Override
	public void setValueSetOid(String oid) {
		// TODO Auto-generated method stub
		valueSetOid = oid;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setValueSetDisplayName(java.lang.String)
	 */
	@Override
	public void setValueSetDisplayName(String displayName) {
		// TODO Auto-generated method stub
		valueSetDisplayName = displayName;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setValueSetVersion(java.lang.String)
	 */
	@Override
	public void setValueSetVersion(String version) {
		// TODO Auto-generated method stub
		valueSetVersion = version;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#setValueSetVersion()
	 * Set it to today yyyymmdd
	 */
	@Override
	public void setValueSetVersion() {
		// TODO Auto-generated method stub
		setValueSetVersion(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getValueSetXML()
	 */
	@Override
	public String getValueSetXML() {
		// TODO Auto-generated method stub
		String re;
		
		StringWriter stringWriter = new StringWriter();
		
		ObjectFactory objFactory = new ObjectFactory();
		
		RetrieveValueSetResponseType rootNode = objFactory
				.createRetrieveValueSetResponseType();
		
		ValueSetResponseType valSetNode = objFactory.createValueSetResponseType();
		rootNode.setValueSet(valSetNode);
		valSetNode.setDisplayName(valueSetDisplayName);
		valSetNode.setId(valueSetOid);
		valSetNode.setVersion(valueSetVersion);
		
		ConceptListType conceptListType = objFactory.createConceptListType();
		conceptListType.getConcept().addAll(valueSet);
		valSetNode.getConceptList().add(conceptListType);
		
		try {
			Marshaller mars = JAXBContext.newInstance(RetrieveValueSetResponseType.class)
					.createMarshaller();
			mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mars.marshal(objFactory.createRetrieveValueSetResponse(rootNode), 
					stringWriter);
		} catch (PropertyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		re = stringWriter.toString();
		return re;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getValueSetOid()
	 */
	@Override
	public String getValueSetOid() {
		// TODO Auto-generated method stub
		return valueSetOid;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getValueSetDisplayName()
	 */
	@Override
	public String getValueSetDisplayName() {
		// TODO Auto-generated method stub
		return valueSetDisplayName;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getNumberOfCodes()
	 */
	@Override
	public int getNumberOfCodes() {
		// TODO Auto-generated method stub
		return valueSet.size();
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getCodes()
	 */
	@Override
	public String[] getCodes() {
		// TODO Auto-generated method stub
		ArrayList<String> codes = new ArrayList<String>();
		for (CD cd : valueSet){
			codes.add(cd.getCode());
		}
		return codes.toArray(new String[codes.size()]);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getCodes(edu.phema.Enum.QdmKnime.CodeSystemEnum)
	 */
	@Override
	public String[] getCodes(CodeSystemEnum codeSystem) {
		// TODO Auto-generated method stub
		ArrayList<String> codes = new ArrayList<String>();
		for (CD cd : valueSet){
			if(cd.getCodeSystemName() == codeSystem.name()){
				codes.add(cd.getCode());
			}
		}
		return codes.toArray(new String[codes.size()]);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getCodeDisplayNames()
	 */
	@Override
	public String[] getCodeDisplayNames() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		for (CD cd : valueSet){
			names.add(cd.getDisplayName());
		}
		return names.toArray(new String[names.size()]);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#getCodeDisplayNames(edu.phema.Enum.QdmKnime.CodeSystemEnum)
	 */
	@Override
	public String[] getCodeDisplayNames(CodeSystemEnum codeSystem) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		for (CD cd : valueSet){
			if(cd.getCodeSystemName() == codeSystem.name()){
				names.add(cd.getDisplayName());
			}
		}
		return names.toArray(new String[names.size()]);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addVariableForSQL(java.lang.String, java.lang.String)
	 */
	@Override
	public void setVariableForSQL(String name, String variable) {
		// TODO Auto-generated method stub
		variablesForSQL.put(name, variable);
	}
	
	public void updateVariablesForSQL(){
		String inClause = "";
		String inClauseI2b2 = "";
		HashMap <CodeSystemEnum, String> inClauses = 
				new HashMap<CodeSystemEnum, String>();
		String unknownSystem = "";
		for (CD cd : valueSet){
			String quotedCode = "\"" + cd.getCode() + "\"";
			if (inClause.equals("")){
				inClause = quotedCode;
			} else {
				inClause = inClause + ", " + quotedCode;
			}
			try {
				CodeSystemEnum syst = CodeSystemEnum.valueOf(cd.getCodeSystemName());
				if (inClauses.containsKey(syst)){
					inClauses.put(syst, inClauses.get(syst) + ", " + quotedCode);
				} else {
					inClauses.put(syst, quotedCode);
				}
				String i2b2QuotedCode = "\"" + syst.I2B2_PREFIX 
						+ cd.getCode() + "\"";
				if (inClauseI2b2.equals("")){
					inClauseI2b2 = i2b2QuotedCode;
				} else {
					inClauseI2b2 = inClauseI2b2 + ", " + i2b2QuotedCode;
				}
				
			} catch (IllegalArgumentException e){ // don't repeatly print same error
				if (! unknownSystem.equals(cd.getCodeSystemName())){
					System.err.println("Unknown codeSystem " + cd.getCodeSystem());
				}
				unknownSystem = cd.getCodeSystem();
			}
		}
		this.setVariableForSQL("IN", inClause);
		this.setVariableForSQL("IN_i2b2", inClauseI2b2);
		for (CodeSystemEnum codeSyst : inClauses.keySet()){
			this.setVariableForSQL("IN_" + codeSyst.name(), 
					inClauses.get(codeSyst));
		}
	}
	
	public CodeSystemEnum[] getAllCodeSystems(){
		HashMap<CodeSystemEnum, Boolean> seen_systems = 
				new HashMap<CodeSystemEnum, Boolean>();
		String unknownSystem = "";
		for (CD cd : valueSet){
			try{
				CodeSystemEnum syst = CodeSystemEnum.valueOf(cd.getCodeSystemName());
				if (syst != null){
					seen_systems.put(CodeSystemEnum.valueOf(cd.getCodeSystemName()), new Boolean(true));
				}
			} catch (IllegalArgumentException e){
				if (! unknownSystem.equals(cd.getCodeSystemName())){
					System.err.println("Unknown codeSystem " + cd.getCodeSystem());
				}
				unknownSystem = cd.getCodeSystem();
			}
		}
		return seen_systems.keySet().toArray(new CodeSystemEnum[seen_systems.size()]);
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnimeInterfaces.QdmDataElementInterface#addQdmAttributes(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addQdmAttributes(String requiredColumn, String dataType,
			String explanation) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#write()
	 */
	@Override
	public void write() throws WrittenAlreadyException,
			SetUpIncompleteException, IOException, ZipException {
		// TODO Auto-generated method stub
		this.updateVariablesForSQL();
		
		Path workflowRoot = super.getWorkflowRoot();
		Path sourceFolder = Paths.get("src/main/resources/metaNodeRepos/dataElements");
		Path tempFolder = getWorkflowRoot().resolve("temp");
		//folderName = m_makeFolderName();
		Path nodeFolderPath = workflowRoot.resolve(this.getFolderName());
		if (nodeFolderPath.toFile().exists()) {
			throw new WrittenAlreadyException(nodeFolderPath.toString() + " exists already! ");
		}
		if (workflowRoot.getNameCount() == 0){   // probably I need to find a better default directory
			throw new SetUpIncompleteException("Workflow root is not set up for Node" + super.getId());
		}
		
		String zipFileName = "DATA_ELEMENT.zip";
		
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
		 * Need to implement settings
		 * 1. put value sets (Done)
		 * 2. put variables for SQL (Done)
		 * 3. put required attributes
		 * 4. put texts
		 * 
		 * */
		if (valueSet.size() > 0){
			try {
				TableCreator tb = new TableCreator();
				tb.setColumnProperties(0, "code", CreateTableColumnClassEnum.String);
				tb.setColumnProperties(1, "codeSystem", CreateTableColumnClassEnum.String);
				tb.setColumnProperties(2, "codeSystemName", CreateTableColumnClassEnum.String);
				tb.setColumnProperties(3, "codeSystemVersion", CreateTableColumnClassEnum.String);
				tb.setColumnProperties(4, "displayName", CreateTableColumnClassEnum.String);
				for (int i = 0; i < valueSet.size(); i++){
					CD cd = valueSet.get(i);
					tb.setCell(cd.getCode(), i, 0);
					tb.setCell(cd.getCodeSystem(), i, 1);
					tb.setCell(cd.getCodeSystemName(), i, 2);
					tb.setCell(cd.getCodeSystemVersion(), i, 3);
					tb.setCell(cd.getDisplayName(), i, 4);
				}
				tb.setNodeAnnotationText(valueSetDisplayName);
				String newSettings = tb.getSettings();
				Path settingsXml = tempFolderForUnzip
						.resolve("DATA_ELEMENT/Table Creator (#7)/settings.xml");
				Files.move(settingsXml, 
						tempFolderForUnzip.resolve("DATA_ELEMENT/Table Creator (#7)/settings.old.xml"), 
						StandardCopyOption.REPLACE_EXISTING);
				PrintWriter outStream = new PrintWriter(settingsXml.toFile());
				outStream.print(newSettings);
				outStream.close();

			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (variablesForSQL.size() > 0){
			try {
				TableCreator tb = new TableCreator();
				ArrayList<String> variableNames = 
						new ArrayList<String>(variablesForSQL.keySet());
				for (int i = 0; i < variableNames.size(); i ++){
					tb.setColumnProperties(i, variableNames.get(i), 
							CreateTableColumnClassEnum.String);
					tb.setCell(variablesForSQL.get(variableNames.get(i)), 0, i);
				}
				tb.setNodeAnnotationText("Value set Tools%%00010for SQL");
				String newSettings = tb.getSettings();
				Path settingsXml = tempFolderForUnzip
						.resolve("DATA_ELEMENT/Table Creator (#11)/settings.xml");
				Files.move(settingsXml, 
						tempFolderForUnzip.resolve("DATA_ELEMENT/Table Creator (#11)/settings.old.xml"), 
						StandardCopyOption.REPLACE_EXISTING);
				PrintWriter outStream = new PrintWriter(settingsXml.toFile());
				outStream.print(newSettings);
				outStream.close();
				
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		if (! qdmText.equals("")){
			Path workflowDir = tempFolderForUnzip
					.resolve("DATA_ELEMENT");
			Files.move(workflowDir.resolve("workflow.knime"), workflowDir.resolve("workflow.knime.old"), 
					StandardCopyOption.REPLACE_EXISTING);
			String templateString = Toolkit.readFile(
					workflowDir.resolve("workflow.knime.template").toString(), 
					Charset.defaultCharset());
			String newWorkflowString = templateString.replace("#${qdmDescText}$#", 
					qdmText);
			
			PrintWriter outStream = new PrintWriter(workflowDir
					.resolve("workflow.knime").toFile());
			
			outStream.print(newWorkflowString);
			outStream.close();
		}
		
		
		Files.move(tempFolderForUnzip.resolve("DATA_ELEMENT"), 
				nodeFolderPath, StandardCopyOption.REPLACE_EXISTING);

	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#getNumberOfInPorts()
	 */
	@Override
	public int getNumberOfInPorts() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#getNumberOfOutPorts()
	 */
	@Override
	public int getNumberOfOutPorts() throws SetUpIncompleteException {
		// TODO Auto-generated method stub
		return 1;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#getNodeName()
	 */
	@Override
	public String getNodeName() {
		// TODO Auto-generated method stub
		return qdmDataType;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#getFolderName()
	 */
	@Override
	public String getFolderName() {
		// TODO Auto-generated method stub
		String sn = super.getId() == super.UNKNOWN_ID ? "Unknown" : String.valueOf(super.getId());
		String fn = qdmDataType.replaceAll("[\\/:\"*?<>|]+", "_").substring(0, Math.min(qdmDataType.length(), 12))
				+ " (#" + sn + ")"; 
		return fn;
	}

	/* (non-Javadoc)
	 * @see edu.phema.QdmKnime.MetaNode#getGoodOutPorts()
	 */
	@Override
	public int[] getGoodOutPorts() {
		// TODO Auto-generated method stub
		int[] goodPorts = {0};
		return goodPorts;
	}

	@Override
	public String[] getVariableNamesForSQL() {
		// TODO Auto-generated method stub
		this.updateVariablesForSQL();
		return variablesForSQL.keySet().toArray(new String[variablesForSQL.size()]);
	}

}
