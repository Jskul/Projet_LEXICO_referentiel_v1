package dao.dbInitialization;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import clientServer.utility.Utilities;
import entity.CGram;

/**
 * Handles the persistence of objects that have to exist in order to use the service (namely CGram and Flexion).
 * 
 * Session Bean implementation class DBInitializationDAO
 */
@Singleton
@LocalBean
public class DBInitializationDAO {

	@PersistenceContext(unitName="A1Persistence")
	private EntityManager em;
	
	/**
	 * Persists a collection of CGram instances.
	 * 
	 * Instances having an illegal id (<= 0) are not persisted.
	 * Instances that are already persisted are not replaced.
	 * 
	 * @param	ArrayList<CGram>	cgrams	An array list of CGram instances.
	 * 
	 * @return	int	The number of persisted CGram instances. Is -1 if an exception occurs.
	 */
	public int persistCGrams (ArrayList<CGram> cgrams) {
		Utilities.trace(this.getClass().getName(), ".persistCGrams()", "");
		
		int persistenceCount = 0;
		
		try {			
			for (CGram c : cgrams) {
				if (c.getId() > 0 && em.find(CGram.class, c.getId()) == null ) {
					em.persist(c);
					persistenceCount++;
				}
			}
		} catch (Exception e) {
			persistenceCount = -1;
		}
		
		Utilities.trace(this.getClass().getName(), ".persistCGrams() persistenceCount = " + persistenceCount, "");

		Utilities.trace(this.getClass().getName(), ".persistCGrams() ########################### RETURN ###########################", "");
		return persistenceCount;
	}

}
