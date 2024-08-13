package com.shivam.jpa.entity.interview;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="interview_users")
public class Users {
	@Id
	private int id;
	private String name;
	private double salary;
	private int year;
	//@Column(name = "is_selected")
	private boolean isSelected;
	private String email;
	public Users() {
		
	}
	public Users(int id, String name, double salary, int year, boolean isSeleted, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.year = year;
		this.isSelected = isSeleted;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", salary=" + salary + ", year=" + year + ", isSelected="
				+ isSelected + ", email=" + email + "]";
	}
	
	
}
