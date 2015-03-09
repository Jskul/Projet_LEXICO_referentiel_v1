package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Handles lemme.
 * 
 * @author ludovic
 */
@Entity
public class Lemme implements Serializable {
	
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id = -1;
//	private CGram cgram = null;
	private Float frequenceLivres = null;
	private Float frequenceFilms = null;
	
	/**
	 * Default constructor.
	 */
	public Lemme () {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id		int		The lemme id.
	 * @param	cgram	CGram	A grammatical category instance.
	 */
	public Lemme(int id, CGram cgram) {
		super();
		this.id = id;
//		this.cgram = cgram;
	}

	/**
	 * Gets the lemme id.
	 * 
	 * @return	int	The lemme id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the lemme id.
	 * 
	 * @param	id	int	The lemme id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the grammatical category instance.
	 * 
	 * @return	CGram	The grammatical category instance.
	 */
//	public CGram getCGram() {
//		return this.cgram;
//	}

	/**
	 * Sets the grammatical category instance.
	 * 
	 * @param	cgram	CGram	The grammatical category instance.
	 */
//	public void setCGram(CGram cgram) {
//		this.cgram = cgram;
//	}

	/**
	 * Gets the frequency for books.
	 * 
	 * @return	Float	A frequency of occurrence for books.
	 */
	public Float getFrequenceLivres() {
		return this.frequenceLivres;
	}

	/**
	 * Sets the frequency for books.
	 * 
	 * @param	frequenceLivres	Float	A frequency of occurrence for books.
	 */
	public void setFrequenceLivres(Float frequenceLivres) {
		this.frequenceLivres = frequenceLivres;
	}

	/**
	 * Gets the frequency for films.
	 * 
	 * @return	Float	A frequency of occurrence for films.
	 */
	public Float getFrequenceFilms() {
		return this.frequenceFilms;
	}

	/**
	 * Sets the frequency for films.
	 * 
	 * @param	frequenceLivres	Float	A frequency of occurrence for films.
	 */
	public void setFrequenceFilms(Float frequenceFilms) {
		this.frequenceFilms = frequenceFilms;
	}

	/**
	 * Returns an instance description.
	 * 
	 * @return	String	An instance description.
	 */
	@Override
//	public String toString() {
//		return "Lemme [id=" + id + ", cgram=" + cgram + ", frequenceLivres="
//				+ frequenceLivres + ", frequenceFilms=" + frequenceFilms + "]";
//	}
	public String toString() {
		return "Lemme [id=" + id + ", frequenceLivres="
				+ frequenceLivres + ", frequenceFilms=" + frequenceFilms + "]";
	}

}
