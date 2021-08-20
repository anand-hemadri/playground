package net.matrix.recipe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Models a unit of measure, for {@link Ingredient ingredient}.
 *
 * @author anand.hemadri
 *
 */
@Entity
public class MeasurementUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String measure;

    /**
     * Constructs a new instance of {@link MeasurementUnit}.
     */
    public MeasurementUnit() {}

    /**
     * Constructs a new instance of {@link MeasurementUnit}.
     *
     * @param measure
     */
    MeasurementUnit(String measure) {
        this.measure = measure;
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
