package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
//@Component("mrfTyre") // Custom bean name, i.e. we can also give the id to the bean, if we want to use that id in the xml file instead of the class name

public class MrfTyre implements ITyre {
	public String getTyreDetails() {
		return "Mrf Tyre with 205/55 R16 size";
	}
}
