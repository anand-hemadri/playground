package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.models.Category;

class CategoryToCategoryCommandTest {
    final CategoryToCategoryCommand categoryConverter = new CategoryToCategoryCommand();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(categoryConverter.convert(new Category()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(categoryConverter.convert(null));
    }

    @Test
    final void testConvert() {
        Category category = new Category();
        category.setId(1L);
        category.setDescription("Italiano");

        CategoryCommand categoryCommand = categoryConverter.convert(category);

        assertEquals(1L, categoryCommand.getId());
        assertEquals("Italiano", categoryCommand.getDescription());
    }
}
