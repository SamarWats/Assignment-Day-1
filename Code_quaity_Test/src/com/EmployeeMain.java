package com;

public class EmployeeMain {
	public static void main() {
		/**
		* @author Samar Pratap Singh
		*/
		Employee emp1 = new Employee();
		emp1.setEmpid(101);
		emp1.setName("Samar");
		emp1.setEmail("samar@gmail.com");

		System.out.println("Employee ID: " + emp1.getEmpid());
		System.out.println("Employee Name: " + emp1.getName());
		System.out.println("Employee Email: " + emp1.getEmail());
		
		
	
	}
}