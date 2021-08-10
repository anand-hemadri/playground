/**
 *
 */
package net.matrix.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Models an entity identified to be a {@link Person person}.
 *
 * @author anand.hemadri
 *
 */
@MappedSuperclass
public class Person extends BaseEntity {
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	/**
	 * Constructs a new instance of {@link Person}.
	 */
	public Person() {
	}

	/**
	 * Returns the fist name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Assigns the first name.
	 *
	 * @param firstName first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Assigns the last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
