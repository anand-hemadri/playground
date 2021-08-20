package net.matrix.recipe.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.repositories.RecipeRepository;


class RecipeServiceImplTest {
    RecipeServiceImpl recipeServiceImpl;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        when(recipeRepository.findAll()).thenReturn(Collections.singletonList(new Recipe()));
        recipeServiceImpl = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    final void testListAllRecipe() {
        List<Recipe> recipes = recipeServiceImpl.listAllRecipe();
        assertEquals(1, recipes.size());
        verify(recipeRepository, times(1)).findAll();
    }

    @Test
    final void testRecipeServiceImpl() {
        assertNotNull(recipeServiceImpl);
    }

}
