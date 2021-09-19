/**
 *
 */
package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.IngredientCommand;
import net.matrix.recipe.models.Ingredient;
import net.matrix.recipe.models.MeasurementUnit;

/**
 * @author anand.hemadri
 *
 */
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {
    private final MeasurementUnitToMeasurementUnitCommand converter;

    /**
     * Constructs a new instance of {@link IngredientToIngredientCommand}.
     *
     * @param converter the {@link MeasurementUnit} converter
     */
    public IngredientToIngredientCommand(MeasurementUnitToMeasurementUnitCommand converter) {
        this.converter = converter;
    }

    @Override
    public IngredientCommand convert(Ingredient source) {
        synchronized (this) {
            IngredientCommand ingredientCommand = null;
            if (source != null) {
                ingredientCommand = new IngredientCommand();
                ingredientCommand.setId(source.getId());
                ingredientCommand.setDescription(source.getDescription());
                ingredientCommand.setAmount(source.getAmount());
                ingredientCommand.setMeasurementUnit(converter.convert(source.getMeasurementUnit()));
                ingredientCommand.setRecipe(source.getRecipe());
            }
            return ingredientCommand;
        }
    }
}

