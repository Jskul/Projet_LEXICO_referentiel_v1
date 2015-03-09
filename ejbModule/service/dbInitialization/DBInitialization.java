package service.dbInitialization;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import clientServer.utility.Utilities;
import entity.CGram;
import entity.Flexion;

/**
 * Handles database initialization.
 * 
 * Session Bean implementation class DBInitialization
 */
@Singleton
@LocalBean
public class DBInitialization implements DBInitializationI {
	
	/**
	 * Gets a collection of objects representing grammatical categories.
	 * 
	 * This set of categories is defined within the method.
	 * 
	 * @return	ArrayList<CGram>	An array list of grammatical categories.
	 */
	@Override
	public ArrayList<CGram> getCGrams() {
		Utilities.trace(this.getClass().getName(), ".getCGrams()", "");
		
		ArrayList<CGram> cgrams = new ArrayList<CGram>();
		CGram cgram = null;
		
		cgram = new CGram(1, "Adjectif");
		cgrams.add(cgram);
		cgram = new CGram(2, "Adverbe");
		cgrams.add(cgram);
		cgram = new CGram(3, "Article");
		cgrams.add(cgram);
		cgram = new CGram(4, "Auxiliaire");
		cgrams.add(cgram);
		cgram = new CGram(5, "Conjonction");
		cgrams.add(cgram);
		cgram = new CGram(6, "Liaison euphonique");
		cgrams.add(cgram);
		cgram = new CGram(7, "Nom commun");
		cgrams.add(cgram);
		cgram = new CGram(8, "Onomatopée");
		cgrams.add(cgram);
		cgram = new CGram(9, "Préposition");
		cgrams.add(cgram);
		cgram = new CGram(10, "Pronom");
		cgrams.add(cgram);
		cgram = new CGram(11, "Verbe");
		cgrams.add(cgram);
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() ########################### RETURN ###########################", "");
		return cgrams;
	}

	/**
	 * TODO
	 */
	@Override
	public ArrayList<Flexion> getFlexions() {
		// TODO Auto-generated method stub
		return null;
	}

}
