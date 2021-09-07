/**
 *
 */
package net.matrix.recipe.converter;

import org.springframework.core.convert.converter.Converter;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.models.Category;

/**
 * @author anand.hemadri
 *
 */
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Override
    public Category convert(CategoryCommand source) {
        synchronized (this) {
            Category category = null;
            if (source != null) {
                category = new Category();
                category.setId(source.getId());
                category.setDescription(source.getDescription());
            }
            return category;
        }
    }

}
