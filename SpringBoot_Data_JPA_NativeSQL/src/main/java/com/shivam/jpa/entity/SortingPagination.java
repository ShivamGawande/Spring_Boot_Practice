package com.shivam.jpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class SortingPagination {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	// Req : Load Data, Result should be in Ascending Order Based on User_Id

   // Sort class by method take entity Properties not column names.
	
	public void loadDataByUserIdAsce() {
		List<UserDetails> allUser=userDetailsRepository.findAll(Sort.by("userId"));
		allUser.forEach(System.out::println);
	}
	
	// Req : Load Data, Result should be in Desc Order Based on User_Id
	public void loadDataByUserIdDesc() {
		List<UserDetails> allUser=userDetailsRepository.findAll(Sort.by(Direction.DESC,"userId"));
		allUser.stream().forEach(System.out::println);
	}
	
	//Req : Load Data, Result should be in Asec Order Based on Name , Gender
	public void loadDataOrderByNameGenderInAsec() {
		List<UserDetails> users=userDetailsRepository.findAll(Sort.by("name","gender"));
		users.forEach(System.out::println);
	}
	
	//Req : Load Data, Result should be in Desc Order Based on Name , Gender
	public void loadDataOrderByNameAndGenderInDesc() {
		List<UserDetails> users=userDetailsRepository.findAll(Sort.by(Direction.DESC,"name","gender"));
		users.forEach(System.out::println);
	}
	
	//Pagination
	public void getFirstRecords() {
		List<UserDetails> users=userDetailsRepository.findAll(Pageable.ofSize(3)).toList();
		users.forEach(System.out::println);
	}
	
	// Req : load Data of page 2 : Page size 3
	
    //NOTE : Page Index starts from 0 
	public void getPageWiseRecords() {
		Pageable pageable=PageRequest.of(0,1,Sort.by("name"));
		List<UserDetails> users=userDetailsRepository.findAll(pageable).toList();
		users.forEach(System.out::println);
	}
}
