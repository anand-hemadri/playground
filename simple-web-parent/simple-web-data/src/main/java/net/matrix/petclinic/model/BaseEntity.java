/**
 *
 */
package net.matrix.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Models the {@link BaseEntity} for all entities in Pet Clinic application.
 *
 * @author anand.hemadri
 *
 */
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Constructs a new instance of {@link BaseEntity}.
	 */
	public BaseEntity() {
	}

	/**
	 * Returns the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Returns {@code true} if entity is determined to be new, {@code false}
	 * otherwise.
	 *
	 * @return is new
	 */
	public boolean isNew() {
		return this.id == null;
	}

	/**
	 * Assigns the id.
	 *
	 * @param id the id
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
