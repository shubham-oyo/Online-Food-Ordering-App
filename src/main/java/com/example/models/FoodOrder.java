package com.example.models;

import org.w3c.dom.ls.LSInput;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table
public class FoodOrder {
    enum OrderStatus {
        PENDING, PREPARING, ONTHEWAY, COMPLETED;
    }

    enum PaymentMethod {
        CASH, PAYTM, UPI, NETBANKING, POS;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(updatable=false, nullable=false)
    private int id;

    @NotNull
    private int userId;
    @NotNull
    private int hotelId;
    //@ElementCollection
    private int itemsId;
    //private List<Integer> itemsId = new ArrayList<Integer>();
    private Date timestamp;
    private String deliveryAddress;
    private int payableAmount;
    private PaymentMethod paymentMethod;
    private boolean isPaymentReceived;
    private OrderStatus orderStatus;

    FoodOrder() {
    }

    FoodOrder(int userId, int hotelId, int itemsId, String deliveryAddress, int payableAmount, PaymentMethod paymentMethod, boolean isPaymentReceived) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.itemsId = itemsId;
        this.deliveryAddress = deliveryAddress;
        this.payableAmount = payableAmount;
        this.paymentMethod = paymentMethod;
        this.isPaymentReceived = isPaymentReceived;
    }
}
