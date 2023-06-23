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
    private Show_Occurrence showOccurrence;

    public Orders() {
    }

    public Orders(int orderId, Show_Occurrence showOccurrence) {
        orderId = orderId;
        this.showOccurrence = showOccurrence;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        orderId = orderId;
    }

    public Show_Occurrence getShowOccurrence() {
        return showOccurrence;
    }

    public void setShowOccurrence(Show_Occurrence showOccurrence) {
        this.showOccurrence = showOccurrence;
    }
}
