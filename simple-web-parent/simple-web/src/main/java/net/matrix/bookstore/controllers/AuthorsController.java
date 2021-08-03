package net.matrix.bookstore.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.bookstore.repositories.AuthorRepository;

//@Controller
public class AuthorsController {
	private final AuthorRepository authorRepository;

	/**
	 * @param authorRepository
	 */
	public AuthorsController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		// model.addAttribute("authors.pageTitle", "Simple Web - Authors listing");
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}

}
