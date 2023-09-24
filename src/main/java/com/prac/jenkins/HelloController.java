package com.prac.jenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${SECRET}")
    private String hello;

    @GetMapping("/")
    public String hello() {
        return hello;
    }

}
