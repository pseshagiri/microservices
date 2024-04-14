package com.seshagiri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.model.Employee;
import com.seshagiri.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired()
	EmployeeService employeeService;
	
	@GetMapping()
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getById(int id){
		return employeeService.getById(id);
	}

}
