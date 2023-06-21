package com.movie.movie_tickets.entity;

import jakarta.persistence.*;


@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showOccurrence_id")
    private int showOccurrenceId;
}