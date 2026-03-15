package com.cg.bean;

public class HelloWorld {
	private String name;
	
	public HelloWorld() {}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello " + name;
	}
	
}
