package com.movie.movie_tickets.entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class Show_Occurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "showOccurrence_id")
    private int showOccurrenceId;

    private Date date;

    private int totalTickets;

    private int ticketsLeft;

    public Show_Occurrence(int showOccurrenceId, Date date, int totalTickets, int ticketsLeft) {
        this.showOccurrenceId = showOccurrenceId;
        this.date = date;
        this.totalTickets = totalTickets;
        this.ticketsLeft = ticketsLeft;
    }

    public Show_Occurrence() {

    }

    public int getShowOccurrenceId() {
        return showOccurrenceId;
    }

    public void setShowOccurrenceId(int showOccurrenceId) {
        this.showOccurrenceId = showOccurrenceId;
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
}