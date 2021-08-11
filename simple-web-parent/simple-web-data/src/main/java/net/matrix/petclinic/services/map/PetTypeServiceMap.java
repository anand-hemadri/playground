/**
 *
 */
package net.matrix.petclinic.services.map;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.services.PetTypeService;
import net.matrix.petclinic.services.map.AbstractMapService;

/**
 * An in memory implementation of {@link PetTypeService}.
 *
 * @author anand.hemadri
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType> implements PetTypeService {
	private PetType EMPTY_OBJECT = new PetType("");

	@Override
	PetType emptyObject() {
		return EMPTY_OBJECT;
	}
}
