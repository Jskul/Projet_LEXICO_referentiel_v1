package service.dbInitialization;

import java.util.ArrayList;

import javax.ejb.Remote;

import entity.CGram;
import entity.Flexion;

/**
 * An interface for database initialization.
 * 
 * @author ludovic
 */
@Remote
public interface DBInitializationI {
	public ArrayList<CGram> getCGrams();
	public ArrayList<Flexion> getFlexions();
}
