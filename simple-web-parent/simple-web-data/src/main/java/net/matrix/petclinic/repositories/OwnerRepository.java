/**
 *
 */
package net.matrix.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import net.matrix.petclinic.model.Owner;

/**
 * Repository for {@link Owner owner}.
 *
 * @author anand.hemadri
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
	/**
	 * Searches for a {@link Owner owner} by last name.
	 *
	 * @param lastName
	 * @return the owner
	 */
	public Owner getByLastName(String lastName);
}
