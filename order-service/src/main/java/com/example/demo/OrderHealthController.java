package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order/health")
public class OrderHealthController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {return ResponseEntity.ok("Order Service is running!");}
}
