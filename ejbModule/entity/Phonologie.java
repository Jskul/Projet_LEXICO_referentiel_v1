package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Handles phonology.
 * 
 * @author ludovic
 */
@Entity
public class Phonologie implements Serializable {
	
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id = -1;
	private String phonologie = "";
	private String structureCV = null;
	private int nbPhonemes = 0;
	private int nbSyllabes = 0;

	/**
	 * Default constructor.
	 */
	public Phonologie () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	phonologie	String	A phonology.
	 */
	public Phonologie(String phonologie) {
		super();
		this.phonologie = phonologie;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id			int		The phonologie id.
	 * @param	phonologie	String	A phonology.
	 */
	public Phonologie(int id, String phonologie) {
		super();
		this.id = id;
		this.phonologie = phonologie;
	}

	/**
	 * Gets the phonologie id.
	 * 
	 * @return	int	A phonologie id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the phonologie id.
	 * 
	 * @param	id	int	A phonologie id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the phonology.
	 * 
	 * @return	String	A phonology.
	 */
	public String getPhonologie() {
		return this.phonologie;
	}

	/**
	 * Sets the phonology.
	 * 
	 * @param	phonologie	String	A phonology.
	 */
	public void setPhonologie(String phonologie) {
		this.phonologie = phonologie;
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
	 * Gets the phoneme count.
	 * 
	 * @return	int	A phoneme count.
	 */
	public int getNbPhonemes() {
		return this.nbPhonemes;
	}

	/**
	 * Sets the phoneme count.
	 * 
	 * @param	nbPhonemes	int	A phoneme count.
	 */
	public void setNbPhonemes(int nbPhonemes) {
		this.nbPhonemes = nbPhonemes;
	}
	
	/**
	 * Gets the syllable count.
	 * 
	 * @return	int	A syllable count.
	 */
	public int getNbSyllabes() {
		return this.nbSyllabes;
	}

	/**
	 * Sets the syllable count.
	 * 
	 * @param	nbSyllabes	int	A syllable count.
	 */
	public void setNbSyllabes(int nbSyllabes) {
		this.nbSyllabes = nbSyllabes;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "Phonologie [id=" + id + ", phonologie=" + phonologie
				+ ", structureCV=" + structureCV + ", nbPhonemes=" + nbPhonemes
				+ ", nbSyllabes=" + nbSyllabes + "]";
	}
	

}
