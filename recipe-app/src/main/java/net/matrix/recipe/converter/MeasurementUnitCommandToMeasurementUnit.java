package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.MeasurementUnitCommand;
import net.matrix.recipe.models.MeasurementUnit;

/**
 * @author anand.hemadri
 *
 */
public class MeasurementUnitCommandToMeasurementUnit implements Converter<MeasurementUnitCommand, MeasurementUnit> {

    @Override
    public MeasurementUnit convert(MeasurementUnitCommand source) {
        synchronized (this) {
            MeasurementUnit measurementUnit = null;
            if (source != null) {
                measurementUnit = new MeasurementUnit();
                measurementUnit.setId(source.getId());
                measurementUnit.setMeasure(source.getMeasure());
            }
            return measurementUnit;
        }
    }
}
