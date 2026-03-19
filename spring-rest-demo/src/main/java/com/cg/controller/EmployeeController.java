package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
//	@PostMapping("/employees")
//	public Employee addEmployee(@RequestBody Employee emp) {
//	    return service.createEmployee(emp);
//	}
//
//	@GetMapping("employees")
//	public List<Employee> getXyz() {
//		return service.getAllEmployee();
//	}
//	
//	
//	//two resouces can  not have same url
//	@GetMapping("/employees/{eid}")
//	public Employee getEmp1(@PathVariable int eid) {
//	    return service.getEmployee(eid);
//	}
//
//	@GetMapping("/employees/name/{name}")
//	public List<Employee> getEmpByName1(@PathVariable String name) {
//	    return service.getEmployeeByName(name);
//	}
//	
//	@DeleteMapping("/{eid}")
//	public String removeEmployee(@PathVariable int eid) {
//	    return service.removeEmployee(eid);
//	}
//	
//	@PutMapping("/{eid}")
//	public Employee updateEmployee(@PathVariable int eid, @RequestBody Employee emp) {
//	    return service.updateEmployee(eid, emp);
//	}
//	
//	
//	@GetMapping(produces = {"application/json", "application/xml"})
//	public List<Employee> getAll() {
//		return service.getAllEmployee();
//	}
//	
//
//	@GetMapping("/name/(name}")
//	public List<Employee> getEmpByName(@PathVariable String name) {
//		return service.getEmployeeByName(name);
//	}
//
//
//
//	@PostMapping(consumes = {"application/json", "application/xml"}) 
//	public Employee createNewEmployee (@RequestBody Employee emp) {
//		return service.createEmployee(emp);
//	}
		
	// CREATE
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.createEmployee(emp);
    }

    // GET ALL
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployee();
    }

    // GET BY ID
    @GetMapping("/{eid}")
    public Employee getEmployee(@PathVariable int eid) {
        return service.getEmployee(eid);
    }

    // GET BY NAME
    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    // UPDATE
    @PutMapping("/{eid}")
    public Employee updateEmployee(@PathVariable int eid, @RequestBody Employee emp) {
        return service.updateEmployee(eid, emp);
    }

    // DELETE
    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid) {
        return service.removeEmployee(eid);
    }
	
//    @GetMapping("/{eid}")
//    public ResponseEntity<Employee> getEmp(@PathVariable int eid){
//        Employee emp = service.getEmployee(eid);
//
//        if(emp != null) {
//            return new ResponseEntity<>(emp, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}