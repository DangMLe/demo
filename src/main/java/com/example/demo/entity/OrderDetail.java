package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_detail_id")
    private Long id;

    @Column(name="order_detail_quality")
    private int quality;

    @Column(name="order_detail_price")
    private Long price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false, updatable =  false)
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id",nullable = false, updatable = false)
    private Order order;
    
    public OrderDetail() {
    }
    public OrderDetail(int quality, Long price, Product product, Order order) {
        this.quality = quality;
        this.price = price;
        this.product = product;
        this.order = order;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    
}
