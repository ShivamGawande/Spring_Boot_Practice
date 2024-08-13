package com.shivam.rest_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Consumer_DeviceData {
	@JsonProperty("color")
    private String color;

    @JsonProperty("capacity")
    private String capacity;

    @JsonProperty("capacity GB")
    private int capacityGB;

    @JsonProperty("price")
    private double price;

    @JsonProperty("generation")
    private String generation;

    @JsonProperty("CPU model")
    private String cpuModel;

    @JsonProperty("Hard disk size")
    private String hardDiskSize;

    @JsonProperty("year")
    private int year;

    @JsonProperty("Strap Colour")
    private String strapColour;

    @JsonProperty("Case Size")
    private String caseSize;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Screen size")
    private double screenSize;
    
    @JsonProperty("updatedAt")
    private String updatedAt;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getCapacityGB() {
		return capacityGB;
	}

	public void setCapacityGB(int capacityGB) {
		this.capacityGB = capacityGB;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStrapColour() {
		return strapColour;
	}

	public void setStrapColour(String strapColour) {
		this.strapColour = strapColour;
	}

	public String getCaseSize() {
		return caseSize;
	}

	public void setCaseSize(String caseSize) {
		this.caseSize = caseSize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Consumer_DeviceData [color=" + color + ", capacity=" + capacity + ", capacityGB=" + capacityGB
				+ ", price=" + price + ", generation=" + generation + ", cpuModel=" + cpuModel + ", hardDiskSize="
				+ hardDiskSize + ", year=" + year + ", strapColour=" + strapColour + ", caseSize=" + caseSize
				+ ", description=" + description + ", screenSize=" + screenSize + "]";
	}

	public Consumer_DeviceData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer_DeviceData(String color, String capacity, int capacityGB, double price, String generation,
			String cpuModel, String hardDiskSize, int year, String strapColour, String caseSize, String description,
			double screenSize) {
		super();
		this.color = color;
		this.capacity = capacity;
		this.capacityGB = capacityGB;
		this.price = price;
		this.generation = generation;
		this.cpuModel = cpuModel;
		this.hardDiskSize = hardDiskSize;
		this.year = year;
		this.strapColour = strapColour;
		this.caseSize = caseSize;
		this.description = description;
		this.screenSize = screenSize;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
    
    
    }
