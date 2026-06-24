package com.cognizant.employeemanagement.controller;

import com.cognizant.employeemanagement.entity.Department;
import com.cognizant.employeemanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }
}