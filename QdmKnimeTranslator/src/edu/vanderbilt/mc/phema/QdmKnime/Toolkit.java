/**
 * 
 */
package edu.vanderbilt.mc.phema.QdmKnime;

import edu.vanderbilt.mc.phema.knime.jaxb.Entry;
import edu.vanderbilt.mc.phema.knime.jaxb.EntryType;

/**
 * @author Huan
 *
 */
public class Toolkit {

	public static Entry makeEntry(String key, EntryType entryType, String value){
		Entry anEntry = new Entry();
		anEntry.setKey(key);
		anEntry.setType(entryType);
		anEntry.setValue(value);
		return anEntry;
	}
	
	
}
