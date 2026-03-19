package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeServices;

@Service
public class EmployeeService implements IEmployeeServices{
	
	
    @Autowired
    private IEmployeeRepo repo;
    
  
	@Override
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	@Override
	public Employee createEmployee(Employee emp) {
	    return repo.save(emp);
	}
	@Override
	public Employee getEmployee(int empId) {
	    Optional<Employee> op = repo.findById(empId);
	    if(op.isPresent()) {
	    	return op.get();
	    }
	    else {
	    	return null;
	    }
	}
	
	@Override
	public String removeEmployee(int empId) {

	    if (repo.existsById(empId)) {
	        repo.deleteById(empId);
	        return "Employee deleted successfully";
	    } else {
	        return "Employee not found";
	    }
	}
	

	@Override
	public List<Employee> getEmployeeByName(String name) {
	    return repo.findByName(name);
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {

	    Employee existing = repo.findById(empId).orElse(null);

	    if (existing != null) {
	        existing.setName(emp.getName());
	        existing.setSalary(emp.getSalary());
	        existing.setDob(emp.getDob());

	        return repo.save(existing); 
	    }

	    return null;
	}
	
	
}
