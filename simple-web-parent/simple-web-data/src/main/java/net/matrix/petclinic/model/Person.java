/**
 * 
 */
package net.matrix.petclinic.model;

/**
 * Models an entity identified to be a {@link Person person}.
 * 
 * @author anand.hemadri
 *
 */
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    /**
     * Constructs a new instance of {@link Person}.
     */
    public Person() {}

    /**
     * Returns the fist name.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Assigns the first name.
     * 
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Assigns the last name.
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
