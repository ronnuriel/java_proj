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
	private OrderSeatRepo orderSeatRepo;

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

		// Save halls to the database
		hallRepo.save(hall1);
		hallRepo.save(hall2);

		// Create seats for hall 1
		Seat seat1 = new Seat(1, 1, hall1);
		Seat seat2 = new Seat(1, 2, hall1);

		// Create seats for hall 2
		Seat seat3 = new Seat(1, 1, hall2);
		Seat seat4 = new Seat(1, 2, hall2);

		// Save seats to the database
		// Create movie occurrences
		List<Seat> seats_list1 = new ArrayList<>();
		seats_list1.add(seat1);
		seats_list1.add(seat2);
//		seats_list1.add(seat3);
//		seats_list1.add(seat4);

		List<Seat> seats_list2 = new ArrayList<>();
		seats_list2.add(seat3);
		seats_list2.add(seat4);

		seatRepo.save(seat1);
		seatRepo.save(seat2);
		seatRepo.save(seat3);
		seatRepo.save(seat4);

		Movie_Occurrence movieOccurrence1 = new Movie_Occurrence(movie1, new Date(), 100, 100, seats_list1);
		Movie_Occurrence movieOccurrence2 = new Movie_Occurrence(movie2, new Date(), 150, 150, seats_list2);

		movieOccurrenceRepo.save(movieOccurrence1);
		movieOccurrenceRepo.save(movieOccurrence2);

//		// Create users
		User user1 = new User("John Doe", "john@example.com", "1234567890");
		User user2 = new User("Jane Smith", "jane@example.com", "987654321");

//		// Save users to the database
		userRepo.save(user1);
		userRepo.save(user2);

// Create orders

		Orders ordersMovie1 = new Orders();





//		List<Seat> selectedSeats_user1 = new ArrayList<>();
//
//		if (order_seat(seat1.getSeatId(), movieOccurrence1)) {
//			selectedSeats_user1.add(seat1);
//		}
//		if (order_seat(seat2.getSeatId(), movieOccurrence1)) {
//			selectedSeats_user1.add(seat2);
//		}
//
//		Orders ordersMovie1 = new Orders();
//		ordersMovie1.setMovieOccurrence(movieOccurrence1);
//		ordersRepo.save(ordersMovie1);


//		List<OrderSeat> orderSeats = new ArrayList<>();
//		for (Seat selectedSeat : selectedSeats_user1) {
//			OrderSeat orderSeat = new OrderSeat();
//			orderSeat.setOrder(ordersMovie1);
//			orderSeat.setSeat(selectedSeat);
//			orderSeats.add(orderSeat);
//		}

//		ordersMovie1.setOrderSeats(orderSeats);
//		ordersRepo.save(ordersMovie1);
//		OrderSeat orderSeat1 = new OrderSeat(seat1, orderMovie1);




//		// Create orders
//		Orders order1 = new Orders(movieOccurrence1, users);
//		Orders order2 = new Orders(movieOccurrence2, users);

////		// Save orders to the database
//		ordersRepo.save(order1);
//		ordersRepo.save(order2);
////
////		 Create reviews
//		Reviews review1 = new Reviews("Great movie!", movie1);
//		Reviews review2 = new Reviews("Awesome film!", movie2);
////
////		// Save reviews to the database
//		reviewsRepo.save(review1);
//		reviewsRepo.save(review2);
	}


	public Boolean check_seat_avilable(long seatId, Movie_Occurrence movieOccurrence) {
		Seat selectedSeat = movieOccurrence.findSeatById(seatId);

		if (movieOccurrence != null && selectedSeat != null) {
			// Check if the selected seat is available
			boolean isSeatAvailable = movieOccurrence.getSeatStatus().get(selectedSeat);

			if (isSeatAvailable) {
				// Seat is available
				System.out.println("Seat " + selectedSeat.getSeatId() + " is available for movie occurrence " + movieOccurrence.getMovieOccurrenceId());
				return true;

			} else {
				// Seat is not available
				System.out.println("Seat " + selectedSeat.getSeatId() + " is not available for movie occurrence " + movieOccurrence.getMovieOccurrenceId());
				return false;
			}
		} else {
			// Movie occurrence or seat not found
			System.out.println("Movie occurrence or seat not found");
			return false;
		}
	}

	public Boolean order_seat(long seatId, Movie_Occurrence movieOccurrence) {

		if (check_seat_avilable(seatId, movieOccurrence)) {

			Seat selectedSeat = movieOccurrence.findSeatById(seatId);
			movieOccurrence.markSeatAsTaken(selectedSeat);
			movieOccurrenceRepo.save(movieOccurrence);
			return true;
		}

		return false;
	}
}
