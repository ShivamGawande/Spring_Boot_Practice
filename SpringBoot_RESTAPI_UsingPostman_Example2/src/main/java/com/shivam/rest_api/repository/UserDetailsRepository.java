package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.Entity.UserDetails;

public interface UserDetailsRepository  extends JpaRepository<UserDetails, Integer>{

}
