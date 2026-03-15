package com.cg.PS1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${emp.id}")
    private int employeeId;

    @Value("${emp.name}")
    private String employeeName;

    @Value("${emp.salary}")
    private double salary;
    
   
    public String toString() {
        return "Employee [empId=" + employeeId +
               ", empName=" + employeeName +
               ", empSalary=" + salary + "]";
    }
}