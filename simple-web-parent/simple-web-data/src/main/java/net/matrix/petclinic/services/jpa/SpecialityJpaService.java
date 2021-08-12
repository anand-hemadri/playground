/**
 *
 */
package net.matrix.petclinic.services.jpa;

import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.repositories.SpecialityRepository;
import net.matrix.petclinic.services.SpecialityService;

/**
 * A Jpa implementation of {@link SpecialityService}.
 *
 * @author anand.hemadri
 *
 */
public class SpecialityJpaService extends AbstractJpaService<Speciality, SpecialityRepository>
		implements SpecialityService {
	/**
	 * Constructs a new instance of {@link SpecialityJpaService}.
	 *
	 * @param repository
	 */
	public SpecialityJpaService(SpecialityRepository repository) {
		super(repository);
	}
}
