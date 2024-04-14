package com.seshagiri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seshagiri.entity.EmployeeEntity;
import com.seshagiri.model.Employee;
import com.seshagiri.repo.EmployeeRepo;
import com.seshagiri.util.EmployeeUtil;

@Service()
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAll(){		
		List<EmployeeEntity> actualList = new ArrayList<EmployeeEntity>();
		employeeRepo.findAll().iterator().forEachRemaining(actualList::add);
		return  EmployeeUtil.mapEntityToModelList(actualList);		 
	}
	
	public Employee getById(int id) {
		return EmployeeUtil.mapEntityToModel(employeeRepo.findById(id).get());	
	}

	
}
