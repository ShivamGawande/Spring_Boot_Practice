package com.shivam.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shivam.jpa.entity.SortingPagination;
import com.shivam.jpa.entity.UserOperations;
import com.shivam.jpa.entity.interview.DbOperations;

@SpringBootApplication
public class SpringBootDataJpaNativeSqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootDataJpaNativeSqlApplication.class, args);
		
		/*UserOperations uops=context.getBean(UserOperations.class);
		//native SQL query:
		uops.loadDataByUsersGenderAndCity("HKD", "Male");
		
		uops.updateUserContact();
		
		uops.loadAllUsers();
		
		uops.loadAllUsersbYCity();
		
		DbOperations dbOps=context.getBean(DbOperations.class);
		
		dbOps.addUserInfo();
		
		dbOps.updateUserInfo();
		
		dbOps.updateUserData();
		
		dbOps.getUsersInformation();
		
		dbOps.getUserInformationByEmailId("abc@gmail.com");
		*/
		
		//Sorting
		SortingPagination sort=context.getBean(SortingPagination.class);
		/*
		sort.loadDataByUserIdAsce();
		
		System.out.println("Loading Data in Desc");
		sort.loadDataByUserIdDesc();
		
		sort.loadDataOrderByNameGenderInAsec();
		
		sort.loadDataOrderByNameAndGenderInDesc();
		*/
		
		//Paginatation
		sort.getFirstRecords();
		
		sort.getPageWiseRecords();
	}

}
