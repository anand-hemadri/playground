/**
 *
 */
package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.MeasurementUnitCommand;
import net.matrix.recipe.models.MeasurementUnit;

/**
 * @author anand.hemadri
 *
 */
public class MeasurementUnitToMeasurementUnitCommand implements Converter<MeasurementUnit, MeasurementUnitCommand> {

    @Override
    public MeasurementUnitCommand convert(MeasurementUnit source) {
        synchronized (this) {
            MeasurementUnitCommand measurementUnitCommand = null;
            if (source != null) {
                measurementUnitCommand = new MeasurementUnitCommand();
                measurementUnitCommand.setId(source.getId());
                measurementUnitCommand.setMeasure(source.getMeasure());
            }
            return measurementUnitCommand;
        }
    }

}
