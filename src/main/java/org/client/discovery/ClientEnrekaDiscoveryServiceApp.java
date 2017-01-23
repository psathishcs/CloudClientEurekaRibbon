package org.client.discovery;

import org.client.discovery.service.client.EmployeesServiceFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = EmployeesServiceFeignClient.class)
public class ClientEnrekaDiscoveryServiceApp {
	public static void main(String[] args){
		SpringApplication.run(ClientEnrekaDiscoveryServiceApp.class, args);
	}
}
