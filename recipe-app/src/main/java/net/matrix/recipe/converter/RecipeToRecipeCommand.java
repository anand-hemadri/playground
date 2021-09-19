/**
 *
 */
package net.matrix.recipe.converter;

import java.util.Set;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.RecipeCommand;
import net.matrix.recipe.models.Category;
import net.matrix.recipe.models.Ingredient;
import net.matrix.recipe.models.Recipe;

/**
 * @author anand.hemadri
 *
 */
public class RecipeToRecipeCommand implements Converter<Recipe, RecipeCommand> {
    NotesToNotesCommand notesConverter;
    CategoryToCategoryCommand categoryConverter;
    IngredientToIngredientCommand ingredientConverter;


    /**
     * Constructs a new instance of {@link RecipeToRecipeCommand}.
     *
     * @param notesConverter
     * @param categoryConverter
     * @param ingredientConverter
     */
    public RecipeToRecipeCommand(NotesToNotesCommand notesConverter, CategoryToCategoryCommand categoryConverter, IngredientToIngredientCommand ingredientConverter) {
        this.notesConverter = notesConverter;
        this.categoryConverter = categoryConverter;
        this.ingredientConverter = ingredientConverter;
    }


    @Override
    public RecipeCommand convert(Recipe source) {
        synchronized (this) {
            RecipeCommand recipe = new RecipeCommand();
            if (source != null) {
                recipe.setCookTime(source.getCookTime());
                recipe.setDescription(source.getDescription());
                recipe.setDifficulty(source.getDifficulty());
                recipe.setDirections(source.getDirections());
                recipe.setId(source.getId());
                recipe.setImage(source.getImage());
                recipe.setNotes(notesConverter.convert(source.getNotes()));
                recipe.setPreperationTime(source.getPreperationTime());
                recipe.setServings(source.getServings());
                recipe.setSource(source.getSource());
                recipe.setUrl(source.getUrl());

                Set<Ingredient> ingredients = source.getIngredients();
                if (ingredients != null && ingredients.size() > 0) {
                    ingredients.stream().forEach(e -> recipe.getIngredients().add(ingredientConverter.convert(e)));
                }


                Set<Category> categories = source.getCategories();
                if (categories != null && categories.size() > 0) {
                    categories.stream().forEach(e -> recipe.getCategories().add(categoryConverter.convert(e)));
                }
                return recipe;
            }
            return null;
        }
    }

}
