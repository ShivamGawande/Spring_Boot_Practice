package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.User.UserDataOperations;
import com.example.demo.User.UserDataService;
import com.example.demo.jpaEntity.DbOperations;

@SpringBootApplication
public class SpringDataJpaExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = 	
		SpringApplication.run(SpringDataJpaExamplesApplication.class, args);
		DbOperations ops=configurableApplicationContext.getBean(DbOperations.class);
		
		ops.addOrderInformation();
		//ops.deleteOrder(111);
		UserDataOperations uops=configurableApplicationContext.getBean(UserDataOperations.class);
		//uops.addUserInformation();
		//uops.getUserInfoByUserId();
		//uops.getAllUserData();
		//uops.clearDataOfUserDetails();
		//20Feb
		
		uops.getUsersByCityName("HKD");
		uops.getUsersByGender("Male");
		uops.getDataByGenderNdCity();
		
		UserDataService userService=configurableApplicationContext.getBean(UserDataService.class);
		userService.deleteUserDataByAge(21);
		
		//21Feb
	}
	
	
	

}
