package net.matrix.bookstore.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.bookstore.model.Author;
import net.matrix.bookstore.repositories.AuthorRepository;

/**
 * Authors controller.
 *
 * @author anand.hemadri
 *
 */
//@Controller
public class AuthorsController {
	private final AuthorRepository authorRepository;

	/**
	 * Constructs a new instance of {@link AuthorsController}.
	 *
	 * @param authorRepository
	 */
	public AuthorsController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	/**
	 * Returns the list of {@link Author authors}.
	 *
	 * @param model the model
	 * @return the list of authors
	 */
	@RequestMapping("/authors")
	public String listAuthors(Model model) {
		// model.addAttribute("authors.pageTitle", "Simple Web - Authors listing");
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}

}
