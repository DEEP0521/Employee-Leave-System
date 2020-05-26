package com.jkt.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jkt.training")
public class EmployeeLeaveSystemApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmployeeLeaveSystemApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeLeaveSystemApplication.class, args);
	}

}
