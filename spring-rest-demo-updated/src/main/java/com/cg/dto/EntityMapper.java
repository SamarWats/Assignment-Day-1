package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
	public Employee convertObjectToEntity(EmployeeDTO edto) {
		return new Employee(edto.getName(), edto.getDob(), edto.getSalary());
	}
	
	public static EmployeeDTO convertEntityToDto(Employee emp) {
        EmployeeDTO edto = new EmployeeDTO(0, emp.getName(),emp.getDob(),emp.getSalary());
        return edto;
    }
}
