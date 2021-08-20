package net.matrix.recipe.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngredientTest {
	private final MeasurementUnit ounce = new MeasurementUnit("ounce");
	private final Ingredient ingredient = new Ingredient("Good Recipe", BigDecimal.TEN, ounce);;
	private final Recipe recipe = new Recipe();

	@BeforeEach
	final void setUp() {
		ingredient.setId(123L);
		ingredient.setRecipe(recipe);
	}

	@Test
	final void testGetAmount() {
		assertNotNull(ingredient);
		assertEquals(BigDecimal.TEN, ingredient.getAmount());
	}

	@Test
	final void testGetDescription() {
		assertNotNull(ingredient);
		assertEquals("Good Recipe", ingredient.getDescription());
	}

	@Test
	final void testGetId() {
		assertNotNull(ingredient);
		assertEquals(123L, ingredient.getId());
	}

	@Test
	final void testGetMeasurementUnit() {
		assertNotNull(ingredient);
		assertSame(ounce, ingredient.getMeasurementUnit());
	}

	@Test
	final void testGetRecipe() {
		assertNotNull(ingredient);
		assertSame(recipe, ingredient.getRecipe());
	}

	@Test
	final void testIngredient() {
		Ingredient i1 = new Ingredient();
		assertNotNull(i1);

		assertNull(i1.getId());
		assertNull(i1.getDescription());
		assertNull(i1.getAmount());
		assertNull(i1.getRecipe());
		assertNull(i1.getMeasurementUnit());

		MeasurementUnit unit = new MeasurementUnit();
		Ingredient i2 = new Ingredient("description", BigDecimal.ONE, unit);
		assertNull(i2.getId());
		assertEquals("description", i2.getDescription());
		assertEquals(BigDecimal.ONE, i2.getAmount());
		assertSame(unit, i2.getMeasurementUnit());
	}

	@Test
	final void testSetAmount() {
		assertNotNull(ingredient);
		assertEquals(BigDecimal.TEN, ingredient.getAmount());

		ingredient.setAmount(BigDecimal.valueOf(5L));
		assertEquals(BigDecimal.valueOf(5L), ingredient.getAmount());
	}

	@Test
	final void testSetDescription() {
		assertNotNull(ingredient);
		assertEquals("Good Recipe", ingredient.getDescription());

		ingredient.setDescription("Bad Recipe");
		assertEquals("Bad Recipe", ingredient.getDescription());

	}

	@Test
	final void testSetId() {
		assertNotNull(ingredient);
		assertEquals(123L, ingredient.getId());

		ingredient.setId(701L);
		assertEquals(701L, ingredient.getId());
	}

	@Test
	final void testSetMeasurementUnit() {
		assertNotNull(ingredient);
		assertSame(ounce, ingredient.getMeasurementUnit());

		MeasurementUnit pint = new MeasurementUnit("pint");
		ingredient.setMeasurementUnit(pint);
	}

	@Test
	final void testSetRecipe() {
		assertNotNull(ingredient);
		assertSame(recipe, ingredient.getRecipe());

		ingredient.setRecipe(null);
		assertNull(ingredient.getRecipe());
	}
}
