package com.shivam.rest_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consumer_Country{
	private String name;
    private String iso2;
    @JsonProperty("long")
    private double longi;
    private double lat;
	public Consumer_Country(String name, String iso2, double longi, double lat) {
		super();
		this.name = name;
		this.iso2 = iso2;
		this.longi = longi;
		this.lat = lat;
	}
	public Consumer_Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIso2() {
		return iso2;
	}
	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "Consumer_Country [name=" + name + ", iso2=" + iso2 + ", longi=" + longi + ", lat=" + lat + "]";
	}
    
    
}
