package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepo extends CrudRepository<Movie, Long> {
}
