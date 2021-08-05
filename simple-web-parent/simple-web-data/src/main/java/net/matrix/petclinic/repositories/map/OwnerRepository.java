/**
 *
 */
package net.matrix.petclinic.repositories.map;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.providers.OwnerProvider;

/**
 * An in memory repository implementation of {@link OwnerProvider}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public class OwnerRepository extends AbstractMapServiceRepository<Owner> implements OwnerProvider {
	private static final Owner EMPTY_OBJECT = new Owner();

	private final PetTypeRepository petTypeRepository;
	private final PetRepository petRepository;

	/**
	 * Constructs a new instance of {@link OwnerRepository}.
	 *
	 * @param petTypeRepository the {PetTypeRepository pet type repository}
	 * @param petRepository     the {PetRepository pet repository}
	 */
	public OwnerRepository(PetTypeRepository petTypeRepository, PetRepository petRepository) {
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
		Owner savedOwner;
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
						petRepository.save(pet);
					}
				});
			}
			savedOwner = super.save(data);
		} else {
			throw new IllegalArgumentException("Cannot save null Owner data.");
		}
		return savedOwner;
	}
}
