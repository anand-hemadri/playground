/**
 *
 */
package net.matrix.petclinic.services.jpa;

import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.repositories.PetRepository;
import net.matrix.petclinic.services.EntityNotFoundException;
import net.matrix.petclinic.services.PetService;

/**
 * A Jpa implementation of {@link PetService}.
 *
 * @author anand.hemadri
 *
 */
public class PetJpaService extends AbstractJpaService<Pet, PetRepository> implements PetService {

	/**
	 * Constructs a new instance of {@link PetJpaService}.
	 *
	 * @param repository
	 */
	public PetJpaService(PetRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pet findByName(String name) throws EntityNotFoundException {
		return repository.findByName(name)
				.orElseThrow(() -> new EntityNotFoundException("Cannot find pet by name: '" + "'"));
	}

}
