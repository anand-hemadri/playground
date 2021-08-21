package net.matrix.recipe.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import net.matrix.recipe.models.MeasurementUnit;

/**
 * An integration test for {@link MeasurementUnitRepository}.
 *
 * @author anand.hemadri
 *
 */
@SuppressWarnings("javadoc")
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class MeasurementUnitRepositoryIT {
    @Autowired
    private MeasurementUnitRepository measurementUnitRepository;

    public MeasurementUnitRepositoryIT(MeasurementUnitRepository measurementUnitRepository) {
        this.measurementUnitRepository = measurementUnitRepository;
    }


    @BeforeEach
    final void setUp() {

    }


    @Test
    @Disabled
    final void testFindByMeasure() {
        Optional<MeasurementUnit> measure = measurementUnitRepository.findByMeasure("Teaspoon");
        assertNotNull(measure);
        assertNotNull(measure.get());
        assertEquals("Teaspoon", measure.get().getMeasure());
    }

}
