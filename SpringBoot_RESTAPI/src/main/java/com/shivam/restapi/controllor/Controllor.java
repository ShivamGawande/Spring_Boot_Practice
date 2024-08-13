package com.shivam.restapi.controllor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.shivam.restapi.entity.Product;

@Controller
public class Controllor {
	
	@GetMapping("/getProducts")
	//@ResponseBody
	public List<Product> getProducts(){
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product("A123", "Bat", 2500.00, 20));
		products.add(new Product("A124", "Ball", 600.00, 10));
		products.add(new Product("A122", "Stump", 900.00, 30));
		
		return products;
	}
}
