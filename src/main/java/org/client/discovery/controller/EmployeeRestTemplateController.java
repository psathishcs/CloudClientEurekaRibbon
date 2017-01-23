package org.client.discovery.controller;

import java.util.List;

import org.client.discovery.entity.Employees;
import org.client.discovery.service.client.EmployeesServiceRestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRestTemplateController {

	@Autowired
	private EmployeesServiceRestTemplateClient restTemplateClient;
	
	@RequestMapping("/getEmployeesRestTemplate")
	public List<Employees> getEmployee() {
		return restTemplateClient.getEmployees();
	}
}
