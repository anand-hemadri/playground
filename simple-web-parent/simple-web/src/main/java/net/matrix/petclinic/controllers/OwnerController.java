package net.matrix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.repositories.inmemory.OwnerRepository;

/**
 * A controller to handle requests for {@link Pet pet} {@link Owner owners}.
 *
 * @author anand.hemadri
 *
 */
@Controller
@RequestMapping("owners")
public class OwnerController {
	private final OwnerRepository ownerRepository;

	/**
	 * Constructs a new instance of {@link OwnerController}
	 *
	 * @param ownerRepository
	 */
	public OwnerController(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	/**
	 * Return the list of {@link Owner owners}.
	 *
	 * @param model the model
	 * @return the list of owners
	 */
	@RequestMapping({ "", "/", "/owners.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerRepository.findAll());
		return "owners/index";
	}
}
