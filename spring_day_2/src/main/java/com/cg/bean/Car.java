package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;


@Component
//@Service
//@Repository
public class Car {
	@Value("${carname}")
	private String name;
	
	@Autowired
	@Qualifier("petrolEngine") // here we are using @Qualifier to make it byName and to specify which bean to inject when there are multiple beans of the same type, in this case we have two beans of type IEngine (cng and petrolEngine) and two beans of type ITyre (mrf and jk), so we need to specify which one to inject using @Qualifier annotation.
	private IEngine Engine;
	
	@Autowired
	@Qualifier("mrfTyre") 
	private ITyre Tyre;

//	private IEngine cng;
	
	@Autowired // here it is by default bytype autowiring, so it will look for the IEngine type and inject the dependency.
//	private ITyre mrf;
	
//	private PetrolEngine petrolEngine;
//	private MrfTyre mrfTyre;
	
	 public Car() {}

	public Car(String name, IEngine engine, ITyre tyre) {
		this.name = name;
	    this.Engine = engine;
	    this.Tyre = tyre;
	    
	}

//	 @Autowired  // Constructor-based dependency injection, it will by default use the bytype autowiring to inject the dependencies, written on the constructor when we don't write the @Autwire on the 
//	 public Car(@Qualifier("cng") IEngine cng, @Qualifier("jk")  ITyre mrf) {
//	    	super();
//	        this.cng = cng;
//	        this.mrf = mrf;
//	    }
//	 @Autowired  // Constructor-based dependency injection, it will by default use the bytype autowiring to inject the dependencies.
//	 public Car(@Qualifier("cng") IEngine cng, @Qualifier("jk")  ITyre mrf) { // here we are using @Qualifier to make it byName and to specify which bean to inject when there are multiple beans of the same type, in this case we have two beans of type IEngine (cng and petrolEngine) and two beans of type ITyre (mrf and jk), so we need to specify which one to inject using @Qualifier annotation.
//		 super();
//		 this.cng = cng;
//		 this.mrf = mrf;
//	 }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public IEngine getEngine() {
	        return Engine;
	    }

	    public void setEngine(IEngine engine) {
	        this.Engine = engine;
	    }

//	    public IEngine getCNG() {
//	        return cng;
//	    }
//
//	    public void setCNG(IEngine cng) {
//	        this.cng = cng;
//	    }

	    public ITyre getTyre() {
	        return Tyre;
	    }

	    public void setTyre(ITyre tyre) {
	        this.Tyre = tyre;
	    }

//	    public ITyre getMRF() {
//	        return mrf;
//	    }
//
//	    public void setMRF(ITyre mrf) {
//	        this.mrf = mrf;
//	    }

	    public void printCar() {
	        System.out.println("Car Name: " + name);
	        System.out.println("Engine BHP: " + Engine.getBHP());
	        System.out.println("Tyre Details: " + Tyre.getTyreDetails());
	    }
	
	
}
