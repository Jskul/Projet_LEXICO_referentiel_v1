package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Handles grammatical categories.
 * 
 * @author ludovic
 */
@Entity
public class CGram implements Serializable {
	
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id = -1;
	private String libelle = "";
	
	/**
	 * Default constructor.
	 */
	public CGram () {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The grammatical category id.
	 * @param	libelle	String	The grammatical category name.
	 */
	public CGram(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	/**
	 * Gets the grammatical category id.
	 * 
	 * @return	int	The grammatical category id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the grammatical category id.
	 * 
	 * @param	id	int	The grammatical category id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the grammatical category name.
	 * 
	 * @return	String	The grammatical category name.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * Sets the grammatical category name.
	 * 
	 * @param	libelle	String	The grammatical category name.
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
	public String toString() {
		return "CGram [id=" + id + ", libelle=" + libelle + "]";
	}

}
