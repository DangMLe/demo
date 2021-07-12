package com.example.demo.exception;



public class AccountException extends RuntimeException{
    public AccountException(Long id){
        super("Could not find the account "+ id);
    }
}
