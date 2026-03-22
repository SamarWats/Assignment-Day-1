package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.dto.EmployeeDTO;
import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EntityMapper;

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
	
	
	public List<EmployeeDTO> getAllEmployee(String name){
		List<Employee> emps = repo.findByName(name);
		List<com.cg.dto.EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
		emps.forEach(e->employees.add(EntityMapper.convertEntityToDto(e)));
		return employees;
    }
	
	
//    
//    public EmployeeDTO getEmployee(int empId) {
//		Optional<Employee> op = repo.findById(empId);
//    	if(op.isPresent()) {
//    		return EntityMapper.convertEntityToDto(op.get());
//    	}
//    	else {
//    		return null;
//    	}
//    }
	
    public EmployeeDTO updateEmployee(Employee e) {
        Employee emp = null;
        Employee existing = repo.findById(emp.getEmpid()).orElse(null);
        EmployeeDTO ed= EntityMapper.convertEntityToDto(e);
        if(existing != null) {
            repo.saveAndFlush(e);
        }else{
            return ed;
        }
        return ed;
    }

    
    public List<EmployeeDTO> getEmployeeByName1(String name){
        List<Employee> emps=repo.findByName(name);
        List<EmployeeDTO> employee=new ArrayList<EmployeeDTO>();
        emps.forEach(e->employee.add(EntityMapper.convertEntityToDto(e)));
        return employee;
    }
    
    public EmployeeDTO createEmployee1(Employee e) {
        repo.saveAndFlush(e);
        return EntityMapper.convertEntityToDto(e);
    }

    @Override
    public EmployeeDTO getEmployeeid(int empid) {
        Employee op= repo.findById(empid).get();
        if(op!=null){
            return EntityMapper.convertEntityToDto(op);
        }else
            return null;
    }

	
}
