/**
 *
 */
package net.matrix.recipe.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.repositories.RecipeRepository;

/**
 * Default implementation of {@link RecipeService}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    /**
     * Constructs a new instance of {@link RecipeServiceImpl}.
     *
     * @param recipeRepository the recipe repository
     */
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.orElseThrow(() -> new RuntimeException("No recipe found with id " + id));
    }

    @Override
    public List<Recipe> listAllRecipe() {
        List<Recipe> recipes = new ArrayList<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return Collections.unmodifiableList(recipes);
    }
}
