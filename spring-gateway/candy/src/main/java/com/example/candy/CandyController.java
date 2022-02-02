package com.example.candy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/candy/v1/api")
public class CandyController {

    @GetMapping("/sayHello")
    public String sayHello(){
        log.info("======http request======");
        return "hello candy server!";
    }

}
