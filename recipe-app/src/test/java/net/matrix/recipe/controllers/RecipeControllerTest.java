package net.matrix.recipe.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import net.matrix.recipe.models.Recipe;
import net.matrix.recipe.services.RecipeService;

class RecipeControllerTest {
    @Mock
    RecipeService recipeService;

    RecipeController recipeController;

    @BeforeEach
    final void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeController = new RecipeController(recipeService);
    }

    @Test
    final void testRecipeController() {
        assertNotNull(recipeController);
    }

    @Test
    final void testShowById() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();

        mockMvc.perform(get("/recipe/show/1")).andExpect(status().isOk()).andExpect(view().name("recipe/show"));
    }

}
