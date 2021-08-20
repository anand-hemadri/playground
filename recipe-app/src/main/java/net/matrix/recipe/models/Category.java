/**
 *
 */
package net.matrix.recipe.models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Models the category the {@link Recipe recipe} belongs to.
 *
 * @author anand.hemadri
 *
 */
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	@ManyToMany(mappedBy = "categories")
	private Set<Recipe> recipes = new HashSet<>();

	/**
	 * Constructs a new instance of {@link Category}.
	 */
	public Category() {
	}

	/**
	 * Assigns the recipes.
	 *
	 * @param recipe the recipe
	 * @return the {@link Category category}
	 */
	public Category addRecipe(Recipe recipe) {
		recipes.add(recipe);
		return this;
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
	 * Returns the recipes.
	 *
	 * @return the recipes
	 */
	public Set<Recipe> getRecipes() {
		return Collections.unmodifiableSet(recipes);
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
}
