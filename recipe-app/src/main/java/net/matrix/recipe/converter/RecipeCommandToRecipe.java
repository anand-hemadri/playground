/**
 *
 */
package net.matrix.recipe.converter;

import java.util.Set;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.command.IngredientCommand;
import net.matrix.recipe.command.RecipeCommand;
import net.matrix.recipe.models.Recipe;

/**
 * Converts a {@link RecipeCommand} to {@link Recipe}.
 *
 * @author anand.hemadri
 *
 */
public class RecipeCommandToRecipe implements Converter<RecipeCommand, Recipe> {
    NotesCommandToNotes notesConverter;
    CategoryCommandToCategory categoryConverter;
    IngredientCommandToIngredient ingredientConverter;


    /**
     * Constructs a new instance of {@link RecipeCommandToRecipe}.
     *
     * @param notesConverter
     * @param categoryConverter
     * @param ingredientConverter
     */
    public RecipeCommandToRecipe(NotesCommandToNotes notesConverter, CategoryCommandToCategory categoryConverter, IngredientCommandToIngredient ingredientConverter) {
        this.notesConverter = notesConverter;
        this.categoryConverter = categoryConverter;
        this.ingredientConverter = ingredientConverter;
    }


    @Override
    public Recipe convert(RecipeCommand source) {
        synchronized (this) {
            Recipe recipe = new Recipe();
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

                Set<IngredientCommand> ingredients = source.getIngredients();
                if (ingredients != null && ingredients.size() > 0) {
                    ingredients.stream().forEach(e -> recipe.addIngredient(ingredientConverter.convert(e)));
                }

                Set<CategoryCommand> categories = source.getCategories();
                if (categories != null && categories.size() > 0) {
                    categories.stream().forEach(e -> recipe.addCategory(categoryConverter.convert(e)));
                }
                return recipe;
            }
            return null;
        }
    }

}
