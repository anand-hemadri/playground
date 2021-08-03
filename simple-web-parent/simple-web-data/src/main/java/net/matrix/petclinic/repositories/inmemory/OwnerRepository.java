/**
 * 
 */
package net.matrix.petclinic.repositories.inmemory;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.providers.OwnerServiceProvider;

/**
 * A in memory repository implementation of {@link OwnerServiceProvider}.
 * 
 * @author anand.hemadri
 *
 */
public class OwnerRepository extends AbstractInMemoryServiceRepository<Owner> implements OwnerServiceProvider {
    private static final Owner EMPTY_OBJECT = new Owner();

    @Override
    public Owner save(Owner data) {
        return super.save(data);
    }

    @Override
    public Owner getByLastName(String lastName) throws EntityNotFoundException {
        return dataSet.entrySet().stream().filter(e -> e.getValue().getLastName().equals(lastName)).findFirst().orElseThrow(() -> new EntityNotFoundException(lastName)).getValue();
    }

    @Override
    Owner emptyObject() {
        return EMPTY_OBJECT;
    }
}
