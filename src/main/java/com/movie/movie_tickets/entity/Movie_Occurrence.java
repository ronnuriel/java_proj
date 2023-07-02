package com.movie.movie_tickets.entity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Entity
public class Movie_Occurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieOccurrence_id")
    private int movieOccurrenceId;


    //TODO: How to connect showOccurrence_id what kind of relation
    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;

    private Date date;

    private int totalTickets;

    private int ticketsLeft;

    @ManyToMany
    @JoinTable(
            name = "seat_in_movie_occurrence",
            joinColumns = @JoinColumn(name = "movieOccurrence_id"),
            inverseJoinColumns = @JoinColumn(name = "seat_id")
    )
    private List<Seat> seats;

    @ElementCollection
    @CollectionTable(
            name = "movie_occurrence_seat_status",
            joinColumns = @JoinColumn(name = "movie_occurrence_id")
    )

    @MapKeyJoinColumn(name = "seat_id")
    @Column(name = "is_available_seat")
    private Map<Seat, Boolean> seatStatus;

    public Movie_Occurrence() {
    }

    public Movie_Occurrence(Movie movie, Date date, int totalTickets, int ticketsLeft, List<Seat> seats) {
        this.movie = movie;
        this.date = date;
        this.totalTickets = totalTickets;
        this.ticketsLeft = ticketsLeft;
        this.seats = seats;
        this.seatStatus = new HashMap<>();
        initializeSeatStatus();
    }

    // Helper method to initialize the seat status map
    private void initializeSeatStatus() {
        for (Seat seat : this.seats) {
            this.seatStatus.put(seat, true); // Set all seats as initially available
        }
    }

    public Map<Seat, Boolean> getSeatStatus() {
        return this.seatStatus;
    }

    public void setSeatStatus(Map<Seat, Boolean> seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void markSeatAsTaken(Seat seat) {
        seatStatus.put(seat, false);
    }

    public void markSeatAsAvailable(Seat seat) {
        seatStatus.put(seat, true);
    }

    public int getMovieOccurrenceId() {
        return movieOccurrenceId;
    }

    public void setMovieOccurrenceId(int showOccurrenceId) {
        this.movieOccurrenceId = showOccurrenceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getTicketsLeft() {
        return ticketsLeft;
    }

    public void setTicketsLeft(int ticketsLeft) {
        this.ticketsLeft = ticketsLeft;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Seat findSeatById(long id) {
        for (Seat seat : this.seats) {
            if (seat.getSeatId() == id) {
                return seat;
            }
        }
        return null;
    }
}