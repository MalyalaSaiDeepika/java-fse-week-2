package com.cognizant.employeemanagement.service;

import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}