package com.movie.movie_tickets.entity;

import jakarta.persistence.*;

@Entity
public class User {
    //User id is unique
    @Id
    @Column(name = "user_id")
    private int userId;

    private String name;

    private String mail;

    private String phone;

    public User() {
    }

    public User(int userId, String name, String mail, String phone) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}