package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("/{a}/{b}")
	public ResponseEntity<Double> sum(@PathVariable Double a, @PathVariable Double b) {
		return ResponseEntity.ok(service.sum(a,b));
	}

}
