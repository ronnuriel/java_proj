package com.movie.movie_tickets.repository;

import com.movie.movie_tickets.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends CrudRepository<Orders, Long> {
}
