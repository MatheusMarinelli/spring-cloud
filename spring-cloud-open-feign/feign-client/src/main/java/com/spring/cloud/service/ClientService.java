package com.spring.cloud.service;

import com.spring.cloud.client.CalculatorClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    // inject the interface and use it
    @Autowired
    private CalculatorClient client;

    @CircuitBreaker(name = "sum", fallbackMethod = "sumFallback") // fallbackMethod must have the same return of its origin method
    public Double sum(Double a, Double b) {
        return client.sum(a, b);
    }


    public Double sumFallback(Double a, Double b, Exception e) {
        return 0.0;
    }

}
