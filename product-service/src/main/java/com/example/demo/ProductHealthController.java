package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product/health")
public class ProductHealthController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {return ResponseEntity.ok("Product Service is running!");}
}
