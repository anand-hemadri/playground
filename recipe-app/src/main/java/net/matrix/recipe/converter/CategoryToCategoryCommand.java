/**
 *
 */
package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.models.Category;

/**
 * Converter to convert {@link Category category}.
 *
 * @author anand.hemadri
 *
 */
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    /**
     * Constructs a new instance of {@link CategoryToCategoryCommand}.
     */
    public CategoryToCategoryCommand() {}

    @Override
    public CategoryCommand convert(Category source) {
        synchronized (this) {
            CategoryCommand categoryCommand = null;
            if (source != null) {
                categoryCommand = new CategoryCommand();
                categoryCommand.setId(source.getId());
                categoryCommand.setDescription(source.getDescription());
            }
            return categoryCommand;
        }
    }

}
