package com.shivam.rest_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate_education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	private String standard;
	private String nameOfOrg;
	private Integer passedYear;
	private Double avgPercentage;
	public Education(Integer eid, String standard, String nameOfOrg, Integer passedYear, Double avgPercentage) {
		super();
		this.eid = eid;
		this.standard = standard;
		this.nameOfOrg = nameOfOrg;
		this.passedYear = passedYear;
		this.avgPercentage = avgPercentage;
	}
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
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
		return "Education [eid=" + eid + ", standard=" + standard + ", nameOfOrg=" + nameOfOrg + ", passedYear="
				+ passedYear + ", avgPercentage=" + avgPercentage + "]";
	}
	
	
}
