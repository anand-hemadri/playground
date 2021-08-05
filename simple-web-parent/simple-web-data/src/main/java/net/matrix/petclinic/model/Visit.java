/**
 *
 */
package net.matrix.petclinic.model;

import java.time.LocalDate;

/**
 * Models a {@link Pet pet's} {@link Visit visit} to the Pet Clinic.
 *
 * @author anand.hemadri
 *
 */
public class Visit extends BaseEntity {
	private String description;
	private LocalDate visitDate;
	private Pet pet;

	/**
	 * Constructs a new instance of {@link Visit}.
	 */
	public Visit() {

	}

	/**
	 * Constructs a new instance of {@link Visit},
	 *
	 * @param visitDate
	 * @param description
	 * @param pet
	 */
	public Visit(LocalDate visitDate, String description, Pet pet) {
		this.description = description;
		this.visitDate = visitDate;
		this.pet = pet;
	}

	/**
	 * Returns the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Assigns the  description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the visit date.
	 *
	 * @return the visit date
	 */
	public LocalDate getVisitDate() {
		return visitDate;
	}

	/**
	 * Assigns the  visit date.
	 *
	 * @param visitDate the visit date
	 */
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	/**
	 * Returns the {@link Pet pet}.
	 *
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Assigns the {@link Pet pet}.
	 *
	 * @param pet the pet
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
