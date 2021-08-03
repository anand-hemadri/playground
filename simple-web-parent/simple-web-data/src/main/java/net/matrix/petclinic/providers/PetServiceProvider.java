/**
 * 
 */
package net.matrix.petclinic.providers;

import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.repositories.inmemory.EntityNotFoundException;


/**
 * An implementation of {@link CrudServiceProvider} for {@link Pet}.
 * 
 * @author anand.hemadri
 *
 */
public interface PetServiceProvider extends CrudServiceProvider<Pet> {
    /**
     * Search by name of the {@link Pet}.
     * 
     * @param name the name
     * @return the pet
     * @throws EntityNotFoundException when no matching {@link Pet pet} exists.
     */
    public Pet findByName(String name) throws EntityNotFoundException;
}
