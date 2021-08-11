package net.matrix.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import net.matrix.petclinic.model.Pet;

/**
 * Repository for {@link Pet pet}.
 *
 * @author anand.hemadri
 *
 */
public interface PetRepository extends CrudRepository<Pet, Long> {

}
