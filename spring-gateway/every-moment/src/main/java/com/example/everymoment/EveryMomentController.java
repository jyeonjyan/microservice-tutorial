package com.example.everymoment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/every-moment/v1/api")
public class EveryMomentController {

    @GetMapping("/sayHello")
    public String sayHello(){
        log.info("======== http request ========");
        return "hello every-moment server!";
    }

}
