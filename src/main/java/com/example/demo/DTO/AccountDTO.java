package com.example.demo.DTO;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountDetail;

import java.sql.Blob;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountDTO{
    private String name;
    private String firstname;
    private String lastname;
    private String role;
    private int age;
    private String email;
    private String address;
    private String phonenum;
    private Blob avatar;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
    public Blob getAvatar() {
        return avatar;
    }
    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }
    
}