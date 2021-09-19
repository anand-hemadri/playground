package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.command.IngredientCommand;
import net.matrix.recipe.command.RecipeCommand;
import net.matrix.recipe.models.Difficulty;
import net.matrix.recipe.models.Recipe;

class RecipeToRecipeCommandTest {
    private RecipeCommandToRecipe recipeConverter;
    private NotesCommandToNotes notesConverter;
    private CategoryCommandToCategory categoryConverter;
    private IngredientCommandToIngredient ingredientConverter;

    @BeforeEach
    final void setUp() {
        notesConverter = new NotesCommandToNotes();
        categoryConverter = new CategoryCommandToCategory();
        ingredientConverter = new IngredientCommandToIngredient(new MeasurementUnitCommandToMeasurementUnit());
        recipeConverter = new RecipeCommandToRecipe(notesConverter, categoryConverter, ingredientConverter);
    }

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(recipeConverter.convert(new RecipeCommand()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(recipeConverter.convert(null));
    }

    @Test
    final void testConvert() {
        RecipeCommand recipeCommand = new RecipeCommand();
        recipeCommand.setCookTime(10);
        recipeCommand.setDescription("disaster");
        recipeCommand.setDifficulty(Difficulty.MODERATE);
        recipeCommand.setDirections("go staright, left and right");
        recipeCommand.setId(100L);
        recipeCommand.setPreperationTime(10);
        recipeCommand.setServings(1);
        CategoryCommand cat1 = new CategoryCommand();
        cat1.setId(123L);
        CategoryCommand cat2 = new CategoryCommand();
        cat2.setId(124L);
        recipeCommand.getCategories().add(cat1);
        recipeCommand.getCategories().add(cat2);

        IngredientCommand ing1 = new IngredientCommand();
        ing1.setId(1L);
        recipeCommand.getIngredients().add(ing1);

        Recipe recipe = recipeConverter.convert(recipeCommand);

        assertEquals(10, recipe.getCookTime());
        assertEquals("disaster", recipe.getDescription());
        assertEquals(Difficulty.MODERATE, recipe.getDifficulty());
        assertEquals("go staright, left and right", recipe.getDirections());
        assertEquals(100L, recipe.getId());
        assertEquals(10, recipe.getPreperationTime());
        assertEquals(1, recipe.getServings());
        assertEquals(2, recipe.getCategories().size());
        // assertTrue(recipe.getCategories().contains(categoryConverter.convert(cat1)));
        // assertTrue(recipe.getCategories().contains(categoryConverter.convert(cat2)));
        // assertTrue(recipe.getIngredients().contains(ingredientConverter.convert(ing1)));
    }
}
