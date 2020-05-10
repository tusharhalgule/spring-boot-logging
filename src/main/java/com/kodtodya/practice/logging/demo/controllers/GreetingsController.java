package com.kodtodya.practice.logging.demo.controllers;

import com.kodtodya.practice.logging.demo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {

    @Autowired(required = true)
    private GreetingsService greetingsService;

    @GetMapping("/hello")
    public String controlGreetings(@RequestParam(name = "name", required = false) String name) {
        return greetingsService.sayHello(name);
    }

}
