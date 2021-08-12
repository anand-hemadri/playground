package net.matrix.petclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.repositories.OwnerRepository;
import net.matrix.petclinic.services.EntityNotFoundException;
import net.matrix.petclinic.services.OwnerService;

/**
 * A Jpa implementation of {@link OwnerService}.
 *
 * @author anand.hemadri
 *
 */
@Service
@Profile("springdatajpa")
public class OwnerJpaService extends AbstractJpaService<Owner, OwnerRepository> implements OwnerService {

	/**
	 * Constructs a new instance of {@link OwnerJpaService}.
	 *
	 * @param repository
	 */
	public OwnerJpaService(OwnerRepository repository) {
		super(repository);
	}

	@Override
	public Owner getByLastName(String lastName) throws EntityNotFoundException {
		return repository.getByLastName(lastName);
	}
}
