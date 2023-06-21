package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Show_Occurrence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowOccurrence extends CrudRepository<Show_Occurrence, Long> {
}
