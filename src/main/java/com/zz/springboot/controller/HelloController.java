package com.zz.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/springboot")
    public String helloSpringBoot() {
        return "hello springboot";
    }
}
