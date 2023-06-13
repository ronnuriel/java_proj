//package com.movie.movie_tickets.entity;
//
//import com.movie.movie_tickets.entity.Movie;
//import com.movie.movie_tickets.entity.Theatre;
//import jakarta.persistence.*;
//
//
//import java.util.Date;
//
//@Entity
//public class Show {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int showId;
//
//    @ManyToOne
//    private Movie movie;
//
//    @ManyToOne
//    private Theatre theatre;
//
//    private Date showTime;
//    private int availableSeats;
//
//    // Constructors, getters, and setters
//
//    public Show() {
//    }
//
//    public Show(Movie movie, Theatre theatre, Date showTime, int availableSeats) {
//        this.movie = movie;
//        this.theatre = theatre;
//        this.showTime = showTime;
//        this.availableSeats = availableSeats;
//    }
//
//    public int getShowId() {
//        return showId;
//    }
//
//    public void setShowId(int showId) {
//        this.showId = showId;
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//
//    public Theatre getTheatre() {
//        return theatre;
//    }
//
//    public void setTheatre(Theatre theatre) {
//        this.theatre = theatre;
//    }
//
//    public Date getShowTime() {
//        return showTime;
//    }
//
//    public void setShowTime(Date showTime) {
//        this.showTime = showTime;
//    }
//
//    public int getAvailableSeats() {
//        return availableSeats;
//    }
//
//    public void setAvailableSeats(int availableSeats) {
//        this.availableSeats = availableSeats;
//    }
//}
//
