package com.shivam.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.order.dto.OrderDTO;
import com.shivam.order.entity.OrderEntity;
import com.shivam.order.repository.OrderRepo;

@Service
public class OrderServiceIMPL implements OrderService{

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public String create(OrderDTO dto) {
		OrderEntity order = new OrderEntity();
		order.setOrderId(dto.getOrderId());
		order.setName(dto.getName());
		order.setEmail(dto.getEmail());
		order.setContact(dto.getEmail());
		order.setAmount(dto.getAmount());
		if(orderRepo.findById(dto.getOrderId()).isPresent())
		return null;
		else {
			orderRepo.save(order);
			return "Order Created Successfully";
		}
	}

}
