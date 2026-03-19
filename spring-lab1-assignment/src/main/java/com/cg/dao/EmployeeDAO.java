package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository
public class EmployeeDAO {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeDAO() {

        empList.add(new Employee(100, "Rama", 12345.67, "PES-BU", 30));
        empList.add(new Employee(101, "Krishna", 20000, "PES-BU", 28));
    }

    public List<Employee> getEmployees() {
        return empList;
    }
}