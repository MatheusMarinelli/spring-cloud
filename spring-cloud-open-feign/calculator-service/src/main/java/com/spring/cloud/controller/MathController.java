package com.spring.cloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/sum")
	public ResponseEntity<Double> sum(@RequestParam(value = "firstNumber", defaultValue = "0") Double firstNumber,
									  @RequestParam(value = "secondNumber", defaultValue = "0") Double secondNumber) {

		return ResponseEntity.ok(firstNumber + secondNumber);
	}

}
