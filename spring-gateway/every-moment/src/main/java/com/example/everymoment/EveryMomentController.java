package com.example.everymoment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class EveryMomentController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello every-moment server";
    }

}
