package com.example.demo.repository;

import com.example.demo.entity.AccountDetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailRepository extends JpaRepository<AccountDetail,Long>{
    
}
