package com.movie.movie_tickets.entity;

import jakarta.persistence.*;


@Entity
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hall_id")
    private int hallId;

    private int hall_num;

    public Hall() {
    }

    public Hall(int hall_num) {
        this.hall_num = hall_num;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public int getHall_num() {
        return hall_num;
    }

    public void setHall_num(int hall_num) {
        this.hall_num = hall_num;
    }
}