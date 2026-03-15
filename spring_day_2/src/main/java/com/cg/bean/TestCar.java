package com.cg.bean;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
/*
		// for parameterized constructor, we can directly create objects of PetrolEngine and MrfTyre and pass them as arguments to the Car constructor.
		Car honda = new Car(new PetrolEngine(), new MrfTyre()); 

		//		Car honda = new Car(); // for default constructor, we need to create an object of Car class and then set the properties using setter methods.
		honda.setName("Honda City");
		honda.printCar();
*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Car c = (Car) ctx.getBean("car");
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter the car name: ");
//		String car_name = sc.nextLine();
//
//		System.out.println("Enter the EngineType: ");
//		String engineType = sc.next();
//		
//		System.out.println("Enter the TyreType: ");
//		String tyreType = sc.next();
//		
////		ICarName cn = (IEngine) ctx.getBean(engineType.toLowerCase());
//		IEngine e = (IEngine) ctx.getBean(engineType.toLowerCase());
//		ITyre t = (ITyre) ctx.getBean(tyreType.toLowerCase());
//		c.setName(car_name);
//		c.setEngine(e);
//		c.setTyre(t);
		c.printCar();
	}
}
