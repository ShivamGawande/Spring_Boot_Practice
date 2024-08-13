package com.shivam.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_dts")
public class Product {
	
	@Id
	@Column(name="pid")
	private String productId;
	
	@Column(name="p_name")
	private String prouctName;
	
	@Column(name="p_price")
	private Double productPrice;
	
	@Column(name="p_quantity")
	private Integer productQuantity;

	public Product(String productId, String prouctName, Double productPrice, Integer productQuantity) {
		super();
		this.productId = productId;
		this.prouctName = prouctName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProuctName() {
		return prouctName;
	}

	public void setProuctName(String prouctName) {
		this.prouctName = prouctName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prouctName=" + prouctName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}
	
	
}
