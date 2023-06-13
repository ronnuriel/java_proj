//package com.movie.movie_tickets.entity;//import javax.persistence.*;
//import java.util.List;
//import jakarta.persistence.*;
//
//@Entity
//public class Theatre {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int theaterId;
//    private String name;
//    private String location;
//    private int capacity;
//
//    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
//    private List<Show> shows;
//
//    // Constructors, getters, and setters
//
//    public Theatre() {
//    }
//
//    public Theatre(String name, String location, int capacity) {
//        this.name = name;
//        this.location = location;
//        this.capacity = capacity;
//    }
//
//    public int getTheaterId() {
//        return theaterId;
//    }
//
//    public void setTheaterId(int theaterId) {
//        this.theaterId = theaterId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
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
//        show.setTheatre(this);
//    }
//
//    public void removeShow(Show show) {
//        shows.remove(show);
//        show.setTheatre(null);
//    }
//}
