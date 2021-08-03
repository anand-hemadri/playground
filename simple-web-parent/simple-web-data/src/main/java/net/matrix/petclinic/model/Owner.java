/**
 * 
 */
package net.matrix.petclinic.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Models an {@link Owner Pet Owner} in Pet Clinic application.
 * 
 * @author anand.hemadri
 *
 */
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public Owner() {}

    /**
     * Returns the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Assigns the address.
     * 
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the city.
     * 
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Assigns the city.
     * 
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the telephone.
     * 
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Assigns the telephone.
     * 
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Returns the collection of {@link Pet pets} owned.
     * 
     * @return the pet list
     */
    public Collection<Pet> getPets() {
        return Collections.unmodifiableCollection(pets);
    }

    /**
     * Adds a {@link Pet pet} to the owned pets.
     * 
     * @param pets the pets to set
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        pets.add(pet);
    }
}
