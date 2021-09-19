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

class IngredientToIngredientCommandTest {
    private IngredientToIngredientCommand ingredientsConverter;
    private MeasurementUnitToMeasurementUnitCommand measureConverter;

    @BeforeEach
    void setUp() {
        measureConverter = new MeasurementUnitToMeasurementUnitCommand();
        ingredientsConverter = new IngredientToIngredientCommand(measureConverter);
    }

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(ingredientsConverter.convert(new Ingredient()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(ingredientsConverter.convert(null));
    }

    @Test
    final void testConvert() {
        Ingredient ingredient = new Ingredient();
        ingredient.setId(123L);
        ingredient.setDescription("Tomatoes");
        ingredient.setAmount(BigDecimal.valueOf(10));
        MeasurementUnit measurementUnit = new MeasurementUnit();
        measurementUnit.setId(321L);
        measurementUnit.setMeasure("oz");
        ingredient.setMeasurementUnit(measurementUnit);

        IngredientCommand ingredientCommand = ingredientsConverter.convert(ingredient);

        assertEquals(123L, ingredientCommand.getId());
        assertEquals("Tomatoes", ingredientCommand.getDescription());
        assertEquals(BigDecimal.valueOf(10), ingredientCommand.getAmount());

        MeasurementUnitCommand measurementUnitCommand = measureConverter.convert(measurementUnit);
        assertEquals(321L, measurementUnitCommand.getId());
        assertEquals("oz", measurementUnitCommand.getMeasure());
    }
}
