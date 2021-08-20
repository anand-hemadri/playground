package net.matrix.recipe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * Models a note in a {@link Recipe recipe}.
 *
 * @author anand.hemadri
 *
 */
@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Recipe recipe;

	@Lob
	private String recipeNotes;

	/**
	 * Constructs a new instance of {@link Notes}.
	 */
	public Notes() {
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
	 * Returns the recipe.
	 *
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}

	/**
	 * Returns the recipeNotes.
	 *
	 * @return the recipeNotes
	 */
	public String getRecipeNotes() {
		return recipeNotes;
	}

	/**
	 * Assigns the id.
	 *
	 * @param id the id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Assigns the recipe.
	 *
	 * @param recipe the recipe
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	/**
	 * Assigns the recipeNotes.
	 *
	 * @param recipeNotes the recipeNotes
	 */
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
}
