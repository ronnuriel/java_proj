package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Reviews;
import com.movie.movie_tickets.entity.Seat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepo extends CrudRepository<Reviews, Long> {
}
