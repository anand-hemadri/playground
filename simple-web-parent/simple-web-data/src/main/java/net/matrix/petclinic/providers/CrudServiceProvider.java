package net.matrix.petclinic.providers;

import java.util.Set;

import net.matrix.petclinic.model.BaseEntity;


/**
 * An interface to provide generic data providers for the Pet Clinic.
 * 
 * @author anand.hemadri
 * @param <T> the entity
 * @param <ID> the primary key identity
 */
public interface CrudServiceProvider<T extends BaseEntity> {
    /**
     * Find all records.
     * 
     * @return all records.
     */
    Set<T> findAll();

    /**
     * Find a record by id.
     * 
     * @param id
     * @return the record.
     */
    T findById(Long id);


    /**
     * Save the record.
     * 
     * @param data the record
     * @return the record
     */
    T save(T data);

    /**
     * Delete the record.
     * 
     * @param data the record
     */
    void delete(T data);
}
