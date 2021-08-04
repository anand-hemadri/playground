/**
 * 
 */
package net.matrix.bookstore.repositories;

import org.springframework.data.repository.CrudRepository;

import net.matrix.bookstore.model.Book;

/**
 * @author anand.hemadri
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
