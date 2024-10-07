package com.spring.azure.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("ping")
    public String sayHello() {
        return "Hello Saro, Welcome to Azure!!!";
    }
}
