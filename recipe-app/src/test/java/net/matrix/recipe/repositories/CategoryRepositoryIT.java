/**
 *
 */
package net.matrix.recipe.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import net.matrix.recipe.models.Category;

/**
 * An integration test for {@link CategoryRepository}.
 *
 * @author anand.hemadri
 *
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
class CategoryRepositoryIT {
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    final void testFindByDescription() {
        Category category = categoryRepository.findByDescription("American").get();
        assertEquals("American", category.getDescription());
    }

}
