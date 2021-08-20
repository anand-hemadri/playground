package net.matrix.recipe.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import net.matrix.recipe.services.RecipeService;

class IndexControllerTest {
	@Mock
	private RecipeService recipeService;
	@Mock
	private Model model;

	@BeforeEach
	final void setUp() {
		MockitoAnnotations.openMocks(this);
		when(recipeService.listAllRecipe()).thenReturn(Collections.emptyList());
		when(model.addAttribute("recipe", recipeService.listAllRecipe())).thenReturn(model);
		when(model.getAttribute("recipes")).thenReturn(Collections.emptyList());
	}

	@Test
	final void testIndexPage() throws Exception {
		assertEquals("index", new IndexController(recipeService).indexPage(model));
		verify(recipeService, times(2)).listAllRecipe();
		verify(model, times(1)).addAttribute(eq("recipes"), anyList());
		verify(model, times(1)).addAttribute(eq("recipes"), same(Collections.emptyList()));
	}

	@Test
	final void testMockMVC() throws Exception {
		IndexController controller = new IndexController(recipeService);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
	}
}
