package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.cg.entity.Employee;
public interface IEmployeeServices {
	public List<Employee> getAllEmployee();
	public Employee createEmployee(Employee emp);
	public Employee getEmployee(int empId);
	public String removeEmployee(int empId);
	public Employee updateEmployee(int empId, Employee emp);
	public List<Employee> getEmployeeByName(String name);
	
}

