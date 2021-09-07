/**
 *
 */
package net.matrix.recipe.command;

import net.matrix.recipe.models.MeasurementUnit;

/**
 * Backing bean for {@link MeasurementUnit measurement unit}.
 *
 * @author anand.hemadri
 *
 */
public class MeasurementUnitCommand {
    private Long id;
    private String measure;

    /**
     * Constructs a new instance of {@link MeasurementUnitCommand}.
     */
    public MeasurementUnitCommand() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Returns the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Returns the measure.
     *
     * @return the measure
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * Assigns the id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Assigns the measure.
     *
     * @param measure the measure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }

}
