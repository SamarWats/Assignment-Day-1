package com.cg.L2;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private String businessUnit;
	private int age;
	
	
	public Employee() {}
	
	public Employee(int empid, String name, double salary, String businessUnit, int age) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void getSBUDetails(SBU sbu) {
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Business Unit: " + businessUnit);
		System.out.println("Employee Age: " + age);
		System.out.println("SBU Code: " + sbu.getSbuId());
		System.out.println("SBU Name: " + sbu.getSbuName());
		System.out.println("SBU Head: " + sbu.getSbuHead());
		
	}
}
