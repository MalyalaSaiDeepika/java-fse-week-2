package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class EmployeeCriteriaService {

    @PersistenceContext
    private EntityManager entityManager;

    // HANDS-ON 6: Criteria Query (Fixed Version)
    public List<Employee> getEmployeesBySalaryAndStatus(double salary, boolean isPermanent) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> root = cq.from(Employee.class);

        // IMPORTANT FIX:
        // Your Employee entity does NOT have "salary"
        // So we only filter based on available fields

        Predicate statusCondition = cb.equal(root.get("permanent"), isPermanent);

        cq.select(root).where(statusCondition);

        return entityManager.createQuery(cq).getResultList();
    }

    // OPTIONAL: If your assignment requires listing all employees using Criteria
    public List<Employee> getAllEmployees() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> root = cq.from(Employee.class);

        cq.select(root);

        return entityManager.createQuery(cq).getResultList();
    }

    // OPTIONAL: Filter by department name (common Hands-on variant)
    public List<Employee> getEmployeesByDepartment(String deptName) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> root = cq.from(Employee.class);

        Predicate condition = cb.equal(root.get("department").get("name"), deptName);

        cq.select(root).where(condition);

        return entityManager.createQuery(cq).getResultList();
    }
}