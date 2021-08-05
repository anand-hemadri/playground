/**
 *
 */
package net.matrix.petclinic.repositories.map;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.providers.PetProvider;

/**
 * An in memory repository implementation of {@link PetProvider}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public class PetRepository extends AbstractMapServiceRepository<Pet> implements PetProvider {
	private static final Pet EMPTY_OBJECT = new Pet();

	@Override
	Pet emptyObject() {
		return EMPTY_OBJECT;
	}

	@Override
	public Pet findByName(String name) throws EntityNotFoundException {
		return dataSet.entrySet().stream().filter(e -> e.getValue().getName().equals(name)).findFirst()
				.orElseThrow(() -> new EntityNotFoundException("Pet by name, \"" + name + "\"")).getValue();
	}

}
