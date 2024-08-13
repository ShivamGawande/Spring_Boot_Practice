package com.shivam.jpa.entity.interview;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	//select * from interview_users
	@Query(value="select * from interview_users",nativeQuery = true)
	List<Users> loadDataFromUsers();
	
	// select * from interview_users where email=?
	@Query(value="select * from interview_users where email=?1",nativeQuery = true)
	List<Users> loadUsersByEmail(String email);
}
