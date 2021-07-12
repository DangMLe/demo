package com.example.demo.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "Category",nullable = false,updatable = false)
    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "seller_id",nullable = false, updatable = false)
    private AccountDetail accountDetail;

    @Column(name = "product_price")
    private Long price;
    
    @Column(name = "product_desc")
    private String decs;

    @Column(name = "product_updateDate")
    private Date updateDate;

    @Column(name = "product_image")
    private Blob image;

    @Column(name = "product_stock")
    private int stock;
    public Product() {
    }
    
    public Product(Category category, AccountDetail accountDetail, Long price, String decs, Date updateDate, Blob image,
            int stock) {
        this.category = category;
        this.accountDetail = accountDetail;
        this.price = price;
        this.decs = decs;
        this.updateDate = updateDate;
        this.image = image;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public String getDecs() {
        return decs;
    }
    public void setDecs(String decs) {
        this.decs = decs;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Blob getImage() {
        return image;
    }
    public void setImage(Blob image) {
        this.image = image;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public AccountDetail getAccountDetail() {
        return accountDetail;
    }
    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }
    
}
