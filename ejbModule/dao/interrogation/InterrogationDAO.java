package dao.interrogation;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import clientServer.utility.Utilities;
import entity.CGram;
import entity.Lemme;

/**
 * Accesses entities of the database.
 * 
 * Session Bean implementation class InterrogationDAO
 */
@Singleton
@LocalBean
public class InterrogationDAO {

	@PersistenceContext(unitName="A1Persistence")
	private EntityManager em;
	
	/**
	 * Gets CGrams instances from the database.
	 * 
	 * @return	List<CGram>	A collection of CGram instances.
	 */
	@SuppressWarnings("unchecked")
	public List<CGram> getCGrams () {
		Utilities.trace(this.getClass().getName(), ".getCGrams()", "");
		
		List<CGram> cgrams = null;

		cgrams = em.createQuery("SELECT c FROM CGram c ORDER BY c.libelle").getResultList();

		Utilities.trace(this.getClass().getName(), ".getCGrams() cgrams = " + cgrams, "");
		
		Utilities.trace(this.getClass().getName(), ".getCGrams() ########################### RETURN ###########################", "");
		return cgrams;
	}
	
	@SuppressWarnings("unchecked")
	public List<Lemme> getLemmes () {
		Utilities.trace(this.getClass().getName(), ".getLemmes()", "");
		
		List<Lemme> lemmes = null;

		lemmes = em.createQuery("SELECT l FROM Lemme l ORDER BY l.id").getResultList();

		Utilities.trace(this.getClass().getName(), ".getLemmes() lemmes = " + lemmes, "");
		
		Utilities.trace(this.getClass().getName(), ".getLemmes() ########################### RETURN ###########################", "");
		return lemmes;
	}
	
	@SuppressWarnings("unchecked")
	public Integer getNextLemmeId () {
		Utilities.trace(this.getClass().getName(), ".getNextLemmeId()", "");
		
		Integer nextLemmeId = null;
		List<Integer> maxLemmeId = null;

		maxLemmeId = em.createNativeQuery("SELECT max(id) FROM Lemme").getResultList();

		Utilities.trace(this.getClass().getName(), ".getNextLemmeId() nextLemmeId.size() = " + maxLemmeId.size() , "");
		Utilities.trace(this.getClass().getName(), ".getNextLemmeId() nextLemmeId.size() = " + maxLemmeId , "");
		
		if (maxLemmeId.size() == 1) {
			if (maxLemmeId.get(0) == null) {
				nextLemmeId = 1;
			} else {
				nextLemmeId = maxLemmeId.get(0) + 1;
			}
		}

		Utilities.trace(this.getClass().getName(), ".getNextLemmeId() ########################### RETURN ###########################", "");
		return nextLemmeId;
	}

}
