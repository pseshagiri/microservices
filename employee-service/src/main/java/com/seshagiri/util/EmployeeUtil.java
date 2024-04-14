package com.seshagiri.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.seshagiri.entity.EmployeeEntity;
import com.seshagiri.model.Employee;

public class EmployeeUtil {
	
	
	public static List<Employee> mapEntityToModelList(List<EmployeeEntity> entity)
	{
		
		 List<Employee> emplList = entity.stream().
				 map(e-> mapEntityToModel(e)).
				  collect(Collectors.toList());
		return emplList;
	}
	
	public static Employee mapEntityToModel(EmployeeEntity entity)
	{
		Employee model = new Employee();
		model.setId(entity.getId());
		model.setFirstName(entity.getFirstName());
		model.setLastName(entity.getLastName());
		List<String> department = new ArrayList<String>();
		department.add(entity.getDepartments());
		model.setDepartments(department);
		return model;
	}

}
