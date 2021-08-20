package net.matrix.recipe.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class MeasurementUnitTest {
    private final MeasurementUnit measurementUnit = new MeasurementUnit("pint");

    @Test
    final void testGetId() {
        assertNotNull(measurementUnit);
        assertNull(measurementUnit.getId());
    }

    @Test
    final void testGetMeasure() {
        assertNotNull(measurementUnit);
        assertEquals("pint", measurementUnit.getMeasure());
    }

    @Test
    final void testMeasurementUnit() {
        MeasurementUnit unit = new MeasurementUnit();
        assertNotNull(unit);
        assertNull(unit.getMeasure());

        MeasurementUnit ounce = new MeasurementUnit("ounce");
        assertNotNull(ounce);
        assertEquals("ounce", ounce.getMeasure());
    }

    @Test
    final void testSetId() {
        assertNotNull(measurementUnit);
        assertNull(measurementUnit.getId());

        measurementUnit.setId(123L);
        assertEquals(123L, measurementUnit.getId());
    }

    @Test
    final void testSetMeasure() {
        assertNotNull(measurementUnit);
        assertEquals("pint", measurementUnit.getMeasure());

        measurementUnit.setMeasure("ounce");
        assertEquals("ounce", measurementUnit.getMeasure());
    }

}

