/**
 *
 */
package net.matrix.recipe.command;

import java.util.HashSet;
import java.util.Set;

import net.matrix.recipe.models.Difficulty;
import net.matrix.recipe.models.Recipe;

/**
 * Backing bean for {@link Recipe recipe}.
 *
 * @author anand.hemadri
 *
 */
public class RecipeCommand {
    private Long id;
    private Set<CategoryCommand> categories = new HashSet<>();
    private Integer cookTime;
    private String description;
    private Difficulty difficulty;
    private String directions;
    private NotesCommand notes;
    private Integer preperationTime;
    private Integer servings;
    private String source;
    private String url;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Byte[] image;

    /**
     * Constructs a new instance of {@link RecipeCommand}.
     */
    public RecipeCommand() {}


    /**
     * Returns the categories.
     *
     * @return the categories
     */
    public Set<CategoryCommand> getCategories() {
        return categories;
    }


    /**
     * Returns the cookTime.
     *
     * @return the cookTime
     */
    public Integer getCookTime() {
        return cookTime;
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
     * Returns the difficulty.
     *
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }


    /**
     * Returns the directions.
     *
     * @return the directions
     */
    public String getDirections() {
        return directions;
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
     * Returns the image.
     *
     * @return the image
     */
    public Byte[] getImage() {
        return image;
    }


    /**
     * Returns the ingredients.
     *
     * @return the ingredients
     */
    public Set<IngredientCommand> getIngredients() {
        return ingredients;
    }


    /**
     * Returns the notes.
     *
     * @return the notes
     */
    public NotesCommand getNotes() {
        return notes;
    }


    /**
     * Returns the preperationTime.
     *
     * @return the preperationTime
     */
    public Integer getPreperationTime() {
        return preperationTime;
    }


    /**
     * Returns the servings.
     *
     * @return the servings
     */
    public Integer getServings() {
        return servings;
    }


    /**
     * Returns the source.
     *
     * @return the source
     */
    public String getSource() {
        return source;
    }


    /**
     * Returns the url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }


    /**
     * Assigns the categories.
     *
     * @param categories the categories
     */
    public void setCategories(Set<CategoryCommand> categories) {
        this.categories = categories;
    }


    /**
     * Assigns the cookTime.
     *
     * @param cookTime the cookTime
     */
    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
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
     * Assigns the difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }


    /**
     * Assigns the directions.
     *
     * @param directions the directions
     */
    public void setDirections(String directions) {
        this.directions = directions;
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
     * Assigns the image.
     *
     * @param image the image
     */
    public void setImage(Byte[] image) {
        this.image = image;
    }


    /**
     * Assigns the ingredients.
     *
     * @param ingredients the ingredients
     */
    public void setIngredients(Set<IngredientCommand> ingredients) {
        this.ingredients = ingredients;
    }


    /**
     * Assigns the notes.
     *
     * @param notes the notes
     */
    public void setNotes(NotesCommand notes) {
        this.notes = notes;
    }


    /**
     * Assigns the preperationTime.
     *
     * @param preperationTime the preperationTime
     */
    public void setPreperationTime(Integer preperationTime) {
        this.preperationTime = preperationTime;
    }


    /**
     * Assigns the servings.
     *
     * @param servings the servings
     */
    public void setServings(Integer servings) {
        this.servings = servings;
    }


    /**
     * Assigns the source.
     *
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source;
    }


    /**
     * Assigns the url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
