package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.entity.Employee;
import com.cg.service.IEmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeServices service;
	
	public EmployeeController(IEmployeeServices service) {
		super();
		this.service=service;
	}
	
//	public Employee addEmp() {
//	    Employee emp = new Employee();
//	    emp.setName("Samar");
//	    emp.setDob(LocalDate.of(2002, 5, 10));
//	    emp.setSalary(50000);
//
//	    return service.createEmployee(emp);
//	}
	
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
	    return service.createEmployee(emp);
	}

	@GetMapping("employees")
	public List<Employee> getXyz() {
		return service.getAllEmployee();
	}
	
	
	//two resouces can  not have same url
	@GetMapping("/employees/{eid}")
	public Employee getEmp(@PathVariable int eid) {
	    return service.getEmployee(eid);
	}

	@GetMapping("/employees/name/{name}")
	public List<Employee> getEmpByName(@PathVariable String name) {
	    return service.getEmployeeByName(name);
	}
	
	@Override
	public Employee updateEmployee() {
		Employee emp = null;
		// TODO Auto-generated method stub
		Employee existing = repo.findById(emp.getEmpid()).orElse(null);

	    if (existing != null) {
	        existing.setName(emp.getName());
	        existing.setSalary(emp.getSalary());
	        existing.setDob(emp.getDob());

	        return repo.save(existing); // update
	    }

	    return null;
	}
	
	@PutMapping()
	public Employee updateEmployee() {
		return service.updateEmployee();
	}
	
	
	
	
	
	
}