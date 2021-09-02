package net.matrix.recipe.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.matrix.recipe.models.MeasurementUnit;

/**
 * An integration test for {@link MeasurementUnitRepository}.
 *
 * @author anand.hemadri
 *
 */
@DataJpaTest
class MeasurementUnitRepositoryIT {
    @Autowired
    private MeasurementUnitRepository measurementUnitRepository;

    @Test
    final void testFindByMeasure() {
        Optional<MeasurementUnit> measure = measurementUnitRepository.findByMeasure("Teaspoon");
        assertEquals("Teaspoon", measure.get().getMeasure());
    }

}
