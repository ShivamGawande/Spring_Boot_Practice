package com.example.demo.User;

import java.util.List;
import java.util.Optional;

import org.hibernate.resource.transaction.internal.SynchronizationRegistryStandardImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDataOperations {
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Autowired
	UserDataService userDataService;
	
	//Insert Data in UserDetails Table
	
	public void addUserInformation() {
		UserDetails user1=new UserDetails();
		user1.setUserid(101);
		user1.setName("Vikas");
		user1.setEmail("vikas@gmail.com");
		user1.setGender("Male");
		user1.setContact(7219723657l);
		user1.setAge(21);
		user1.setCity("HKD");
		
		UserDetails user2=new UserDetails();
		user2.setUserid(102);
		user2.setName("Abhi");
		user2.setEmail("abhi@gmail.com");
		user2.setGender("Male");
		user2.setContact(7219723557l);
		user2.setAge(21);
		user2.setCity("Varula");
		
		UserDetails user3=new UserDetails();
		user3.setUserid(103);
		user3.setName("Sanket");
		user3.setEmail("sanket@gmail.com");
		user3.setGender("Male");
		user3.setContact(7219523657l);
		user3.setAge(24);
		user3.setCity("HKD");
		
		userDetailsRepository.saveAll(List.of(user1,user2,user3));
	}
	
	// delete all records
	public void clearDataOfUserDetails() {
		userDetailsRepository.deleteAll();
	}
	
	// load data of users with user Id;
		// PK
	public void getUserInfoByUserId() {
		Optional<UserDetails> userData=userDetailsRepository.findById(103);
		UserDetails userInfo=userData.get();
		System.out.println(userInfo);
	}
	
	// load data of all users
	public void getAllUserData() {
		List<UserDetails> allUsers=userDetailsRepository.findAll();
		allUsers.stream().forEach(System.out::println);
	}
	
	// Get User Details Based on City Name; 
	public void getUsersByCityName(String cityName) {
		List<UserDetails>usersByCity=userDetailsRepository.findByCity("HKD");
		System.out.println(usersByCity.size());
		usersByCity.stream().forEach(System.out::println);
	}
	
	// Req : Load Data by Gender
	public void getUsersByGender(String gender) {
		List<UserDetails> userByGender=userDetailsRepository.findByGender(gender);
		System.out.println(userByGender.size());
		userByGender.stream().forEach(System.out::println);
	}
	
	// getting Data From DB by city and gender.
	public void getDataByGenderNdCity() {
		userDataService.loadDataByCityNadGender();
	}
}
