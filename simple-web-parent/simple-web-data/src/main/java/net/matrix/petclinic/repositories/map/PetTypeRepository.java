/**
 *
 */
package net.matrix.petclinic.repositories.map;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.providers.PetTypeProvider;

/**
 * An in memory implementation of {@link PetTypeProvider}.
 *
 * @author anand.hemadri
 */
@Repository
public class PetTypeRepository extends AbstractMapServiceRepository<PetType> implements PetTypeProvider {
	private PetType EMPTY_OBJECT = new PetType("");

	@Override
	PetType emptyObject() {
		return EMPTY_OBJECT;
	}
}
