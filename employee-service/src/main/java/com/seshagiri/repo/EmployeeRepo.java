package com.seshagiri.repo;

import org.springframework.data.repository.CrudRepository;

import com.seshagiri.entity.EmployeeEntity;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity,Integer>{

}
