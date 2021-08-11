package net.matrix.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main class for {@link SimplewebappApplication simple web application}.
 *
 * @author anand.hemadri
 */
@SpringBootApplication
@ComponentScan(basePackages = { "net.matrix.bookstore", "net.matrix.petclinic" })
public class SimplewebappApplication {

	/**
	 * Main method.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimplewebappApplication.class, args);
	}

}
