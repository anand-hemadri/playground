/**
 *
 */
package net.matrix.petclinic.repositories.map;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.providers.VeterinarianServiceProvider;

/**
 * An in memory implementation of {@link VeterinarianServiceProvider}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public class VeterinarianRepository extends AbstractMapServiceRepository<Veterinarian>
		implements VeterinarianServiceProvider {
	private Veterinarian EMPTY_OBJECT = new Veterinarian();
	private SpecialityRepository specialityRepository;

	/**
	 * Constructs a new instance of {@link VeterinarianRepository}.
	 *
	 * @param specialityRepository
	 */
	public VeterinarianRepository(SpecialityRepository specialityRepository) {
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
