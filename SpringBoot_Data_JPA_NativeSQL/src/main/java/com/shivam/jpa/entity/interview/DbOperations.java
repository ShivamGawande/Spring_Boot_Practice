package com.shivam.jpa.entity.interview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbOperations {
	
	@Autowired
	UsersRepository usersRepository;
	
	//add information in interview_users
	public void addUserInfo() {
		 Users user = new Users(1, "Shivam", 45000, 2000, true, "shivam@gmail.com");
		 usersRepository.save(user);
	}
	
	//update salary to 50000 of user id 1
	public void updateUserInfo() {
		Users user = new Users(1, "Shivam", 50000, 2000, true, "shivam@gmail.com");
		 usersRepository.save(user);
	}
	
	// Update salary to 50000 : 1
	// load + save
	public void updateUserData() {
		Users user=usersRepository.findById(1).get();
		user.setSalary(45000);
		usersRepository.save(user);
	}
	
	//Native SQL Query
	public void getUsersInformation() {
		List<Users> users=usersRepository.loadDataFromUsers();
		users.forEach(System.out::println);
	}
	
	public void getUserInformationByEmailId(String email) {
		List<Users> users=usersRepository.loadUsersByEmail(email);
		users.forEach(System.out::println);
	}
}
