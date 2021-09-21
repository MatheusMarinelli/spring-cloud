package com.spring.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// add the annotation below with the "name of the other application"
@FeignClient("calculator")
public interface CalculatorClient {
	
	@GetMapping("/math/{a}/{b}") // the path of the endpoint
	// method header
	Double sum(@PathVariable Double a, @PathVariable Double b);

}
