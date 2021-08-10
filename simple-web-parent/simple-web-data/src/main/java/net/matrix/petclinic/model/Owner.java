/**
 *
 */
package net.matrix.petclinic.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Models an {@link Owner pet owner}.
 *
 * @author anand.hemadri
 *
 */
@Entity
@Table(name = "owners")
public class Owner extends Person {
	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "pets")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

	/**
	 * Constructs a new instance of {@link Owner}.
	 *
	 */
	public Owner() {
	}

	/**
	 * Adds a {@link Pet pet} to the list of owned pets.
	 *
	 * @param pet the pet
	 */
	public void addPet(Pet pet) {
		pet.setOwner(this);
		pets.add(pet);
	}

	/**
	 * Returns the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
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
	 * Returns the collection of {@link Pet pets} owned.
	 *
	 * @return the pet list
	 */
	public Collection<Pet> getPets() {
		return Collections.unmodifiableCollection(pets);
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
	 * Assigns the address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * Assigns the telephone.
	 *
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}