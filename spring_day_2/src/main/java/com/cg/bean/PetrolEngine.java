package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
//@Component("petrolEngine") // Custom bean name, i.e. we can also give the id to the bean, if we want to use that id in the xml file instead of the class name

public class PetrolEngine implements IEngine {
	public String getBHP() {
		return "150 BHP";
	}
}
