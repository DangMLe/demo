package com.example.demo.entity;


import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_account_details")
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_detail_id")
    private long id;

    @Column(name = "acc_detail_firstname")
    private String firstname;

    @Column(name = "acc_detail_lastname")
    private String lastname;

    @Column(name = "acc_detail_role")
    private String role;

    @Column(name = "acc_detail_age")
    private int age;

    @Column(name = "acc_detail_email")
    private String email;

    @Column(name = "acc_detail_address")
    private String address;

    @Column(name = "acc_detail_phonenum")
    private String phonenum;

    @Column(name = "acc_detail_avatar")
    private Blob avatar;

    public AccountDetail() {
    }
    
    public AccountDetail(String firstname, String lastname, String role, int age, String email, String address,
            String phonenum, Blob avatar) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phonenum = phonenum;
        this.avatar = avatar;
    }

    public long getid() {
        return id;
    }
    public void setid(long id) {
        this.id = id;
    }
    public String getfirstname() {
        return firstname;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getlastname() {
        return lastname;
    }
    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public String getrole() {
        return role;
    }
    public void setrole(String role) {
        this.role = role;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public String getphonenum() {
        return phonenum;
    }
    public void setphonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

}
