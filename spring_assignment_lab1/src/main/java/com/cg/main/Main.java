package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.HelloWorld;

public class Main {
	public static void main(String[] args) {
//		HelloWorld hw = new HelloWorld();
//		System.out.println(hw.sayHello("Sam"));
		

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorld hw = (HelloWorld)ctx.getBean("hello");
		HelloWorld hw1 = (HelloWorld)ctx.getBean("hello");
		
		System.out.println(hw==hw1);
		
		hw.setName("Samar");
		hw1.setName("Rishabh");
		
		System.out.println(hw.sayHello());
		System.out.println(hw1.sayHello());
		
		System.out.println(hw.getLanguages());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
