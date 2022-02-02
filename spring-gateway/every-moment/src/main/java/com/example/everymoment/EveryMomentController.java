package com.example.everymoment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/every-moment/v1/api")
public class EveryMomentController {

    @GetMapping("/sayHello")
    public String sayHello(@RequestHeader(value = "reverse-proxy") String value){
        log.info("======== http request from: {} ========", value);
        return "hello every-moment server!";
    }

}
