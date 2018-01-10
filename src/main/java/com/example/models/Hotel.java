package com.example.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.persistence.*;


@Entity
@Table
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(updatable=false, nullable=false)
    private int id;

    @NotNull
    private String name;
    private String address;
    private int openingTime;
    private int closingTime;
    private boolean isVeg;

    protected Hotel() {
    }

    public Hotel(String name, String address, int openingTime, int closingTime, boolean isVeg) {
        this.name = name;
        this.address = address;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.isVeg = isVeg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public boolean isVeg() {
        return isVeg;
    }
}
