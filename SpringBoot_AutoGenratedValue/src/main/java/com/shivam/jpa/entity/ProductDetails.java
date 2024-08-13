package com.shivam.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_details")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private int pid;
	private String pName;
	private Double pAmount;
	private int pItems;
	public ProductDetails(int pid, String pName, Double pAmount, int pItems) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pAmount = pAmount;
		this.pItems = pItems;
	}
	public ProductDetails() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpAmount() {
		return pAmount;
	}
	public void setpAmount(Double pAmount) {
		this.pAmount = pAmount;
	}
	public int getpItems() {
		return pItems;
	}
	public void setpItems(int pItems) {
		this.pItems = pItems;
	}
	
	
	
	

	
}
