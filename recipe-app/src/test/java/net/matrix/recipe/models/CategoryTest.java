package net.matrix.recipe.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Set;

import org.junit.jupiter.api.Test;

class CategoryTest {
    private final Category category = new Category();

    @Test
    final void testAddRecipe() throws Exception {
        Set<Recipe> recipes = category.getRecipes();
        assertEquals(0, recipes.size());
        assertThrows(UnsupportedOperationException.class, () -> recipes.add(new Recipe()));

        Recipe r1 = new Recipe();
        r1.setId(1L);
        category.addRecipe(r1);

        Recipe r2 = new Recipe();
        r2.setId(2L);
        category.addRecipe(r2);

        assertEquals(2, category.getRecipes().size());


    }

    @Test
    final void testCategory() throws Exception {
        assertNotNull(category);
        assertNull(category.getId());
        assertNull(category.getDescription());
        assertNotNull(category.getRecipes());
        assertEquals(0, category.getRecipes().size());
    }

    @Test
    final void testGetDescription() throws Exception {
        assertNull(category.getDescription());

        category.setDescription("Get Description");
        assertEquals("Get Description", category.getDescription());
    }

    @Test
    final void testGetId() throws Exception {
        assertNull(category.getId());

        category.setId(123L);
        assertEquals(123L, category.getId());
    }

    @Test
    final void testSetDescription() throws Exception {
        assertNull(category.getDescription());

        category.setDescription("Set Description");
        assertEquals("Set Description", category.getDescription());
    }

    @Test
    final void testSetId() throws Exception {
        assertNull(category.getId());

        category.setId(321L);
        assertEquals(321L, category.getId());
    }

}
