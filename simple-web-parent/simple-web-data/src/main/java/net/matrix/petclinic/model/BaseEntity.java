/**
 * 
 */
package net.matrix.petclinic.model;

/**
 * Models the {@link BaseEntity} for all entities in Pet Clinic application.
 * 
 * @author anand.hemadri
 *
 */
public class BaseEntity {
    private Long id;

    /**
     * Constructs a new instance of {@link BaseEntity}.
     */
    public BaseEntity() {}

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Assigns the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns {@code true} if entity is determined to be new, {@code false} otherwise.
     * 
     * @return is new
     */
    public boolean isNew() {
        return this.id == null;
    }
}
