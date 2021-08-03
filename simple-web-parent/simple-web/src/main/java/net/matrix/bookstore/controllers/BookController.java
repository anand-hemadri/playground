/**
 * 
 */
package net.matrix.bookstore.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.bookstore.repositories.BookRepository;

/**
 * @author anand.hemadri
 *
 */
//@Controller
public class BookController {
	private final BookRepository bookRepository;

	/**
	 * @param bookRepository
	 */
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books/list";
	}
}
