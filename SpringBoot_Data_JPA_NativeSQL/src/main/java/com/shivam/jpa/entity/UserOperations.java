package com.shivam.jpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserOperations {
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	// Req : select * fom user_details where city=?1 and gender=?2
	
	public void loadDataByUsersGenderAndCity(String city,String gender) {
		List<UserDetails> users=userDetailsRepository.loadByCityAndGender(city, gender);
		users.forEach(System.out::println);
	}
	
	//DML Example
	//Update User contact
	public void updateUserContact() {
		int updatedRowsCount=userDetailsRepository.updateUserContactByUserId(101, 9146087481l);
		System.out.println(updatedRowsCount);
	}
	
	//JPQL:
	public void loadAllUsers() {
		List<UserDetails> allUsers=userDetailsRepository.getDataOfAllUsers();
		allUsers.forEach(System.out::println);
	}
	
	//getDataOfAllUsersByCity
	public void loadAllUsersbYCity() {
		List<UserDetails> allUsers=userDetailsRepository.getDataOfUsersByCity("HKD");
		allUsers.forEach(System.out::println);
	}
}
