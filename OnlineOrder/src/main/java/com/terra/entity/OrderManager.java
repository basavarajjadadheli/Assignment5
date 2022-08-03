package com.terra.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
@Entity
public class OrderManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float totalAmount;
    private String orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "orderManager")

    private Address address;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "orderManager")
    private List<Orderline> orderlines;

    public OrderManager(String orderDate, OrderStatus status, List<Orderline> orderlines) {

        this.orderDate = orderDate;
        this.status = status;
        this.orderlines = orderlines;
    }

    public OrderManager() {
    }

    public float getTotalAmount() {
        float totalAmount = 0;
        for (Orderline line: orderlines){
            totalAmount += line.getPrice();
        }
        return this.totalAmount = totalAmount;
    }



    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Orderline> getOrderLines() {
        return orderlines;
    }

    public void setOrderLines(List<Orderline> orderlines) {
        this.orderlines = orderlines;
    }

    public float calculateTotalAmount(){
        float totalAmount = 0;
        for (Orderline line: orderlines){
            totalAmount += line.getPrice();
        }
        return this.totalAmount = totalAmount;
    }


}
