package com.example.demo.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.jpaEntity.OrderDetailsRepository;

@Component
public class UserDataService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
  //Get Data Based on City and Gender
	public void loadDataByCityNadGender() {
		List<UserDetails> userByCitynadGender=userDetailsRepository.findByCityAndGender("HKD","Male");
		
		userByCitynadGender.forEach(System.out::println);

	}
	
	//Delete data by age
	public void deleteUserDataByAge(int age) {
		userDetailsRepository.deleteByAge(age);
	}
}
