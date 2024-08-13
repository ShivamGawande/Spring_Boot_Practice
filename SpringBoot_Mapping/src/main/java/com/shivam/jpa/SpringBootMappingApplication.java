package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.EmployeeAddService;

@SpringBootApplication
public class SpringBootMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMappingApplication.class, args);
		EmployeeAddService service=context.getBean(EmployeeAddService.class);
		service.saveInfo();
		
	}

}
