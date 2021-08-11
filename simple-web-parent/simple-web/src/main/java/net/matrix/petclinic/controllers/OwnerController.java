package net.matrix.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.petclinic.model.Owner;
import net.matrix.petclinic.model.Pet;
import net.matrix.petclinic.services.map.OwnerServiceMap;

/**
 * A controller to handle requests for {@link Pet pet} {@link Owner owners}.
 *
 * @author anand.hemadri
 *
 */
@Controller
@RequestMapping({ "owners", "owners.html" })
public class OwnerController {
	private final OwnerServiceMap ownerService;

	/**
	 * Constructs a new instance of {@link OwnerController}
	 *
	 * @param ownerService
	 */
	public OwnerController(OwnerServiceMap ownerService) {
		this.ownerService = ownerService;
	}

	/**
	 * Return the list of {@link Owner owners}.
	 *
	 * @param model the model
	 * @return the list of owners
	 */
	@RequestMapping("")
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
