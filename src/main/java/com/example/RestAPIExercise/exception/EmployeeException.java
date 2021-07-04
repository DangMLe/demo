package com.example.RestAPIExercise.exception;

/**
 * EmployeeException
 */
public class EmployeeException extends RuntimeException{
    public EmployeeException(long id) {super("Could not find employee with id= "+id);}    
}