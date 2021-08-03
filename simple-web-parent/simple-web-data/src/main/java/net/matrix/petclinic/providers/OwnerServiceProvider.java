package net.matrix.petclinic.providers;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.repositories.inmemory.EntityNotFoundException;

/**
 * An implementation of {@link CrudServiceProvider} for {@link Owner}..
 * 
 * @author anand.hemadri
 *
 */
public interface OwnerServiceProvider extends CrudServiceProvider<Owner> {
    /**
     * Search by last name of the {@link Owner}.
     * 
     * @param lastName the last name
     * @return the owner
     * @throws EntityNotFoundException when no matching {@link Owner owner} exists.
     */
    public Owner getByLastName(String lastName) throws EntityNotFoundException;
}
