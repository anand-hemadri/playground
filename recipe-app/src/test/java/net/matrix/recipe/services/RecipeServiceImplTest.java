package net.matrix.recipe.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.repositories.RecipeRepository;


class RecipeServiceImplTest {
    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        when(recipeRepository.findAll()).thenReturn(Collections.singletonList(new Recipe()));
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    final void testFindById() {
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        when(recipeRepository.findById(anyLong())).thenReturn(Optional.of(recipe));

        Recipe recipeFound = recipeService.findById(1L);
        assertSame(recipe, recipeFound);

        verify(recipeRepository, atMostOnce()).findById(anyLong());
        verify(recipeRepository, never()).findAll();
    }

    @Test
    final void testFindById_NotFound() {
        when(recipeRepository.findById(anyLong())).thenReturn(Optional.empty());

        Exception exception = assertThrows(RuntimeException.class, () -> recipeService.findById(1L));
        assertEquals("No recipe found with id 1", exception.getMessage());

        verify(recipeRepository, atMostOnce()).findById(anyLong());
        verify(recipeRepository, never()).findAll();
    }

    @Test
    final void testListAllRecipe() {
        List<Recipe> recipes = recipeService.listAllRecipe();
        assertEquals(1, recipes.size());
        verify(recipeRepository, times(1)).findAll();
    }

    @Test
    final void testRecipeServiceImpl() {
        assertNotNull(recipeService);
    }
}
