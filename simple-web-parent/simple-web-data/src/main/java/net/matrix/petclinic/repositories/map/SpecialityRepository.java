package net.matrix.petclinic.repositories.map;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.providers.SpecialityProvider;

/**
 * An in memory implementation of {@link SpecialityProvider}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public class SpecialityRepository extends AbstractMapServiceRepository<Speciality> implements SpecialityProvider {
	private final Speciality EMPTY_OBJECT = new Speciality("");

	@Override
	Speciality emptyObject() {
		return EMPTY_OBJECT;
	}

}
