package com.spring.azure.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("ping")
    public String sayHello() {
        return "Hello Saro, Welcome to Azure!!!";
    }

    @GetMapping("users")
    public List<AzureUser> users() {
        return userRepository.findAll();
    }

    @PostMapping(value = "users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AzureUser user(@RequestBody AzureUser azureUser) {
        userRepository.save(azureUser);
        return azureUser;
    }
}
