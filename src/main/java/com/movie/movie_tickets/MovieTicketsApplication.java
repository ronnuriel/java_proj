package com.movie.movie_tickets;

import com.movie.movie_tickets.entity.*;
import com.movie.movie_tickets.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class MovieTicketsApplication implements CommandLineRunner {

	@Autowired
	private MovieRepo movieRepo;


	@Autowired
	private OrdersRepo ordersRepo;


	@Autowired
	private ReviewsRepo reviewsRepo;


	@Autowired
	private UserRepo userRepo;


	@Autowired
	private HallRepo hallRepo;

	@Autowired
	private SeatRepo seatRepo;


	@Autowired
	private MovieOccurrenceRepo movieOccurrenceRepo;


	public static void main(String[] args) {
		SpringApplication.run(MovieTicketsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello from MovieTicketsApplication!");
		// Create sample data
		// Create movies
		Movie movie1 = new Movie("Avengers: Endgame", "Superhero movie");
		Movie movie2 = new Movie("Inception", "Mind-bending thriller");

		// Save movies to the database
		movieRepo.save(movie1);
		movieRepo.save(movie2);

		// Create halls
		Hall hall1 = new Hall(133);
		Hall hall2 = new Hall(1232);

//		// Save halls to the database
		hallRepo.save(hall1);
		hallRepo.save(hall2);
////
////		// Create seats for hall 1
		Seat seat1 = new Seat(1, 1, hall1);
		Seat seat2 = new Seat(1, 2, hall1);
//
//		// Create seats for hall 2
		Seat seat3 = new Seat(1, 1, hall2);
		Seat seat4 = new Seat(1, 2, hall2);
////
////		// Save seats to the database
		// Create movie occurrences
		List<Seat> seats1 = new ArrayList<>();
		seats1.add(seat1);
		seats1.add(seat2);
		seats1.add(seat3);
		seats1.add(seat4);
//
		List<Seat> seats2 = new ArrayList<>();
		seats2.add(seat3);
		seats2.add(seat4);

		seatRepo.save(seat1);
		seatRepo.save(seat2);
		seatRepo.save(seat3);
		seatRepo.save(seat4);
//



		Movie_Occurrence movieOccurrence1 = new Movie_Occurrence(movie1, new Date(), 100, 100, seats1);
		Movie_Occurrence movieOccurrence2 = new Movie_Occurrence(movie2, new Date(), 150, 150, seats2);

//		seat1.setMovieOccurrences(Arrays.asList(movieOccurrence1));
//		seat2.setMovieOccurrences(Arrays.asList(movieOccurrence1));


//		// Save movie occurrences to the database



		movieOccurrenceRepo.save(movieOccurrence1);
		movieOccurrenceRepo.save(movieOccurrence2);

		// Create users
		User user1 = new User("John Doe", "john@example.com", "1234567890");
		User user2 = new User("Jane Smith", "jane@example.com", "987654321");
//
		// Save users to the database
		userRepo.save(user1);
		userRepo.save(user2);

//		 Create orders
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
////
		Orders order1 = new Orders(movieOccurrence1, users);
		Orders order2 = new Orders(movieOccurrence2, users);
////
////		// Save orders to the database
		ordersRepo.save(order1);
		ordersRepo.save(order2);
//
////		 Create reviews
//		Reviews review1 = new Reviews("Great movie!", movie1);
//		Reviews review2 = new Reviews("Awesome film!", movie2);
//
//		// Save reviews to the database
//		seatRepo.save(review1);
//		seatRepo.save(review2);
	}
}
