package com.seshagiri.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties()
public class Employee {
	
	
	public Employee() {}
	
	public Employee(int id, String firstName, String lastName, List<String> departments, double salary) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departments = departments;
		this.salary = salary;
	}
	private int id;
	private String firstName;
	private String lastName;
	private List<String> departments;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
