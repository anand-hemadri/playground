package net.matrix.recipe.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Models ingredients used in a {@link Recipe recipe}.
 *
 * @author anand.hemadri
 *
 */
@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal amount;

	@Lob
	private String description;

	@ManyToOne
	private Recipe recipe;

	@OneToOne(fetch = FetchType.EAGER)
	private MeasurementUnit measurementUnit;

	/**
	 * Constructs a new instance of {@link Ingredient}.
	 */
	public Ingredient() {
	}

	/**
	 * Constructs a new instance of {@link Ingredient}.
	 *
	 * @param description     the description
	 * @param amount          the amount
	 * @param measurementUnit the unit of measure
	 */
	public Ingredient(String description, BigDecimal amount, MeasurementUnit measurementUnit) {
		this.amount = amount;
		this.description = description;
		this.measurementUnit = measurementUnit;
	}

	/**
	 * Returns the amount.
	 *
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
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
	 * Returns the recipe.
	 *
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}

	/**
	 * Returns the unitOfMeasure.
	 *
	 * @return the unitOfMeasure
	 */
	public MeasurementUnit getMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * Assigns the amount.
	 *
	 * @param amount the amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	/**
	 * Assigns the recipe.
	 *
	 * @param recipe the recipe
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	/**
	 * Assigns the unitOfMeasure.
	 *
	 * @param unitOfMeasure the unitOfMeasure
	 */
	public void setMeasurementUnit(MeasurementUnit unitOfMeasure) {
		this.measurementUnit = unitOfMeasure;
	}
}
