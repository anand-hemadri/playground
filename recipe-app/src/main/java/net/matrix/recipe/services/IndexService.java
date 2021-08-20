/**
 *
 */
package net.matrix.recipe.services;

import java.util.Collections;
import java.util.Set;

import org.springframework.stereotype.Service;

import net.matrix.recipe.controllers.IndexController;

/**
 * A service implementation for the {@link IndexController}.
 *
 * @author anand.hemadri
 *
 */
@Service
public class IndexService {
	/**
	 * Constructs a new instance of {@link IndexService}.
	 */
	public IndexService() {
	}

	/**
	 * Returns the list of columns.
	 *
	 * @return the columns
	 */
	public Set<String> listColumns() {
		return Collections.unmodifiableSet(Set.of("Column 1", "Column 2", "Column 3"));
	}
}
