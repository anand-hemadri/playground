/**
 *
 */
package net.matrix.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.matrix.recipe.models.Category;

/**
 * A data repository for {@link Category categories}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	/**
	 * Search a {@link Category category} by description.
	 *
	 * @param description the description
	 * @return the {@link Category category}.
	 */
	Optional<Category> findByDescription(String description);
}
