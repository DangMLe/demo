package com.example.RestAPIExercise.service;

import java.util.List;

import com.example.RestAPIExercise.entity.Employee;

public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee Employee);
}