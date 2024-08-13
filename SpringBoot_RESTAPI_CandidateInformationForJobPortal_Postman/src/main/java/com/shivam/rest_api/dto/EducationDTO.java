package com.shivam.rest_api.dto;

public class EducationDTO {
	private String standard;
	private String nameOfOrg;
	private Integer passedYear;
	private Double avgPercentage;
	
	public EducationDTO(String standard, String nameOfOrg, Integer passedYear, Double avgPercentage) {
		super();
		this.standard = standard;
		this.nameOfOrg = nameOfOrg;
		this.passedYear = passedYear;
		this.avgPercentage = avgPercentage;
	}

	public EducationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getNameOfOrg() {
		return nameOfOrg;
	}

	public void setNameOfOrg(String nameOfOrg) {
		this.nameOfOrg = nameOfOrg;
	}

	public Integer getPassedYear() {
		return passedYear;
	}

	public void setPassedYear(Integer passedYear) {
		this.passedYear = passedYear;
	}

	public Double getAvgPercentage() {
		return avgPercentage;
	}

	public void setAvgPercentage(Double avgPercentage) {
		this.avgPercentage = avgPercentage;
	}

	@Override
	public String toString() {
		return "EducationDTO [standard=" + standard + ", nameOfOrg=" + nameOfOrg + ", passedYear=" + passedYear
				+ ", avgPercentage=" + avgPercentage + "]";
	}
	
	
	
}
