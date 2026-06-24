package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private double salary;

    private boolean permanent;

    @ManyToOne
    private Department department;

    @ManyToMany
    private List<Skill> skillList;

    public Employee() {}

    public Employee(int id, String name, double salary, boolean permanent, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.permanent = permanent;
        this.department = department;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public double getSalary() { return salary; }

    public boolean isPermanent() { return permanent; }

    public Department getDepartment() { return department; }

    public List<Skill> getSkillList() { return skillList; }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}