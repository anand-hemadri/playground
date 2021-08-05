/**
 *
 */
package net.matrix.bookstore.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.bookstore.model.Book;
import net.matrix.bookstore.repositories.BookRepository;

/**
 * The {@link Book} controller.
 *
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

	/**
	 * Returns the list of {@link Book books}.
	 *
	 * @param model the model
	 * @return list of books
	 */
	@RequestMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books/list";
	}
}
