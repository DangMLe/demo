package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Account;

public interface AccountService {
    public List<Account> retrieveAccounts();

    public Account getAccount(Long accountId);

    public Account saveAccount(Account account);

    public void deleteAccount(Long accountId);

    public void updateAccount(Account Account);
}