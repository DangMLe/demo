package com.example.RestAPIExercise.repository;

import com.example.RestAPIExercise.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findOne(Long employeeId);

    
}