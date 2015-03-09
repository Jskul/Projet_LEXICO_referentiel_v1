package dao.editionDAO;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import clientServer.utility.Utilities;
import dao.interrogation.InterrogationDAO;
import entity.CGram;
import entity.Lemme;

/**
 * Handles the creation, change and deletion of entities.
 * 
 * Session Bean implementation class EditionDAO
 */
@Singleton
@LocalBean
public class EditionDAO {

	@PersistenceContext(unitName="A1Persistence")
	private EntityManager em;
	
	@EJB
	private InterrogationDAO interrogationDAO;
	
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
		
		if (lemme != null) {
			Integer nextLemmeId = null;
			
			nextLemmeId = interrogationDAO.getNextLemmeId();
			
			if (lemme.getId() != nextLemmeId) {
				lemme.setId(nextLemmeId);
			}

			em.persist(lemme);
			status = true;
		}
		
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
		
		Lemme l = null;
		l = em.merge(lemme);
		
		if (l != null) {
			status = true;
		}
		
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
		
		boolean status = true;
		
		Lemme l = null;
		
		l = em.find(Lemme.class, lemme.getId());
		
		try {
			em.remove(l);
		} catch (Exception e) {
			status = false;
		}

		Utilities.trace(this.getClass().getName(), ".deleteLemme() ########################### RETURN ###########################", "");
		return status;
	}
	
	
}
