package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
//@Component("jkTyre") // Custom bean name, i.e. we can also give the id to the bean, if we want to use that id in the xml file instead of the class name

public class JKTyre implements ITyre {
	public String getTyreDetails() {
		return "JK Tyre with 210/65 R18 size";
	}
}
