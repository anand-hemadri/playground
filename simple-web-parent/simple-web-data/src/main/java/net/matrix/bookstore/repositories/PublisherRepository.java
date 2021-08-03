/**
 * 
 */
package net.matrix.bookstore.repositories;

import org.springframework.data.repository.CrudRepository;

import net.matrix.bookstore.model.Publisher;

/**
 * @author anand.hemadri
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
