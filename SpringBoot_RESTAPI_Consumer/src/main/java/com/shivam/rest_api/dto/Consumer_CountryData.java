package com.shivam.rest_api.dto;

import java.util.List;

public class Consumer_CountryData {
	private String error;
	private String msg;
	private List<Consumer_Country> data;
	public Consumer_CountryData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer_CountryData(String error, String msg, List<Consumer_Country> data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Consumer_Country> getData() {
		return data;
	}
	public void setData(List<Consumer_Country> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Consumer_CountryData [error=" + error + ", msg=" + msg + ", data=" + data + "]";
	}
	
	
}
