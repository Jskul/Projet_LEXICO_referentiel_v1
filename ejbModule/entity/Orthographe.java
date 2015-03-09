package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Handles orthography.
 * 
 * @author ludovic
 */
@Entity
public class Orthographe implements Serializable {
	
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id = -1;
	private String orthographe = "";
	private String structureCV = null;
	private int nbLettres = 0;
	private String syllabation = null;
	private String structureCVSyllabee = null;
	
	/**
	 * Default constructor.
	 */
	public Orthographe () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	orthographe	String	An orthography.
	 */
	public Orthographe(String orthographe) {
		super();
		this.orthographe = orthographe;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id			int		The orthographe id.
	 * @param	orthographe	String	An orthography.
	 */
	public Orthographe(int id, String orthographe) {
		super();
		this.id = id;
		this.orthographe = orthographe;
	}

	/**
	 * Gets the orthographe id.
	 * 
	 * @return	int	An orthographe id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the orthographe id.
	 * 
	 * @param	id	int	An orthographe id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the orthography.
	 * 
	 * @return	String	An orthography.
	 */
	public String getOrthographe() {
		return this.orthographe;
	}

	/**
	 * Sets the orthography.
	 * 
	 * @param	orthographe	String	An orthography.
	 */
	public void setOrthographe(String orthographe) {
		this.orthographe = orthographe;
	}

	/**
	 * Gets the CV structure.
	 * 
	 * @return	String	A CV structure.
	 */
	public String getStructureCV() {
		return this.structureCV;
	}

	/**
	 * Sets the CV structure.
	 * 
	 * @param	structureCV	String	A CV structure.
	 */
	public void setStructureCV(String structureCV) {
		this.structureCV = structureCV;
	}

	/**
	 * Gets the letter count.
	 * 
	 * @return	int	A letter count.
	 */
	public int getNbLettres() {
		return this.nbLettres;
	}

	/**
	 * Sets the letter count.
	 * 
	 * @param	nbLettres	int	A letter count.
	 */
	public void setNbLettres(int nbLettres) {
		this.nbLettres = nbLettres;
	}

	/**
	 * Gets the syllabation.
	 * 
	 * @return	String	A syllabation.
	 */
	public String getSyllabation() {
		return this.syllabation;
	}

	/**
	 * Sets the syllabation.
	 * 
	 * @param	syllabation	String	A syllabation.
	 */
	public void setSyllabation(String syllabation) {
		this.syllabation = syllabation;
	}

	/**
	 * Gets the syllabation of CV structure.
	 * 
	 * @return	String	A CV structure syllabation.
	 */
	public String getStructureCVSyllabee() {
		return this.structureCVSyllabee;
	}

	/**
	 * Sets the syllabation of CV structure.
	 * 
	 * @param	structureCVSyllabee	String	A CV structure syllabation.
	 */
	public void setStructureCVSyllabee(String structureCVSyllabee) {
		this.structureCVSyllabee = structureCVSyllabee;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "Orthographe [id=" + id + ", orthographe=" + orthographe
				+ ", structureCV=" + structureCV + ", nbLettres=" + nbLettres
				+ ", syllabation=" + syllabation + ", structureCVSyllabee="
				+ structureCVSyllabee + "]";
	}
	

}
