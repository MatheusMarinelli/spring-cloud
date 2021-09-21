package com.spring.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.client.CalculatorClient;

@Service
public class ClientService {
	
	// inject the interface and use it
	@Autowired
	private CalculatorClient client;
	
	public Double sum(Double a, Double b) {
		return client.sum(a, b);
	}
}
