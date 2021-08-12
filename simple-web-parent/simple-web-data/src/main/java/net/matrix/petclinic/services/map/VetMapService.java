/**
 *
 */
package net.matrix.petclinic.services.map;

import java.util.Collection;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.services.VetService;

/**
 * An default implementation of {@link VetService}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class VetMapService extends AbstractMapService<Veterinarian> implements VetService {
	private Veterinarian EMPTY_OBJECT = new Veterinarian();
	private SpecialityMapService specialityRepository;

	/**
	 * Constructs a new instance of {@link VetMapService}.
	 *
	 * @param specialityRepository
	 */
	public VetMapService(SpecialityMapService specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	Veterinarian emptyObject() {
		return EMPTY_OBJECT;
	}

	@Override
	public Veterinarian save(Veterinarian data) {
		if (data != null) {
			Collection<Speciality> specialities = data.getSpeciality();
			if (specialities.size() > 0) {
				specialities.stream().forEach(e -> {
					if (e.isNew()) {
						Speciality savedSpeciality = specialityRepository.save(e);
						e.setId(savedSpeciality.getId());
					}
				});
			}
			return super.save(data);
		} else {
			throw new IllegalArgumentException("Cannot save a null Veterinarian!");
		}
	}
}
