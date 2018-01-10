package com.example.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, nullable=false)
    private int id;

    @NotNull
    private int hotelId;
    @NotNull
    private String name;
    private String description;
    private int price;
    private boolean isVeg;
    private boolean isAvailable;

    protected Item() {
    }

    public Item(int hotelId, String name, String description, int price, boolean isVeg, boolean isAvailable) {
        this.hotelId = hotelId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVeg = isVeg;
        this.isAvailable = isAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getId() {
        return id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
