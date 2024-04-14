package com.seshagiri;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.seshagiri.model.Employee;
import com.seshagiri.service.EmployeeService;



@SpringBootTest
class EmployeeServiceApplicationTests {
	
	@Autowired()
	MockMvc mockMvc;
	
	@Autowired()
	EmployeeService employeService;

	@Test
	void contextLoads() {
	}
	
	@Test()
	public void testGetById() throws Exception {
		List<String> dept = new ArrayList<String>();
		dept.add("IT");
		dept.add("Architect");
		Employee employee = new Employee(1,"Seshagiri","Pichika",dept,4400000);
		
		when(employeService.getById(1)).thenReturn(employee);
		
		mockMvc.perform(get("/1")).andReturn();	
	}

}
