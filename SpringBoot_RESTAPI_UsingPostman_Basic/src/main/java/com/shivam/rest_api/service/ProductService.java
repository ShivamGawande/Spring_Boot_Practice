package com.shivam.rest_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.entity.Product;
import com.shivam.rest_api.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public String addProduct(String id,String name,Double price,Integer quant) {
		Product p1=new Product();
		p1.setProductId(id);
		p1.setProuctName(name);
		p1.setProductPrice(price);
		p1.setProductQuantity(quant);
		if(productRepository.findById(id).isPresent()) {
			return "Product id already present please check it";
		}
		else {
			productRepository.save(p1);
			return "product information added successfully";
		}
		
	}
	
	public List<Product> getAllProduct(){
		List<Product> listOfusers=productRepository.findAll();
		return listOfusers;
	}
}
