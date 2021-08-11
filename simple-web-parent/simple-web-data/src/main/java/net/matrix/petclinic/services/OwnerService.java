package net.matrix.petclinic.services;

import net.matrix.petclinic.model.Owner;

/**
 * An implementation of {@link CrudService} for {@link Owner}.
 *
 * @author anand.hemadri
 *
 */
public interface OwnerService extends CrudService<Owner> {
	/**
	 * Search by last name of the {@link Owner}.
	 *
	 * @param lastName the last name
	 * @return the owner
	 * @throws EntityNotFoundException when no matching {@link Owner owner} exists.
	 */
	public Owner getByLastName(String lastName) throws EntityNotFoundException;
}
