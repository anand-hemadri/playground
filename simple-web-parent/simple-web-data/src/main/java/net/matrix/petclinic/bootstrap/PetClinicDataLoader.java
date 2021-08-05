/**
 *
 */
package net.matrix.petclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.model.PetType;
import net.matrix.petclinic.model.Speciality;
import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.repositories.map.OwnerRepository;
import net.matrix.petclinic.repositories.map.PetTypeRepository;
import net.matrix.petclinic.repositories.map.SpecialityRepository;
import net.matrix.petclinic.repositories.map.VeterinarianRepository;

/**
 * A boot strap implementation to load test data upon startup of the
 * application.
 *
 * @author anand.hemadri
 *
 */
@Component
@SuppressWarnings("javadoc")
public class PetClinicDataLoader implements CommandLineRunner {
	private final VeterinarianRepository vetRepository;
	private final OwnerRepository ownerRepository;
	PetTypeRepository petTypeRepository;
	SpecialityRepository specialityRepository;

	public PetClinicDataLoader(VeterinarianRepository vetRepository, OwnerRepository ownerRepository,
			PetTypeRepository petTypeRepository, SpecialityRepository specialityRepository) {
		this.vetRepository = vetRepository;
		this.ownerRepository = ownerRepository;
		this.petTypeRepository = petTypeRepository;
		this.specialityRepository = specialityRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		if (ownerRepository.findAll().size() > 0) {
			return;
		}

		PetType dog = petTypeRepository.save(new PetType("Dog"));
		PetType cat = petTypeRepository.save(new PetType("Cat"));

		Speciality radiology = specialityRepository.save(new Speciality("Radiology"));
		Speciality surgery = specialityRepository.save(new Speciality("Surgery"));
//		Speciality dentistry = specialityRepository.save(new Speciality("dentistry"));

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(dog);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("mikesPet");
		mikesPet.setOwner(owner1);
		owner1.addPet(mikesPet);

		ownerRepository.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");

		Pet fionasCat = new Pet();
		fionasCat.setName("fionasCat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(cat);
		owner2.addPet(fionasCat);

		ownerRepository.save(owner2);

		System.out.println("Loaded Owners....");

		Veterinarian vet1 = new Veterinarian();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.addSpeciality(radiology);
		vetRepository.save(vet1);

		Veterinarian vet2 = new Veterinarian();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.addSpeciality(surgery);
		vetRepository.save(vet2);

		System.out.println("Loaded Vets....");
	}
}
