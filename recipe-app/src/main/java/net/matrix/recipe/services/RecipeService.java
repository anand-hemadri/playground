package net.matrix.recipe.services;

import java.util.List;

import net.matrix.recipe.models.Recipe;

/**
 * A simple service interface for {@link Recipe recipes data services}.
 *
 * @author anand.hemadri
 *
 */
public interface RecipeService {
    /**
     * Returns a {@link Recipe recipe} identified by id.
     *
     * @param id the recipe id
     *
     * @return the recipe
     */
    public Recipe findById(Long id);

    /**
     * Returns a {@link List list} of {@link Recipe recipes}.
     *
     * @return list of recipes
     */
    public List<Recipe> listAllRecipe();
}
