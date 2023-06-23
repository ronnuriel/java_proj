package com.movie.movie_tickets;

import com.movie.movie_tickets.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
import java.util.Date;
@SpringBootApplication
public class MovieTicketsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello from MovieTicketsApplication!");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_tickets");
//
//		// Create the EntityManager
//		EntityManager em = emf.createEntityManager();
//
//		// Create entities
//		User user = new User(11230, "John Doe", "john@example.com", "1234567890");
//		Hall hall = new Hall(1, 1);
//		Movie movie = new Movie(999, "Movie Name", "Movie Description");
//		Show_Occurrence showOccurrence = new Show_Occurrence(190123, movie, new Date(), 100, 100);
//		Seat seat = new Seat(1, 1, 1, hall);
//
//		// Establish associations
//		showOccurrence.setMovie(movie);
//		seat.setHall(hall);
//
//		// Create an order
//		Orders order = new Orders(1, showOccurrence, user);
//		seat.setOrderId(order.getOrderId());
//
//		// Start a transaction
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//
//		try {
//			// Persist entities
//			em.persist(user);
//			em.persist(hall);
//			em.persist(movie);
//			em.persist(showOccurrence);
//			em.persist(seat);
//			em.persist(order);
//
//			// Commit the transaction
//			tx.commit();
//
//			System.out.println("Entities persisted successfully.");
//		} catch (Exception e) {
//			// Rollback the transaction in case of any exception
//			tx.rollback();
//			e.printStackTrace();
//		} finally {
//			// Close the EntityManager
//			em.close();
//		}
//
//		// Close the EntityManagerFactory
//		emf.close();
	}
}