package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
