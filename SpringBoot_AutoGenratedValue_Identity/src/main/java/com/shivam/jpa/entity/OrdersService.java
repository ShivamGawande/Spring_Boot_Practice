package com.shivam.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdersService {
	@Autowired
	OrderDetailsRepository repository;

	public void createOrder() {

		// No Value of Order Id

		OrderDetails order = new OrderDetails();
		order.setAmount(5000);
		order.setEmail("dilip@gmail.com");
		order.setNoOfProducts(4);

		repository.save(order);

	}

}
