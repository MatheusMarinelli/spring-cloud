package com.spring.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// add the annotation below with the "name of the other application"
@FeignClient(value = "calculator")
public interface CalculatorClient {

	@GetMapping("/math/sum")
	Double sum(@RequestParam(value = "firstNumber") Double firstNumber,
			   @RequestParam(value = "secondNumber") Double secondNumber);

}
