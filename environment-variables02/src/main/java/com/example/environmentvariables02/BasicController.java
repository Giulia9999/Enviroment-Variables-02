package com.example.environmentvariables02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {
    @Autowired
    Environment environment;
    @GetMapping
    public String getEnv(){
        return environment.getProperty("welcomeMsg");
    }
}
