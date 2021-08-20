/**
 *
 */
package net.matrix.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.matrix.recipe.models.Recipe;

/**
 * A data repository for {@link Recipe recipes}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
