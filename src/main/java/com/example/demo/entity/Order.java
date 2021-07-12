package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "seller",nullable = false,updatable = false)
    private Account seller;

    @ManyToOne(optional = false)
    @JoinColumn(name = "buyer",nullable = false,updatable = false)
    private Account buyer;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderDetail> orderDetails = new ArrayList<>();

    @Column(name = "order_date")
    private Date date;
    public Order() {
    }
    public Order(Account seller, Account buyer, Date date) {
        this.seller = seller;
        this.buyer = buyer;
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Account getSeller() {
        return seller;
    }
    public void setSeller(Account seller) {
        this.seller = seller;
    }
    public Account getBuyer() {
        return buyer;
    }
    public void setBuyer(Account buyer) {
        this.buyer = buyer;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
        orderDetail.setOrder(this);
    }
    
}
