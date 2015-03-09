package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import service.dbInitialization.DBInitialization;
import clientServer.service.ServiceI;
import clientServer.utility.Utilities;
import dao.DAOFacade;
import entity.CGram;
import entity.Flexion;
import entity.Lemme;
import entity.Orthographe;
import entity.Phonologie;

/**
 * A facade for services.
 * 
 * Session Bean implementation class ServiceFacadeBean
 */
@Stateless
@Remote(ServiceI.class)
public class ServiceFacadeBean implements ServiceI {

	@EJB
	private DBInitialization dbInitialization;
	@EJB
	private DAOFacade daoFacade;
	
	/**
	 * Initializes the database with the required entities (namely CGram and Flexion).
	 * 
	 * @return	boolean	Is <code>true</code> if <strong>at least some</strong> instances to be persisted could be successfully persisted (does not overwrite existing instances), <code>false</code> otherwise or if a problem occurs.
	 */
	@Override
	public boolean initializeDB() {
		Utilities.trace(this.getClass().getName(), ".initializeDB()", "");
		
		ArrayList<CGram> cgrams = new ArrayList<CGram>();
		int persistenceCount = 0;
		
		boolean status = false;
		
		cgrams = dbInitialization.getCGrams();
		
		Utilities.trace(this.getClass().getName(), ".initializeDB() cgrams: " + cgrams, "");
		
		persistenceCount = daoFacade.persistCGrams(cgrams);
		
		if (persistenceCount > -1 &&  persistenceCount <= cgrams.size()) {
			status = true;
		}

		Utilities.trace(this.getClass().getName(), ".initializeDB() ########################### RETURN ###########################", "");
		return status;
	}

	/**
	 * Gets CGram instances from database.
	 * 
	 * @return	List<CGram>	A collection of CGram instances.
	 */
	@Override
	public List<CGram> getCGrams() {
		Utilities.trace(this.getClass().getName(), ".getCGrams()", "");
		
		List<CGram> cgrams = null;
		
		cgrams = daoFacade.getCGrams();
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() cgrams = " + cgrams, "");
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() ########################### RETURN ###########################", "");
		return cgrams;
	}
	
	/**
	 * TODO
	 */
	@Override
	public List<Lemme> getLemmes() {
		Utilities.trace(this.getClass().getName(), ".getLemmes()", "");
		
		List<Lemme> lemmes = null;
		
		lemmes = daoFacade.getLemmes();
		
		Utilities.trace(this.getClass().getName(), ".getLemmes() lemmes = " + lemmes, "");
		
		Utilities.trace(this.getClass().getName(), ".getLemmes() ########################### RETURN ###########################", "");
		return lemmes;
	}

	/**
	 * Creates a lemme. TODO
	 * 
	 * @param	cgram		CGram			A CGram instance.
	 * @param	flexion		Flexion			A Flexion instance.
	 * @param	orthographe	Orthographe		An Orthographe instance.
	 * @param	phonologie	Phonologie		A Phonologie instance.
	 */
//	@Override
//	public boolean createLemme(CGram cgram, Flexion flexion, Orthographe orthographe, Phonologie phonologie) {
//		Utilities.trace(this.getClass().getName(), ".createLemme()", "");
//		
//		Utilities.trace(this.getClass().getName(), ".createLemme() cgram = " + cgram, "");
//		Utilities.trace(this.getClass().getName(), ".createLemme() flexion = " + flexion, "");
//		Utilities.trace(this.getClass().getName(), ".createLemme() orthographe = " + orthographe, "");
//		Utilities.trace(this.getClass().getName(), ".createLemme() phonologie = " + phonologie, "");
//		
//		boolean status = false;
//		
//		
//		
//		
//		Utilities.trace(this.getClass().getName(), ".createLemme() ########################### RETURN ###########################", "");
//		return status;
//	}
	@Override
	public boolean createLemme(Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".createLemme()", "");
		
		boolean status = false;
		
		status = daoFacade.createLemme(lemme);
		
		Utilities.trace(this.getClass().getName(), ".createLemme() ########################### RETURN ###########################", "");
		return status;
	}
	
	/**
	 * TODO
	 */
	@Override
	public boolean modifyLemme(Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".modifyLemme()", "");
		
		boolean status = false;
		
		status = daoFacade.modifyLemme(lemme);
		
		Utilities.trace(this.getClass().getName(), ".modifyLemme() ########################### RETURN ###########################", "");
		return status;
	}

	/**
	 * TODO
	 */
	@Override
	public boolean deleteLemme(Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".deleteLemme()", "");
		
		boolean status = false;
		
		status = daoFacade.deleteLemme(lemme);
		
		Utilities.trace(this.getClass().getName(), ".deleteLemme() ########################### RETURN ###########################", "");
		return status;
	}
	
	/**
	 * TODO
	 */
	@Override
	public CGram getCGram(CGram gram) {

		return null;
	}


}
