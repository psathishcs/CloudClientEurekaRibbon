package org.client.discovery.service.client;

import java.util.List;

import org.client.discovery.entity.Employees;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface EmployeesService {
	@RequestMapping(value="/employees", method=RequestMethod.GET, produces="application/json")
	List<Employees> getEmployees();
}
