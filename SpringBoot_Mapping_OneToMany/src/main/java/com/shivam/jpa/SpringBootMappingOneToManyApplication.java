package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.DBService;

@SpringBootApplication
public class SpringBootMappingOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMappingOneToManyApplication.class, args);
		
		DBService service=context.getBean(DBService.class);
		
		service.addInfo();
		//service.deleteInfo();
		service.retriveInfo();
		
	}

}
