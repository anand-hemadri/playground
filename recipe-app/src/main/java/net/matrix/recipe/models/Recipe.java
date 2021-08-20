/**
 *
 */
package net.matrix.recipe.models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Models the recipe entity.
 *
 * @author anand.hemadri
 *
 */
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();
    private Integer cookTime;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @Lob
    private String directions;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    private Integer preperationTime;
    private Integer servings;

    private String source;

    private String url;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();

    @Lob
    private Byte[] image;

    /**
     * Constructs a new instance of {@link Recipe recipe}.
     */
    public Recipe() {

    }

    /**
     * Add an {@link Category category} to the {@link Recipe recipe}.
     *
     * @param category the categories
     * @return Recipe
     */
    public Recipe addCategory(Category category) {
        categories.add(category);
        return this;
    }

    /**
     * Add an {@link Ingredient ingredient} to the {@link Recipe recipe}.
     *
     * @param ingredient the ingredients
     * @return the {@link Recipe recipe}
     */
    public Recipe addIngredient(Ingredient ingredient) {
        ingredient.setRecipe(this);
        ingredients.add(ingredient);
        return this;
    }

    /**
     * Returns the categories.
     *
     * @return the categories
     */
    public Set<Category> getCategories() {
        return Collections.unmodifiableSet(categories);
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
    public Set<Ingredient> getIngredients() {
        return Collections.unmodifiableSet(ingredients);
    }

    /**
     * Returns the notes.
     *
     * @return the notes
     */
    public Notes getNotes() {
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
     * Assigns the notes.
     *
     * @param notes the notes
     */
    public void setNotes(Notes notes) {
        this.notes = notes;
        notes.setRecipe(this);
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
