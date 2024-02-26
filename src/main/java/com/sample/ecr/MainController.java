package com.sample.ecr;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

    @GetMapping("health")
    public String getMethodName() {
        return "Healthy!!!";
    }
    

    
}
