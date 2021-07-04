package com.example.RestAPIExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RestAPIApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(RestAPIApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	

}
