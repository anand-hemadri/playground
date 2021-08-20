/**
 *
 */
package net.matrix.recipe.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.services.RecipeService;

/**
 * Recipe web application index controller.
 *
 * @author anand.hemadri
 *
 */
@Controller
public class IndexController {
	private RecipeService recipeService;

	/**
	 * Constructs a new instance of {@link IndexController}.
	 *
	 * @param recipeService
	 */
	IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	/**
	 * Returns the index page template.
	 *
	 * @param model the model
	 *
	 * @return index page
	 */
	@RequestMapping({ "", "/", "/index.html" })
	public String indexPage(Model model) {
		// model.addAttribute("columns", recipeService.listColumns())
		List<Recipe> recipes = recipeService.listAllRecipe();
		model.addAttribute("recipes", recipes);
		return "index";
	}
}
