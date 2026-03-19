package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.entity.SBU;
import com.cg.entity.Employee;
import com.cg.service.EmployeeServices;

@SpringBootApplication
public class SpringLab1AssignmentApplication implements CommandLineRunner {

    /*@Autowired
    private EmployeeServices employeeServices;

    public static void main(String[] args) {
        SpringApplication.run(SpringLab1AssignmentApplication.class, args);
    }

    @Override
    public void run(String... args) {

        /*SBU sbu = employeeServices.getSBUDetails();*/

        /*sbu.displaySBUDetails();*/
	
	@Autowired
    private EmployeeServices employeeServices;

    public static void main(String[] args) {
        SpringApplication.run(SpringLab1AssignmentApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Employee emp = employeeServices.getEmployeeDetails();

        emp.displayEmployeeDetails();
    }
}