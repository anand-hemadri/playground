/**
 *
 */
package net.matrix.recipe.command;

import java.math.BigDecimal;

import net.matrix.recipe.models.Ingredient;
import net.matrix.recipe.models.Recipe;

/**
 * Backing bean for {@link Ingredient ingredient}.
 *
 * @author anand.hemadri
 *
 */
public class IngredientCommand {
    private Long id;
    private BigDecimal amount;
    private String description;
    private Recipe recipe;
    private MeasurementUnitCommand measurementUnitCommand;

    /**
     * Constructs a new instance of {@link IngredientCommand}.
     */
    public IngredientCommand() {}

    /**
     * Returns the amount.
     *
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Returns the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
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
     * Returns the measurementUnit.
     *
     * @return the measurementUnit
     */
    public MeasurementUnitCommand getMeasurementUnit() {
        return measurementUnitCommand;
    }

    /**
     * Returns the recipe.
     *
     * @return the recipe
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * Assigns the amount.
     *
     * @param amount the amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Assigns the description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Assigns the measurementUnit.
     *
     * @param measurementUnit the measurementUnit
     */
    public void setMeasurementUnit(MeasurementUnitCommand measurementUnit) {
        this.measurementUnitCommand = measurementUnit;
    }

    /**
     * Assigns the recipe.
     *
     * @param recipe the recipe
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
