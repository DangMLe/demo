package com.example.RestAPIExercise.service.Impl;

import java.util.List;

import com.example.RestAPIExercise.entity.Employee;
import com.example.RestAPIExercise.repository.EmployeeRepository;
import com.example.RestAPIExercise.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployee(Long employeeId) {
        Employee optEmp = employeeRepository.findOne(employeeId);
        return optEmp;
    }

    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }


    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }


    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        
    }
}
