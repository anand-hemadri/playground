package net.matrix.recipe.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecipeTest {
    private final Recipe recipe = new Recipe();

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    final void testAddCategory() {
        assertNotNull(recipe.getCategories());
        assertEquals(0, recipe.getCategories().size());

        recipe.addCategory(new Category());
        assertEquals(1, recipe.getCategories().size());
    }

    @Test
    final void testAddIngredient() {
        assertNotNull(recipe.getIngredients());
        assertEquals(0, recipe.getIngredients().size());

        recipe.addIngredient(new Ingredient());
        assertEquals(1, recipe.getIngredients().size());
    }

    @Test
    final void testGetCategories() {
        assertNotNull(recipe.getCategories());
        assertEquals(0, recipe.getCategories().size());

        assertThrows(UnsupportedOperationException.class, () -> recipe.getCategories().addAll(Collections.emptySet()));
    }

    @Test
    final void testGetCookTime() {
        assertNull(recipe.getCookTime());

        recipe.setCookTime(123);
        assertEquals(123, recipe.getCookTime());
    }

    @Test
    final void testGetDescription() {
        assertNull(recipe.getDescription());

        recipe.setDescription("testGetDescription");
        assertEquals("testGetDescription", recipe.getDescription());
    }

    @Test
    final void testGetDifficulty() {
        assertNull(recipe.getDifficulty());

        recipe.setDifficulty(Difficulty.HARD);
        assertEquals(Difficulty.HARD, recipe.getDifficulty());
    }

    @Test
    final void testGetDirections() {
        assertNull(recipe.getDirections());

        recipe.setDirections("testGetDirections");
        assertEquals("testGetDirections", recipe.getDirections());

    }

    @Test
    final void testGetId() {
        assertNull(recipe.getId());

        recipe.setId(321L);
        assertEquals(321L, recipe.getId());
    }

    @Test
    final void testGetImage() {
        assertNull(recipe.getImage());
    }

    @Test
    final void testGetIngredients() {
        assertNotNull(recipe.getIngredients());
        assertEquals(0, recipe.getIngredients().size());

        assertThrows(UnsupportedOperationException.class, () -> recipe.getIngredients().addAll(Collections.emptySet()));
    }

    @Test
    final void testGetNotes() {
        assertNull(recipe.getNotes());

        final Notes notes = new Notes();
        notes.setRecipeNotes("testGetNotes");
        recipe.setNotes(notes);
        assertSame(notes, recipe.getNotes());
    }

    @Test
    final void testGetPreperationTime() {
        assertNull(recipe.getPreperationTime());

        recipe.setPreperationTime(123);
        assertEquals(123, recipe.getPreperationTime());
    }

    @Test
    final void testGetServings() {
        assertNull(recipe.getServings());

        recipe.setServings(321);
        assertEquals(321, recipe.getServings());
    }

    @Test
    final void testGetSource() {
        assertNull(recipe.getSource());

        recipe.setSource("testGetSource");
        assertEquals("testGetSource", recipe.getSource());
    }

    @Test
    final void testGetUrl() {
        assertNull(recipe.getUrl());

        recipe.setUrl("testGetUrl");
        assertEquals("testGetUrl", recipe.getUrl());
    }

    @Test
    final void testRecipe() {
        assertNotNull(recipe);
        assertNull(recipe.getId());
        assertNotNull(recipe.getCategories());
        assertNull(recipe.getCookTime());
        assertNull(recipe.getDescription());
        assertNull(recipe.getDifficulty());
        assertNull(recipe.getDirections());
        assertNull(recipe.getNotes());
        assertNull(recipe.getPreperationTime());
        assertNull(recipe.getServings());
        assertNull(recipe.getSource());
        assertNull(recipe.getUrl());
        assertNotNull(recipe.getIngredients());
        assertNull(recipe.getImage());
    }

    @Test
    final void testSetCookTime() {
        recipe.setCookTime(123);
        assertEquals(123, recipe.getCookTime());
    }

    @Test
    final void testSetDescription() {
        recipe.setDescription("testGetDescription");
        assertEquals("testGetDescription", recipe.getDescription());
    }

    @Test
    final void testSetDifficulty() {
        recipe.setDifficulty(Difficulty.HARD);
        assertEquals(Difficulty.HARD, recipe.getDifficulty());
    }

    @Test
    final void testSetDirections() {
        recipe.setDifficulty(Difficulty.HARD);
        assertEquals(Difficulty.HARD, recipe.getDifficulty());
    }

    @Test
    final void testSetId() {
        recipe.setId(321L);
        assertEquals(321L, recipe.getId());
    }

    @Test
    final void testSetImage() {
        // TODO: to be implemented later
    }

    @Test
    final void testSetNotes() {
        final Notes notes = new Notes();
        notes.setRecipeNotes("testGetNotes");
        recipe.setNotes(notes);
        assertSame(notes, recipe.getNotes());
    }

    @Test
    final void testSetPreperationTime() {
        recipe.setPreperationTime(123);
        assertEquals(123, recipe.getPreperationTime());
    }

    @Test
    final void testSetServings() {
        recipe.setServings(321);
        assertEquals(321, recipe.getServings());
    }

    @Test
    final void testSetSource() {
        recipe.setSource("testGetSource");
        assertEquals("testGetSource", recipe.getSource());
    }

    @Test
    final void testSetUrl() {
        recipe.setUrl("testGetUrl");
        assertEquals("testGetUrl", recipe.getUrl());
    }
}
