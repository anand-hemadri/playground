/**
 * 
 */
package net.matrix.springframework.repo;

import org.springframework.data.repository.CrudRepository;

import net.matrix.springframework.domain.Book;

/**
 * @author anand.hemadri
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
