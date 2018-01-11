package com.example.models;

import org.springframework.boot.*;
import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
//@SequenceGenerator(name="uidSeq", initialValue=1000000, allocationSize=1)
public class Customer {

    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="uidSeq")
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, nullable=false)
    private int id;

    @NotNull
    private String mobileNumber;
    @NotNull
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String prefferedFoodType;
    @Transient
    private String message;

    protected Customer() {
    }

    public Customer(String mobileNumber, String firstName, String lastName, int age, String address, String prefferedFoodType) {
        this.mobileNumber = mobileNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.prefferedFoodType = prefferedFoodType;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrefferedFoodType(String prefferedFoodType) {
        this.prefferedFoodType = prefferedFoodType;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPrefferedFoodType() {
        return prefferedFoodType;
    }

    public String getMessage() {
        return message;
    }
}
