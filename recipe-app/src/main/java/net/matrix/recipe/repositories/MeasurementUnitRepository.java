/**
 *
 */
package net.matrix.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.matrix.recipe.models.MeasurementUnit;

/**
 * A data repository for {@link MeasurementUnit measurement units}.
 *
 * @author anand.hemadri
 *
 */
@Repository
public interface MeasurementUnitRepository extends CrudRepository<MeasurementUnit, Long> {
    /**
     * Search a {@link MeasurementUnit unit} by description.
     *
     * @param measure
     * @return the {@link MeasurementUnit measurement unit}
     */
    Optional<MeasurementUnit> findByMeasure(String measure);
}
