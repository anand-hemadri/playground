package net.matrix.petclinic.services.map;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.services.SpecialityService;

/**
 * An in memory implementation of {@link SpecialityService}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality> implements SpecialityService {
	private final Speciality EMPTY_OBJECT = new Speciality("");

	@Override
	Speciality emptyObject() {
		return EMPTY_OBJECT;
	}

}
