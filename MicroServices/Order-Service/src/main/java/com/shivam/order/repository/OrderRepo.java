package com.shivam.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.order.entity.OrderEntity;

public interface OrderRepo  extends JpaRepository<OrderEntity, String>{

}
