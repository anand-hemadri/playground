package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.CategoryCommand;
import net.matrix.recipe.models.Category;

class CategoryCommandToCategoryTest {
    final CategoryCommandToCategory categoryConverter = new CategoryCommandToCategory();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(categoryConverter.convert(new CategoryCommand()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(categoryConverter.convert(null));
    }

    @Test
    final void testConvert() {
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(1L);
        categoryCommand.setDescription("Italiano");

        Category category = categoryConverter.convert(categoryCommand);

        assertEquals(1L, category.getId());
        assertEquals("Italiano", category.getDescription());
    }
}
