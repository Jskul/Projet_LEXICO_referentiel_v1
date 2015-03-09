package dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import clientServer.utility.Utilities;
import dao.dbInitialization.DBInitializationDAO;
import dao.editionDAO.EditionDAO;
import dao.interrogation.InterrogationDAO;
import entity.CGram;
import entity.Lemme;

/**
 * A facade for DAO.
 * 
 * Session Bean implementation class DAOFacade
 */
@Singleton
@LocalBean
public class DAOFacade {

	@EJB
	private DBInitializationDAO dbInitializationDAO;
	@EJB
	private InterrogationDAO dbInterrogationDAO;
	@EJB
	private EditionDAO editionDAO;

	/**
	 * Redirects the persistence of a collection of CGram instances. 
	 * 
	 * @param	cgrams	ArrayList<CGram>	A collection of CGram instances.
	 * 
	 * @return	int	The number of persisted CGram instances.
	 */
	public int persistCGrams (ArrayList<CGram> cgrams) {
		Utilities.trace(this.getClass().getName(), ".persistCGrams()", "");
		
		int persistenceCount = 0;
		
		persistenceCount = dbInitializationDAO.persistCGrams(cgrams);
		
		Utilities.trace(this.getClass().getName(), ".persistCGrams() ########################### RETURN ###########################", "");
		return persistenceCount;
	}
	
	/**
	 * Gets CGrams instances from the database.
	 * 
	 * @return	List<CGram>	A collection of CGram instances.
	 */
	public List<CGram> getCGrams() {
		Utilities.trace(this.getClass().getName(), ".getCGrams()", "");
		
		List<CGram> cgrams = null;
		
		cgrams = dbInterrogationDAO.getCGrams();
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() cgrams = " + cgrams, "");
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() ########################### RETURN ###########################", "");
		return cgrams;
	}
	
	public List<Lemme> getLemmes() {
		Utilities.trace(this.getClass().getName(), ".getLemmes()", "");
		
		List<Lemme> lemmes = null;
		
		lemmes = dbInterrogationDAO.getLemmes();
		
		Utilities.trace(this.getClass().getName(), ".getLemmes() lemmes = " + lemmes, "");
		
		Utilities.trace(this.getClass().getName(), ".getLemmes() ########################### RETURN ###########################", "");
		return lemmes;
	}
	
	/**
	 * Inserts a new Lemme instance.
	 * 
	 * @param	lemme	Lemme	A Lemme instance
	 * 
	 * @return	boolean	Is <code>true</code> if the Lemme could be persisted, <code>false</code> otherwise.
	 */
	public boolean createLemme (Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".createLemme()", "");
		
		boolean status = false;
		status = editionDAO.createLemme(lemme);

		Utilities.trace(this.getClass().getName(), ".createLemme() ########################### RETURN ###########################", "");
		return status;
	}
	
	/**
	 * TODO
	 * 
	 * @param lemme
	 * @return
	 */
	public boolean modifyLemme (Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".modifyLemme()", "");
		
		boolean status = false;
		status = editionDAO.modifyLemme(lemme);

		Utilities.trace(this.getClass().getName(), ".modifyLemme() ########################### RETURN ###########################", "");
		return status;
	}
	
	/**
	 * TODO
	 * 
	 * @param lemme
	 * @return
	 */
	public boolean deleteLemme (Lemme lemme) {
		Utilities.trace(this.getClass().getName(), ".deleteLemme()", "");
		
		boolean status = false;
		status = editionDAO.deleteLemme(lemme);

		Utilities.trace(this.getClass().getName(), ".deleteLemme() ########################### RETURN ###########################", "");
		return status;
	}

}
