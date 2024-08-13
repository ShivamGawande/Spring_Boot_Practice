package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.DBService;

@SpringBootApplication
public class SpringBootMappingManyToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMappingManyToOneApplication.class, args);
		DBService service=context.getBean(DBService.class);
		//service.addStudentInfo();
		service.deleteStudentInfo();
	}

}
