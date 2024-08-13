package com.example.demo.jpaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbOperations {
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
	//Inser data into Order_details
	public void addOrderInformation() {
		//Entity Object
		OrderDetails order1=new OrderDetails();
		
		order1.setOrderId(111);
		order1.setAmount(500);
		order1.setCity("Akola");
		order1.setEmailId("shiv@gmail.com");
		order1.setGender("Male");
		order1.setNoOfItems(5);
		order1.setName("Shivam");
		
		orderDetailsRepository.save(order1);
	}
	
	//Delete Order Data
	public void deleteOrder(int orderId) {
		orderDetailsRepository.deleteById(orderId);
	}
}
