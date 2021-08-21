/**
 *
 */
package net.matrix.recipe.repositories;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * An integration test for {@link CategoryRepository}.
 *
 * @author anand.hemadri
 *
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
class CategoryRepositoryIT {

    @BeforeEach
    void setUp() {

    }

    @Test
    final void testFindByDescription() {
        System.out.println("testFindByDescription");
        fail("Not yet implemented");
    }

}
