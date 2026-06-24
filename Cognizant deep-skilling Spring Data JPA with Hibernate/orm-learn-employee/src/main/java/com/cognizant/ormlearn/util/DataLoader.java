package com.cognizant.ormlearn.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeCriteriaService;

@Component
public class DataLoader implements CommandLineRunner {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DataLoader.class);

    @Autowired
    private EmployeeCriteriaService criteriaService;

    @Override
    public void run(String... args) throws Exception {

        LOGGER.info("=== HANDS-ON 6: CRITERIA QUERY STARTED ===");

        List<Employee> employees =
                criteriaService.getEmployeesBySalaryAndStatus(50000, true);

        for (Employee emp : employees) {
            LOGGER.info(emp.toString());
        }

        LOGGER.info("=== HANDS-ON 6 COMPLETED ===");
    }
}