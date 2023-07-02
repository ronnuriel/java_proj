package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderSeat_id")
    private int orderSeatId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Orders order;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    public OrderSeat() {
    }

    public OrderSeat(int orderSeatId, Orders order, Seat seat) {
        this.orderSeatId = orderSeatId;
//        this.order = order;
        this.seat = seat;
    }

    public int getOrderSeatId() {
        return orderSeatId;
    }

    public void setOrderSeatId(int orderSeatId) {
        this.orderSeatId = orderSeatId;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
// Constructors, getters, and setters
}
