package com.example.demo.service.Impl;


import java.util.List;


import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    
    @Autowired
    private AccountRepository accountRepository;


    public void setAccountRepository(AccountRepository accountRepository, ModelMapper modelMapper){
        this.accountRepository = accountRepository;

    }

    @Override
    public List<Account> retrieveAccounts(){
        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long accountId) {
        Account optEmp = accountRepository.findOne(accountId);
        return optEmp;
    }

    @Override
    public Account saveAccount(Account account) {

        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
        
    }
}
