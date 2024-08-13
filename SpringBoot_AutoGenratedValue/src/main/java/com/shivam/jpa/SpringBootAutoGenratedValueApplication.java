package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.ProductDBOperations;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class SpringBootAutoGenratedValueApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context=SpringApplication.run(SpringBootAutoGenratedValueApplication.class, args);
	 ProductDBOperations pops=context.getBean(ProductDBOperations.class);
	 pops.addProductDetails();
	}

}
