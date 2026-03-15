package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
//@Component("cng") // Custom bean name, i.e. we can also give the id to the bean, if we want to use that id in the xml file instead of the class name
public class CNGEngine implements IEngine {
	public String getBHP() {
		return "180 BHP";
	}
}
