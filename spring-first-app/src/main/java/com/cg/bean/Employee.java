package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${empid}")
	private int empid;
	@Value("${empname}")
	private String name;
	@Autowired // we use autowired to inject the dependency of address class into employee class, so that we can access the properties of address class in employee class without creating the object of address class, spring will create the object of address class and inject it into employee class, so that we can access the properties of address class in employee class
//	@Qualifier("address1") // we use qualifier to specify which bean to inject when there are multiple beans of the same type, in this case we have two beans of type Address in our bean.xml file, so we use qualifier to specify which one to inject
	private Address address;
	
	public Employee() {
	}
	
	public Employee(int empid, String name, Address address) {
		this.empid = empid;
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void printEmployeeDetails() {
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Address: " + address.getCity());
		System.out.println("Employee country: " + address.getCountry());
		System.out.println("Zip: " + address.getZip());
		
	}
	
	
}
