package com.shivam.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public class ProductDBOperations {
	
	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	@Transactional
	public void addProductDetails() {
		/*ProductDetails product1=new ProductDetails();
		product1.setpName("CPU");
		product1.setpAmount(10550.00);
		product1.setpItems(10);
		productDetailsRepository.save(product1);*/
		
		ProductDetails product2=new ProductDetails();
		product2.setpName("Mouse");
		product2.setpAmount(500.00);
		product2.setpItems(40);
		productDetailsRepository.save(product2);
		
		/*ProductDetails product3=new ProductDetails();
		product3.setpName("KeyBoard");
		product3.setpAmount(850.00);
		product3.setpItems(70);
		productDetailsRepository.save(product3);*/
	}
}
