package net.matrix.petclinic.model;

/**
 * Models a {@link PetType pet type} in Pet Clinic application.
 * 
 * @author anand.hemadri
 *
 */
public class PetType extends NamedEntity {
    /**
     * Constructs a new instance of {@link PetType}.
     * 
     * @param name
     */
    public PetType(String name) {
        super(name);
    }
}
