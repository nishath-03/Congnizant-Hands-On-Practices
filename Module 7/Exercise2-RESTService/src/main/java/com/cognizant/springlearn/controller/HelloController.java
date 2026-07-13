package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Hello World RESTful Web Service (Hands-on 1 of spring-rest-handson 2)
@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    // GET /hello → returns plain "Hello World" string
    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("Start");
        LOGGER.info("End");
        return "Hello World";
    }
}
