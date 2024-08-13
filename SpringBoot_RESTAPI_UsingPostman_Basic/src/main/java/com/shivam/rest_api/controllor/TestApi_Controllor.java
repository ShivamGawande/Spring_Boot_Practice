package com.shivam.rest_api.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.entity.Product;
import com.shivam.rest_api.service.ProductService;

@RestController
public class TestApi_Controllor {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "This is hello method from controllor class";
	}
	
	@PostMapping(path="/addProduct" ,consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public String addProduct(@RequestBody Product p) {
		System.out.println(p.getProductId());
		
		//sending data to service layer
		String msg=productService.addProduct(p.getProductId(), p.getProuctName(), p.getProductPrice(), p.getProductQuantity());
		return msg;
	}
	
	@GetMapping(path="/getProductDetails",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProductsDetails(){
		List<Product> listOfproducts=productService.getAllProduct();
		listOfproducts.forEach(k->System.out.println(k));
		return listOfproducts;
	}
}
