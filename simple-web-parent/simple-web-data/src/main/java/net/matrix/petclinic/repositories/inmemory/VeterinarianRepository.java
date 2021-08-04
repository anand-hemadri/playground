/**
 *
 */
package net.matrix.petclinic.repositories.inmemory;

import org.springframework.stereotype.Service;

import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.providers.VeterinarianServiceProvider;

/**
 * A cache aware repository implementation of
 * {@link VeterinarianServiceProvider}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class VeterinarianRepository extends AbstractMapServiceRepository<Veterinarian>
		implements VeterinarianServiceProvider {
	private Veterinarian EMPTY_OBJECT = new Veterinarian();

	@Override
	Veterinarian emptyObject() {
		return EMPTY_OBJECT;
	}

	@Override
	public Veterinarian save(Veterinarian data) {
		return super.save(data);
	}
}
