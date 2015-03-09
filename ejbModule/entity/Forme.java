package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Handles forms.
 * 
 * @author ludovic
 */
@Entity
public class Forme implements Serializable {
	
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id = -1;
	private Lemme lemme = null;
	private Orthographe orthographe = null;
	private Phonologie phonologie = null;
	private Flexion flexion = null;
	private boolean isLemme = false;
	private Float frequenceLivres = null;
	private Float frequenceFilms = null;
	
	/**
	 * Default constructor.
	 */
	public Forme () {
		super();
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	lemme		Lemme			A Lemme instance.
	 * @param	orthographe	Orthographe		An Orthographe instance.
	 * @param	phonologie	Phonologie		A Phonologie instance.
	 * @param	flexion		Flexion			A Flexion instance.
	 */
	public Forme(Lemme lemme, Orthographe orthographe, Phonologie phonologie, Flexion flexion) {
		super();
		this.lemme = lemme;
		this.orthographe = orthographe;
		this.phonologie = phonologie;
		this.flexion = flexion;
	}
	
	/**
	 * A constructor.
	 * 
	 * @param	id			int				The lemme id.
	 * @param	lemme		Lemme			A Lemme instance.
	 * @param	orthographe	Orthographe		An Orthographe instance.
	 * @param	phonologie	Phonologie		A Phonologie instance.
	 * @param	flexion		Flexion			A Flexion instance.
	 */
	public Forme(int id, Lemme lemme, Orthographe orthographe, Phonologie phonologie, Flexion flexion) {
		super();
		this.id = id;
		this.lemme = lemme;
		this.orthographe = orthographe;
		this.phonologie = phonologie;
		this.flexion = flexion;
	}

	/**
	 * Gets the form id.
	 * 
	 * @return	int	The form id.
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the form id.
	 * 
	 * @param	id	int	The form id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the Lemme instance.
	 * 
	 * @return	Lemme	A Lemme instance.
	 */
	public Lemme getLemme() {
		return this.lemme;
	}

	/**
	 * Sets the Lemme instance.
	 * 
	 * @param	lemme	Lemme	A Lemme instance.
	 */
	public void setLemme(Lemme lemme) {
		this.lemme = lemme;
	}

	/**
	 * Gets the Orthographe instance.
	 * 
	 * @return	Orthographe	An Orthographe instance.
	 */
	public Orthographe getOrthographe() {
		return this.orthographe;
	}

	/**
	 * Sets the Orthographe instance.
	 * 
	 * @param	orthographe	Orthographe	An Orthographe instance.
	 */
	public void setOrthographe(Orthographe orthographe) {
		this.orthographe = orthographe;
	}

	/**
	 * Gets the Phonologie instance.
	 * 
	 * @return	Phonologie	A Phonologie instance.
	 */
	public Phonologie getPhonologie() {
		return this.phonologie;
	}

	/**
	 * Sets the Phonologie instance.
	 * 
	 * @param	phonologie	Phonologie	A Phonologie instance.
	 */
	public void setPhonologie(Phonologie phonologie) {
		this.phonologie = phonologie;
	}

	/**
	 * Gets the Flexion instance.
	 * 
	 * @return	Flexion	A Flexion instance.
	 */
	public Flexion getFlexion() {
		return flexion;
	}

	/**
	 * Sets the Flexion instance.
	 * 
	 * @param	flexion	Flexion	A Flexion instance.
	 */
	public void setFlexion(Flexion flexion) {
		this.flexion = flexion;
	}
	
	/**
	 * Indicates if the Form instance represents a Lemme.
	 * 
	 * @return	boolean	If <code>true</code>, the Form instance represents a Lemme.
	 */
	public boolean isLemme() {
		return this.isLemme;
	}

	/**
	 * Sets whether the Form instance represents a Lemme.
	 * 
	 * @param	isLemme	boolean	If <code>true</code>, the Form instance represents a Lemme.
	 */
	public void setLemme(boolean isLemme) {
		this.isLemme = isLemme;
	}

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
	public String toString() {
		return "Forme [id=" + id + ", lemme=" + lemme + ", orthographe="
				+ orthographe + ", phonologie=" + phonologie + ", flexion="
				+ flexion + ", isLemme=" + isLemme + ", frequenceLivres="
				+ frequenceLivres + ", frequenceFilms=" + frequenceFilms + "]";
	}

}
