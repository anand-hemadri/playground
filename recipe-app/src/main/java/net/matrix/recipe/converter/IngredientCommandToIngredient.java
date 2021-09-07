package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.IngredientCommand;
import net.matrix.recipe.models.Ingredient;

/**
 * @author anand.hemadri
 *
 */
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private final MeasurementUnitCommandToMeasurementUnit converter;

    /**
     * Constructs a new instance of {@link IngredientCommandToIngredient}.
     *
     * @param converter
     */
    public IngredientCommandToIngredient(MeasurementUnitCommandToMeasurementUnit converter) {
        this.converter = converter;
    }

    @Override
    public Ingredient convert(IngredientCommand source) {
        synchronized (this) {
            Ingredient ingredient = null;
            if (source != null) {
                ingredient = new Ingredient();
                ingredient.setId(source.getId());
                ingredient.setDescription(source.getDescription());
                ingredient.setAmount(source.getAmount());
                ingredient.setMeasurementUnit(converter.convert(source.getMeasurementUnit()));
            }
            return ingredient;
        }
    }

}
