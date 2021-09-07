package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.IngredientCommand;
import net.matrix.recipe.command.MeasurementUnitCommand;
import net.matrix.recipe.models.Ingredient;
import net.matrix.recipe.models.MeasurementUnit;

class IngredientCommandToIngredientTest {
    private IngredientCommandToIngredient ingredientsConverter;
    private MeasurementUnitCommandToMeasurementUnit measureConverter;

    @BeforeEach
    void setUp() {
        measureConverter = new MeasurementUnitCommandToMeasurementUnit();
        ingredientsConverter = new IngredientCommandToIngredient(measureConverter);
    }

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(ingredientsConverter.convert(new IngredientCommand()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(ingredientsConverter.convert(null));
    }

    @Test
    final void testConvert() {
        IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setId(123L);
        ingredientCommand.setDescription("Tomatoes");
        ingredientCommand.setAmount(BigDecimal.valueOf(10));
        MeasurementUnitCommand measurementUnitCommand = new MeasurementUnitCommand();
        measurementUnitCommand.setId(321L);
        measurementUnitCommand.setMeasure("oz");
        ingredientCommand.setMeasurementUnit(measurementUnitCommand);

        Ingredient ingredient = ingredientsConverter.convert(ingredientCommand);

        assertEquals(123L, ingredient.getId());
        assertEquals("Tomatoes", ingredient.getDescription());
        assertEquals(BigDecimal.valueOf(10), ingredient.getAmount());

        MeasurementUnit measurementUnit = measureConverter.convert(measurementUnitCommand);
        assertEquals(321L, measurementUnit.getId());
        assertEquals("oz", measurementUnit.getMeasure());
    }
}
