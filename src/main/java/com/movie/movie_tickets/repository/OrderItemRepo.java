package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Movie;
import com.movie.movie_tickets.entity.Order_Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends CrudRepository<Order_Item, Long> {
}
