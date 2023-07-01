package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatId;
    private int row_num;
    private int col_num;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    public Seat() {
    }

    public Seat(int row_num, int col_num, Hall hall) {
        this.row_num = row_num;
        this.col_num = col_num;
        this.hall = hall;
    }

    public int getOrderId() {
        return seatId;
    }

    public void setOrderId(int orderId) {
        this.seatId = orderId;
    }

    public int getRow() {
        return row_num;
    }

    public void setRow(int row) {
        this.row_num = row;
    }

    public int getCol() {
        return col_num;
    }

    public void setCol(int col) {
        this.col_num = col;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}