package com.example.demo.repository;

import com.example.demo.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<Account, Long> {
    
}