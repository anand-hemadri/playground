/**
 *
 */
package net.matrix.petclinic.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author anand.hemadri
 *
 */
public class Veterinarian extends Person {
	private Set<Speciality> specialty = new HashSet<>();

	/**
	 * Add a {@link Speciality speciality} to {@link Veterinarian veterinarian}.
	 *
	 * @param name the name of the speciality
	 */
	public void addSpeciality(String name) {
		specialty.add(new Speciality(name));
	}

	/**
	 * Returns the collection of specialities.
	 *
	 * @return the speciality
	 */
	public Collection<Speciality> getSpeciality() {
		return Collections.unmodifiableCollection(specialty);
	}
}
