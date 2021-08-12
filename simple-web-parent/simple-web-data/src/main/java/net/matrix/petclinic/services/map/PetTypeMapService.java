/**
 *
 */
package net.matrix.petclinic.services.map;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.services.PetTypeService;

/**
 * An default implementation of {@link PetTypeService}.
 *
 * @author anand.hemadri
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType> implements PetTypeService {
	/**
	 * Constructs a new instance of {@link PetTypeMapService}.
	 */
	public PetTypeMapService() {
		super(new PetType());
	}
}
