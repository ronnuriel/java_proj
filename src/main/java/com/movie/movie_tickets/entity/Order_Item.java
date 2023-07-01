package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "OrderItem")
public class Order_Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private int orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "seat_in_movieOccurrence_id")
    private Seat seatInMovieOccurrence;

    public Order_Item() {
    }

    public Order_Item(int orderItemId, Orders order, Seat seatInMovieOccurrence) {
        this.orderItemId = orderItemId;
        this.order = order;
        this.seatInMovieOccurrence = seatInMovieOccurrence;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Seat getSeatInMovieOccurrence() {
        return seatInMovieOccurrence;
    }

    public void setSeatInMovieOccurrence(Seat seatInMovieOccurrence) {
        this.seatInMovieOccurrence = seatInMovieOccurrence;
    }
}
