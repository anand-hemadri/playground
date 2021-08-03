package net.matrix.petclinic.model;

import java.time.LocalDate;

/**
 * Models a {@link Pet pet} in Pet Clinic application.
 * 
 * @author anand.hemadri
 *
 */
public class Pet extends NamedEntity {
    private Owner owner;
    private PetType petType;
    private LocalDate birthDate;

    /**
     * Returns the {@link Owner}.
     * 
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Assigns the {@link Owner}.
     * 
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns the {@link PetType}
     * 
     * @return the petType
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     * Assigns the {@link PetType pet type}.
     * 
     * @param petType the pet type
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    /**
     * Returns the birth day.
     * 
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Assigns the birth day.
     * 
     * @param birthDate the birth day
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
