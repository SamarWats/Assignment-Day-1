package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
//		Employee emp = new Employee();
//		// here we are accessing the properties of address class without creating the object of address class
//		emp.setAddress(new Address());
//		emp.printEmployeeDetails();
//		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee)ctx.getBean("employee");
		emp.printEmployeeDetails();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
