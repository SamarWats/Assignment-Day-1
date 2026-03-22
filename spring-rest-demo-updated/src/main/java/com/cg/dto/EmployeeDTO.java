package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDTO {
	private int employeeId;
	private String name;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private double salary;
	
	public EmployeeDTO() {}

	public EmployeeDTO(int employeeId, String name, LocalDate dob, double salary) {
		super();
		this.employeeId=employeeId;
		this.name=name;
		this.dob=dob;
		this.salary=salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
