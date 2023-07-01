package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @OneToOne
    @JoinColumn(name = "showOccurrence_id")
    private Movie_Occurrence showOccurrence;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Orders() {
    }

    public Orders(int orderId, Movie_Occurrence showOccurrence, User user) {
        this.orderId = orderId;
        this.showOccurrence = showOccurrence;
        this.user = user;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Movie_Occurrence getShowOccurrence() {
        return showOccurrence;
    }

    public void setShowOccurrence(Movie_Occurrence showOccurrence) {
        this.showOccurrence = showOccurrence;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
