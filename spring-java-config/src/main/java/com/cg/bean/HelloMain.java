package com.cg.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.cfg.MyConfig;

public class HelloMain {
	public static void main(String[] args) {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext('bean.xml');

//		BeanFactory ctx = new ClassPathXmlApplicationContext("bean.xml");
//		HelloWorld hw = (HelloWorld) ctx.getBean("h");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		
		System.out.println(hw.sayHello());
		
	}
}
