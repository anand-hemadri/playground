package net.matrix.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "net.matrix.bookstore", "net.matrix.petclinic" })
public class SimplewebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplewebappApplication.class, args);
	}

}
