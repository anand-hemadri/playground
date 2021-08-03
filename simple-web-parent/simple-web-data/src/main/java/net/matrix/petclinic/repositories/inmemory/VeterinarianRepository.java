/**
 * 
 */
package net.matrix.petclinic.repositories.inmemory;

import org.springframework.stereotype.Repository;

import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.providers.VeterinarianServiceProvider;

/**
 * A in memory repository implementation of {@link VeterinarianServiceProvider}.
 * 
 * @author anand.hemadri
 *
 */
@Repository
public class VeterinarianRepository extends AbstractInMemoryServiceRepository<Veterinarian> implements VeterinarianServiceProvider {
    private Veterinarian EMPTY_OBJECT = new Veterinarian();

    @Override
    public Veterinarian save(Veterinarian data) {
        return super.save(data);
    }

    @Override
    Veterinarian emptyObject() {
        return EMPTY_OBJECT;
    }
}
