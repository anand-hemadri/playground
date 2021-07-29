/**
 * 
 */
package net.matrix.springframework.repo;

import org.springframework.data.repository.CrudRepository;

import net.matrix.springframework.domain.Author;

/**
 * @author anand.hemadri
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
