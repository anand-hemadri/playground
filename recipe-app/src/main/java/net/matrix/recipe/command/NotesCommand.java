/**
 *
 */
package net.matrix.recipe.command;

import net.matrix.recipe.models.Notes;

/**
 * Backing bean for {@link Notes notes}.
 *
 * @author anand.hemadri
 *
 */
public class NotesCommand {
    private Long id;
    private RecipeCommand recipe;
    private String recipeNotes;

    /**
     * Constructs a new instance of {@link NotesCommand}.
     */
    public NotesCommand() {
        // TODO Auto-generated constructor stub
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
    public RecipeCommand getRecipe() {
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
    public void setRecipe(RecipeCommand recipe) {
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
