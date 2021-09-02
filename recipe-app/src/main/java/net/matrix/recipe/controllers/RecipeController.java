/**
 *
 */
package net.matrix.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.services.RecipeService;

/**
 * The {@link Recipe recipe}i {@link Controller controller}.
 *
 * @author anand.hemadri
 *
 */
@Controller
@RequestMapping("/recipe")
public class RecipeController {
    private RecipeService recipeService;

    /**
     * Constructs a new instance of {@link RecipeController}.
     *
     * @param recipeService the recipe service
     */
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /**
     * Returns the {@link Recipe recipe} page.
     *
     * @param id
     * @param model
     * @return the recipe page
     */
    @RequestMapping("/show/{id}")
    public String showById(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", recipeService.findById(id));
        return "recipe/show";
    }
}
