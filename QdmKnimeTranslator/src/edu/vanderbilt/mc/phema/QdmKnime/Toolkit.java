/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import edu.vanderbilt.mc.phema.knime.jaxb.Config;
import edu.vanderbilt.mc.phema.knime.jaxb.Entry;
import edu.vanderbilt.mc.phema.knime.jaxb.EntryType;
import edu.vanderbilt.mc.phema.knime.jaxb.ObjectFactory;

/**
 * @author Huan
 *
 */
public class Toolkit {

	public static Entry makeEntry(String key, EntryType entryType, String value, ObjectFactory elementFactory){
		Entry anEntry = elementFactory.createEntry();
		anEntry.setKey(key);
		anEntry.setType(entryType);
		anEntry.setValue(value);
		return anEntry;
	}
	
	public static Config nodeUIsettings(int x, int y, int width, int height, ObjectFactory elementFactory){
		/*
		 * Example:
		 * <config key="ui_settings">
		 * <config key="extrainfo.node.bounds">
		 * <entry key="array-size" type="xint" value="4"/>
		 * <entry key="0" type="xint" value="391"/>
		 * <entry key="1" type="xint" value="324"/>
		 * <entry key="2" type="xint" value="114"/>
		 * <entry key="3" type="xint" value="66"/>
		 * </config>
		 * </config>
		 */
		Config ui_settings = elementFactory.createConfig();
		ui_settings.setKey("ui_settings");

		Config extrainfo = elementFactory.createConfig();
		extrainfo.setKey("extrainfo.node.bounds");
		extrainfo.getEntryOrConfig().add(makeEntry("array-size", EntryType.XINT, "4", elementFactory));
		extrainfo.getEntryOrConfig().add(makeEntry("0", EntryType.XINT, String.valueOf(x), elementFactory));
		extrainfo.getEntryOrConfig().add(makeEntry("1", EntryType.XINT, String.valueOf(y), elementFactory));
		extrainfo.getEntryOrConfig().add(makeEntry("2", EntryType.XINT, String.valueOf(width), elementFactory));
		extrainfo.getEntryOrConfig().add(makeEntry("3", EntryType.XINT, String.valueOf(height), elementFactory));
		
		ui_settings.getEntryOrConfig().add(extrainfo);
		
		return ui_settings;
	}
	
	
	/*
	 * Copy from http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	 * */
	static String readFile(String path, Charset encoding) throws IOException {
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
	}
	
}
