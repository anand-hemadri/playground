/**
 *
 */
package net.matrix.petclinic.services.jpa;

import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.repositories.PetTypeRepository;
import net.matrix.petclinic.services.PetTypeService;

/**
 * A Jpa implementation of {@link PetTypeService}.
 *
 * @author anand.hemadri
 *
 */
public class PetTypeJpaService extends AbstractJpaService<PetType, PetTypeRepository> implements PetTypeService {

	/**
	 * Constructs a new instance of {@link PetTypeJpaService}.
	 *
	 * @param repository
	 */
	public PetTypeJpaService(PetTypeRepository repository) {
		super(repository);
	}
}
