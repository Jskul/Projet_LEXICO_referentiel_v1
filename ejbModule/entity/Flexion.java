package entity;

import java.io.Serializable;

/**
 * TODO
 * 
 * @author ludovic
 */
public class Flexion implements Serializable {
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	private int id = -1;

	/**
	 * Default constructor.
	 */
	public Flexion () {
		super();
	}

	/**
	 * A constructor.
	 * 
	 * @param	id		int		The flexion id.
	 */
	public Flexion(int id) {
		super();
		this.id = id;
	}

	/**
	 * Gets the flexion id.
	 * 
	 * @return	int	The flexion id.
	 */
	public int getId() {
		return this.id;
	}
	
}
