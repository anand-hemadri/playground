package net.matrix.recipe.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class NotesTest {
    private final Notes notes = new Notes();

    @Test
    final void testGetId() {
        assertNotNull(notes);
    }

    @Test
    final void testGetRecipe() {
        assertNotNull(notes);
    }

    @Test
    final void testGetRecipeNotes() {
        assertNotNull(notes);
    }

    @Test
    final void testNotes() {
        assertNotNull(notes);
        assertNull(notes.getRecipe());
        assertNull(notes.getRecipeNotes());
    }

    @Test
    final void testSetId() {
        assertNotNull(notes);
        assertNull(notes.getId());

        notes.setId(123L);
        assertEquals(123L, notes.getId());
    }

    @Test
    final void testSetRecipe() {
        assertNotNull(notes);
        assertNull(notes.getRecipe());

        Recipe recipe = new Recipe();
        notes.setRecipe(recipe);
        assertSame(recipe, notes.getRecipe());
    }

    @Test
    final void testSetRecipeNotes() {
        assertNotNull(notes);
        assertNull(notes.getRecipeNotes());

        notes.setRecipeNotes("Some Recipe Notes");
        assertEquals("Some Recipe Notes", notes.getRecipeNotes());
    }
}
