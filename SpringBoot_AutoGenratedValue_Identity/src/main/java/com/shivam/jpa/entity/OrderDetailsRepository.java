package com.shivam.jpa.entity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, UUID> {

}
