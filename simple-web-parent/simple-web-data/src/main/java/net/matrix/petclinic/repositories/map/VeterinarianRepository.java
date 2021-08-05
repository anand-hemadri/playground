/**
 *
 */
package net.matrix.petclinic.repositories.map;

import org.springframework.stereotype.Repository;

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

	@Override
	Veterinarian emptyObject() {
		return EMPTY_OBJECT;
	}

	@Override
	public Veterinarian save(Veterinarian data) {
		return super.save(data);
	}
}
