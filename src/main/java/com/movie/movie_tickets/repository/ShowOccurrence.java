package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Movie_Occurrence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowOccurrence extends CrudRepository<Movie_Occurrence, Long> {
}
