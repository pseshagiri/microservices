package com.seshagiri.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="Employee")
public class EmployeeEntity {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="departments")
	private String departments;
	
	@Column(name="salary")
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

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
