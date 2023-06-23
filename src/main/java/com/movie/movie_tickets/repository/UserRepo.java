package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Show_Occurrence;
import com.movie.movie_tickets.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
