/**
 *
 */
package net.matrix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.repositories.inmemory.VeterinarianRepository;

/**
 * A controller to handle requests for {@link Veterinarian veterinarians}.
 *
 * @author anand.hemadri
 *
 */
@Controller
@RequestMapping("/vets")
public class VeterinarianController {
	private final VeterinarianRepository veterinarianRepository;

	/**
	 * Constructs a new instance of {@link VeterinarianController}.
	 *
	 * @param veterinarianRepository
	 */
	public VeterinarianController(VeterinarianRepository veterinarianRepository) {
		this.veterinarianRepository = veterinarianRepository;
	}

	/**
	 * Returns the list of {@link Veterinarian veterinarians}.
	 *
	 * @param model
	 * @return the list of veterinarians
	 */
	@RequestMapping({ "", "/", "/vets.html" })
	public String listVeterinarians(Model model) {
		model.addAttribute("title", "Vets listing...");
		model.addAttribute("vets", veterinarianRepository.findAll());
		return "vets/index";
	}
}
