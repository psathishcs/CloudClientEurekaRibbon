package org.client.discovery.service.client;

import java.net.URI;
import java.util.List;

import org.client.discovery.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeesServiceRestTemplateClient {
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Employees> getEmployees(){
		URI uri = URI.create("http://docker-hr-rs/hr/api/employees");
		List<Employees> employees = (List<Employees>) restTemplate.getForObject(uri, List.class);
		return employees;
	}
	
}
