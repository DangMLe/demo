package com.example.demo;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository employeeRepository){
		return (args) -> {
			//Create 2 employees
			Employee e1 = new Employee("Le Minh Dang", "lmd@gmail.com");
			Employee e2 = new Employee("Nash Tech", "Nashtech@gmail.com");
			employeeRepository.save(e1);
			employeeRepository.save(e2);

			//Read all employee
			List<Employee> employees = employeeRepository.findAll();
			System.out.println("Employees:");
	        employees.forEach(System.out::println);

			//Update employee
			Employee updateEmployee = employeeRepository.replaceEmployee(new Employee("Le Minh Dang", "leminhdang0701@gmail.com"),e1.getId());
			System.out.println("Updated Employee: "+ updateEmployee);

			//Delete employee
			employeeRepository.delete(e2);
		};
	}

}
