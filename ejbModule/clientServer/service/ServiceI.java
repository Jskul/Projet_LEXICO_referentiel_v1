package clientServer.service;

import java.util.List;

import javax.ejb.Remote;

import entity.CGram;
import entity.Flexion;
import entity.Lemme;
import entity.Orthographe;
import entity.Phonologie;

/**
 * An interface for facade services.
 * 
 * @author ludovic
 */
@Remote
public interface ServiceI {
	
	public boolean initializeDB();
	
	public List<CGram> getCGrams();
	
	public CGram getCGram(CGram gram);
	
	public List<Lemme> getLemmes();
	
	//public boolean createLemme(CGram cgram, Flexion flexion, Orthographe orthographe, Phonologie phonologie);
	
	public boolean createLemme(Lemme lemme);
	public boolean modifyLemme(Lemme lemme);
	public boolean deleteLemme(Lemme lemme);
	
}
