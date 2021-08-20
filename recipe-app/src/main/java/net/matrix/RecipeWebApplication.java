package net.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple web application for recipes.
 *
 * @author anand.hemadri
 *
 */
@SpringBootApplication
public class RecipeWebApplication {

	@SuppressWarnings("javadoc")
	public static void main(String[] args) {
		SpringApplication.run(RecipeWebApplication.class, args);
	}

}
