package org.client.discovery.controller;

import java.util.List;

import org.client.discovery.entity.Employees;
import org.client.discovery.service.client.EmployeesServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesFeignController {
	@Autowired
	private EmployeesServiceFeignClient feignClient;
	
	@RequestMapping("/getEmployeesFeign")
	public List<Employees> getEmployee() {
		return feignClient.getEmployees();
	}

}
