package com.example.demo.security.services;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final AccountRepository accountRepository;

    
    public UserDetailsServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Account user =accountRepository.findByUsername(username).orElseThrow(() ->
        new UsernameNotFoundException("User Not Found with -> username or email : " + username)
);
                

        return UserDetailsImpl.build(user);
    }
    
    
}
