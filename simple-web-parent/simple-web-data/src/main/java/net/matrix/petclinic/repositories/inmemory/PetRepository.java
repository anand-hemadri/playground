/**
 * 
 */
package net.matrix.petclinic.repositories.inmemory;

import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.providers.PetServiceProvider;

/**
 * A in memory repository implementation of {@link PetServiceProvider}.
 * 
 * @author anand.hemadri
 *
 */
public class PetRepository extends AbstractMapServiceRepository<Pet> implements PetServiceProvider {
    private static final Pet EMPTY_OBJECT = new Pet();

    @Override
    public Pet save(Pet data) {
        return super.save(data);
    }

    @Override
    public Pet findByName(String name) throws EntityNotFoundException {
        return dataSet.entrySet().stream().filter(e -> e.getValue().getName().equals(name)).findFirst().orElseThrow(() -> new EntityNotFoundException("Pet by name, \"" + name + "\"")).getValue();
    }

    @Override
    Pet emptyObject() {
        return EMPTY_OBJECT;
    }

}
