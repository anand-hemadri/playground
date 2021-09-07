package net.matrix.recipe.command;

import net.matrix.recipe.models.Category;

/**
 * Backing bean for {@link Category category}.
 *
 * @author anand.hemadri
 *
 */
// import org.springframework.core.convert.converter.Converter;

public class CategoryCommand {

    private Long id;
    private String description;

    /**
     * Constructs a new instance of {@link CategoryCommand}.
     */
    public CategoryCommand() {}

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
