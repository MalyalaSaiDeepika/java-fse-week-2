package com.cognizant.employeemanagement.service;

import com.cognizant.employeemanagement.entity.Department;
import com.cognizant.employeemanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }
}