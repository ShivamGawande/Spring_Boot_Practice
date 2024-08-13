package com.shivam.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest_api.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
