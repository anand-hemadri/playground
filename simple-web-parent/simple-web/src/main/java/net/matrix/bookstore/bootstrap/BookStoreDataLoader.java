/**
 * 
 */
package net.matrix.bookstore.bootstrap;

import org.springframework.boot.CommandLineRunner;

import net.matrix.bookstore.model.Author;
import net.matrix.bookstore.model.Book;
import net.matrix.bookstore.model.Publisher;
import net.matrix.bookstore.repositories.AuthorRepository;
import net.matrix.bookstore.repositories.BookRepository;
import net.matrix.bookstore.repositories.PublisherRepository;

/**
 * @author anand.hemadri
 *
 */
// @Component
public class BookStoreDataLoader implements CommandLineRunner {

    final AuthorRepository authorRepository;
    final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    /**
     * @param authorRepository
     * @param bookRepository
     * @param publisherRepository
     */
    public BookStoreDataLoader(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        final Author eric = new Author("Eric", "Evans");
        final Book ddd = new Book("Domain Driven Design", "123133");
        final Publisher publisher = new Publisher("publisher1");

        publisherRepository.save(publisher);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        final Author ubob = new Author("Robert", "Martin");
        final Book cleancode = new Book("Clean code", "12345");
        ubob.getBooks().add(cleancode);
        cleancode.getAuthors().add(ubob);
        cleancode.setPublisher(publisher);
        publisher.getBooks().add(cleancode);

        authorRepository.save(ubob);
        bookRepository.save(cleancode);
        publisherRepository.save(publisher);

        System.out.println("bootstrap....");
        System.out.println("Number of books:" + bookRepository.count());
        System.out.println("Publisher number of books:" + publisher.getBooks().size());
    }
}
