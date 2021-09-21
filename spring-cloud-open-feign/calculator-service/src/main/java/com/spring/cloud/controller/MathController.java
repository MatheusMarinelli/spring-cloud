package com.spring.cloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/{a}/{b}")
	public ResponseEntity<Double> sum(@PathVariable Double a, @PathVariable Double b) {
		return ResponseEntity.ok(a + b);
	}

}
