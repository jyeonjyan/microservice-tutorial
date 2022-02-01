package com.example.candy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class CandyController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello candy server!";
    }

}
