/**
 * 
 */
package net.matrix.springframework.repo;

import org.springframework.data.repository.CrudRepository;

import net.matrix.springframework.domain.Publisher;

/**
 * @author anand.hemadri
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
