package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.OrdersService;

@SpringBootApplication
public class SpringBootAutoGenratedValueIdentityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootAutoGenratedValueIdentityApplication.class, args);
		OrdersService service = context.getBean(OrdersService.class);
		service.createOrder();
	}

}
