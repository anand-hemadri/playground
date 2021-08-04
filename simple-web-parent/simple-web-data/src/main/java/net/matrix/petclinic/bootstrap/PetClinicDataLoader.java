/**
 * 
 */
package net.matrix.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.repositories.inmemory.OwnerRepository;
import net.matrix.petclinic.repositories.inmemory.VeterinarianRepository;

/**
 * A boot strap implementation to load test data upon startup of the
 * application.
 * 
 * @author anand.hemadri
 *
 */
@Component
public class PetClinicDataLoader implements CommandLineRunner {
	public final VeterinarianRepository vetRepository;
	public final OwnerRepository ownerRepository;

	/**
	 * Constructs a new instance of {@link PetClinicDataLoader}.
	 * 
	 * @param petRepository
	 * @param ownerRepository
	 */
	public PetClinicDataLoader(VeterinarianRepository vetRepository, OwnerRepository ownerRepository) {
		this.vetRepository = vetRepository;
		this.ownerRepository = ownerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");
		ownerRepository.save(owner1);

		System.out.println("saved 1...");

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");

		ownerRepository.save(owner2);

		System.out.println("saved 2...");
	}

}
