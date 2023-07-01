package com.movie.movie_tickets;

import com.movie.movie_tickets.entity.*;
import com.movie.movie_tickets.repository.MovieRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MovieTicketsApplicationTests {

//	@Autowired
//	private MovieRepo movieRepository;
//
//	@PersistenceContext
//	private EntityManager entityManager;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testSaveMovie() {
//		// Create a movie entity
//		Movie movie = new Movie();
//		movie.setMovieName("Avengers: Endgame");
//		movie.setMovieDescription("Superhero movie");
//
//		// Save the movie to the database
//		Movie savedMovie = movieRepository.save(movie);
//
//		// Verify the movie is saved with a generated ID
//		assertNotNull(savedMovie.getMovieId());
//
//		// Retrieve the movie from the database
//		Movie retrievedMovie = entityManager.find(Movie.class, savedMovie.getMovieId());
//
//		// Verify the retrieved movie matches the saved movie
//		assertEquals(savedMovie.getMovieId(), retrievedMovie.getMovieId());
//		assertEquals(savedMovie.getMovieName(), retrievedMovie.getMovieName());
//		assertEquals(savedMovie.getMovieDescription(), retrievedMovie.getMovieDescription());
//	}
}
