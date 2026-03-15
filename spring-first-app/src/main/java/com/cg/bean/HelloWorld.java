package com.cg.bean;

import java.util.List;

public class HelloWorld {
	private String name;
	private List<String> languages;
	
//	public HelloWorld() {
//	}
//	
//	public HelloWorld(String name) {
//		this.name = name;
//	}

	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String sayHello() {
		return "Hello " + name.toUpperCase();
	}
}
