package com.flipkart.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.api.entity.PaymentDetails;



public interface PaymentRepository extends JpaRepository<PaymentDetails, String>{

	PaymentDetails  findByUserIdAndPassword(String userId, String password);

}
