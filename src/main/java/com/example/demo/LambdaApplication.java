package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
	}

	
	@GetMapping("/message")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("Hello from Spring Boot on AWS Lambda!",HttpStatus.OK);
    }
    
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>("Hello from dk",HttpStatus.OK);
    }
    
}
