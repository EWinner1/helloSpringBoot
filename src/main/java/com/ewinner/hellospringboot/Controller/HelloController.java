package com.ewinner.hellospringboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hellocontroller")
    public String hello(){
        return "Hello SpringBoot!";
    }
}
