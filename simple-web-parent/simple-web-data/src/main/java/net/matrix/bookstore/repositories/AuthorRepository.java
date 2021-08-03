/**
 * 
 */
package net.matrix.bookstore.repositories;

import org.springframework.data.repository.CrudRepository;

import net.matrix.bookstore.model.Author;

/**
 * @author anand.hemadri
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
