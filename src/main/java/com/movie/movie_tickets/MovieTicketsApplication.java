package com.movie.movie_tickets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieTicketsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello from MovieTicketsApplication!");
		// Additional logic or method calls can be added here
	}
}
