package com.cg.controller;

import org.springframework.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController 
@Controller 
public class HelloController {
//	@GetMapping("abc")
//	public String sayHello() {
////		return "Hello Samar Pratap";
//		return "Hello.html";
//	}
	@GetMapping("abc")
	public @ResponseBody String sayHello() {
//		return "Hello Samar Pratap";
		return "Hello";
	}
	
//	@GetMapping("xyz")
//	public String sayHello1() {
//		return "Hello Rishabh";
//	}
}