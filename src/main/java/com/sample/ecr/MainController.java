package com.sample.ecr;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MainController {

    @GetMapping("health")
    public ResponseEntity<String> getMethodName() {
        return ResponseEntity.status(HttpStatus.OK).body("AWS ECR DEMO!");
    }
    @GetMapping("test")
    public ResponseEntity<String> getTestDetails() {
        return ResponseEntity.status(HttpStatus.OK).body("Test!");
    }
    
    

    
}
