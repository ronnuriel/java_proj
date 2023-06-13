//package com.movie.movie_tickets.entity;
//
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//public class Movie {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int movieId;
//    private String title;
//    private int duration;
//    private String genre;
//
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private List<Show> shows;
//
//    // Constructors, getters, and setters
//
//    public Movie() {
//    }
//
//    public Movie(String title, int duration, String genre) {
//        this.title = title;
//        this.duration = duration;
//        this.genre = genre;
//    }
//
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getDuration() {
//        return duration;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public List<Show> getShows() {
//        return shows;
//    }
//
//    public void setShows(List<Show> shows) {
//        this.shows = shows;
//    }
//
//    public void addShow(Show show) {
//        shows.add(show);
//        show.setMovie(this);
//    }
//
//    public void removeShow(Show show) {
//        shows.remove(show);
//        show.setMovie(null);
//    }
//}
