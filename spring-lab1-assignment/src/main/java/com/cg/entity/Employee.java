package com.cg.entity;

public class Employee {

    private int empId;
    private String empName;
    private double salary;
    private String BusinessUnit;
    private int age;
    
    private SBU businessUnit;

    public Employee() {}

    public Employee(int empId, String empName, double salary, String BusinessUnit, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.BusinessUnit = BusinessUnit;
        this.age = age;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return BusinessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		BusinessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 
	 public void displayEmployeeDetails() {

	        System.out.println("Employee ID : " + empId);
	        System.out.println("Employee Name : " + empName);
	        System.out.println("Employee Salary : " + salary);

	        System.out.println("\nSBU Details:");
	        System.out.println(businessUnit.getSBUDetails());
	 }
    
}