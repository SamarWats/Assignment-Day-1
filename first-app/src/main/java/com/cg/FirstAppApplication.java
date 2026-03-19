package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;

@SpringBootApplication
//@ComponentScan("com")
@PropertySource("data.properties")
public class FirstAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstAppApplication.class, args);
		
//		HelloWorld hw = new HelloWorld();
//		System.out.println(hw.sayHello("Samar"));

		
		ApplicationContext ctx = SpringApplication.run(FirstAppApplication.class, args);
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		System.out.println("\n");
		System.out.println(hw.sayHello("Samar"));
		
		Employee emp = ctx.getBean(Employee.class);
		System.out.println("\n");
		emp.printEmployeeDetails();
	}

}
