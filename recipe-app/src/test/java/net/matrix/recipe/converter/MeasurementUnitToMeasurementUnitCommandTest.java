package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.MeasurementUnitCommand;
import net.matrix.recipe.models.MeasurementUnit;

class MeasurementUnitToMeasurementUnitCommandTest {
    final MeasurementUnitToMeasurementUnitCommand converter = new MeasurementUnitToMeasurementUnitCommand();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(converter.convert(new MeasurementUnit()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(converter.convert(null));
    }

    @Test
    final void testConvert() {
        MeasurementUnit measurementUnit = new MeasurementUnit();
        measurementUnit.setId(123L);
        measurementUnit.setMeasure("Pint");

        MeasurementUnitCommand measurementUnitCommand = converter.convert(measurementUnit);
        assertEquals(123L, measurementUnitCommand.getId());
        assertEquals("Pint", measurementUnit.getMeasure());
    }
}
