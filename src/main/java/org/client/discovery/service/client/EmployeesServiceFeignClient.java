package org.client.discovery.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
@Component
@FeignClient(value = "HUMANRESOURCERS", fallback = EmployeesServiceFeignClientFallback.class)
public interface EmployeesServiceFeignClient extends EmployeesService{
}
