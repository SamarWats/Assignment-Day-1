package com.cg.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cg.bean.HelloWorld;

@Configuration
public class MyConfig {
	
	@Bean(name="h")
	public HelloWorld getBean() {
//		return new HelloWorld();
		HelloWorld hw = new HelloWorld();
		hw.setName("Samar");
		return hw;
	}
}
