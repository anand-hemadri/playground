/**
 *
 */
package net.matrix.petclinic.services.map;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.services.EntityNotFoundException;
import net.matrix.petclinic.services.OwnerService;

/**
 * An in memory repository implementation of {@link OwnerService}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {
	private static final Owner EMPTY_OBJECT = new Owner();

	private final PetTypeServiceMap petTypeRepository;
	private final PetServiceMap petRepository;

	/**
	 * Constructs a new instance of {@link OwnerServiceMap}.
	 *
	 * @param petTypeRepository the {PetTypeRepository pet type repository}
	 * @param petRepository     the {PetRepository pet repository}
	 */
	public OwnerServiceMap(PetTypeServiceMap petTypeRepository, PetServiceMap petRepository) {
		this.petTypeRepository = petTypeRepository;
		this.petRepository = petRepository;
	}

	@Override
	Owner emptyObject() {
		return EMPTY_OBJECT;
	}

	@Override
	public Owner getByLastName(String lastName) throws EntityNotFoundException {
		return dataSet.entrySet().stream().filter(e -> e.getValue().getLastName().equals(lastName)).findFirst()
				.orElseThrow(() -> new EntityNotFoundException(lastName)).getValue();
	}

	@Override
	public Owner save(Owner data) {
		if (data != null) {
			if (data.getPets() != null) {
				data.getPets().forEach(pet -> {
					PetType petType = pet.getPetType();
					if (petType != null) {
						if (petType.isNew()) {
							pet.setPetType(petTypeRepository.save(petType));
						}
					} else {
						throw new IllegalArgumentException("Pet type is required.");
					}

					if (pet.isNew()) {
						Pet savedPet = petRepository.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(data);
		} else {
			throw new IllegalArgumentException("Cannot save null Owner data.");
		}
	}
}
