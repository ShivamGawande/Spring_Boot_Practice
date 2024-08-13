package com.shivam.jpa.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

@Transactional
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
	
	@Query(value="select * from user_details where city=?1 and gender=?2",nativeQuery = true)
	List<UserDetails>loadByCityAndGender(String city,String gender);
	
	//Named Positional Params
	@Query(value="select * from user_details where city=:cityName and gender=:gender",nativeQuery = true)
	List<UserDetails>loadByCityAndGenderValues(@Param("gender")String gender,@Param("cityName") String city);
	
	//DML
	//update user_details set contact=:contact where user_id=:uid
	@Modifying
	@Query(value="update user_details set contact=:contact where user_id=:uid",nativeQuery = true)
	public int updateUserContactByUserId(@Param("uid") int userId, @Param("contact") long contact);
	
	//JPQL
	@Query(value="select u from UserDetails u")
	public List<UserDetails>getDataOfAllUsers();
	
	//JPQL: get based on City
	@Query(value="select u from UserDetails u where u.city=:cityName")
	public List<UserDetails>getDataOfUsersByCity(@Param("cityName") String city);
}
