package org.client.discovery.service.client;

import java.util.ArrayList;
import java.util.List;

import org.client.discovery.entity.Employees;
import org.springframework.stereotype.Component;

@Component
public class EmployeesServiceFeignClientFallback implements EmployeesServiceFeignClient{
	
	@Override
	public List<Employees> getEmployees(){
		List<Employees> employees = new ArrayList<Employees>();
		Employees employee = new Employees();
		employees.add(employee);
		return employees;
	}
	
}
