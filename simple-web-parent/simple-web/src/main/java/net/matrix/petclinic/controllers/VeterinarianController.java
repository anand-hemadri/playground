/**
 *
 */
package net.matrix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.petclinic.model.Veterinarian;
import net.matrix.petclinic.services.map.VetServiceMap;

/**
 * A controller to handle requests for {@link Veterinarian veterinarians}.
 *
 * @author anand.hemadri
 *
 */
@Controller
@RequestMapping("/vets.html")
public class VeterinarianController {
	private final VetServiceMap vetServiceMap;

	/**
	 * Constructs a new instance of {@link VeterinarianController}.
	 *
	 * @param vetServiceMap
	 */
	public VeterinarianController(VetServiceMap vetServiceMap) {
		this.vetServiceMap = vetServiceMap;
	}

	/**
	 * Returns the list of {@link Veterinarian veterinarians}.
	 *
	 * @param model
	 * @return the list of veterinarians
	 */
	@RequestMapping("")
	public String listVeterinarians(Model model) {
		model.addAttribute("title", "Vets listing...");
		model.addAttribute("vets", vetServiceMap.findAll());
		return "vets/index";
	}
}
