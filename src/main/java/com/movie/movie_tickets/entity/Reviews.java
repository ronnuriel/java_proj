package com.movie.movie_tickets.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;

    private String reviewDescription;

    public Reviews(int reviewId, String reviewDescription) {
        this.reviewId = reviewId;
        this.reviewDescription = reviewDescription;
    }

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Reviews() {

    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }
}