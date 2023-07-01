package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @OneToOne
    @JoinColumn(name = "showOccurrence_id")
    private Movie_Occurrence showOccurrence;

    @ManyToMany
    @JoinTable(
            name = "user_orders",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;


    public Orders() {
    }

    public Orders(Movie_Occurrence showOccurrence, List<User> users) {
        this.showOccurrence = showOccurrence;
        this.users = users;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
