/**
 *
 */
package net.matrix.petclinic.services.map;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.services.EntityNotFoundException;
import net.matrix.petclinic.services.PetService;

/**
 * An in memory repository implementation of {@link PetService}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class PetMapService extends AbstractMapService<Pet> implements PetService {
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
