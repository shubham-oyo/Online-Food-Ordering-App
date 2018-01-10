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
    private int cid;

    @NotNull
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String prefferedFoodType;

    protected Customer() {
    }

    public Customer(String firstName, String lastName, int age, String address, String prefferedFoodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.prefferedFoodType = prefferedFoodType;
    }

    public void setUid(int cid) {
        this.cid = cid;
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

    public int getCid() {
        return cid;
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
}
