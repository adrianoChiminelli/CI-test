package com.pdi.citest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/getString")
    public String getString() {
        return "This is a test";
    }

    @GetMapping("/getValue")
    public Long getValue() {
        return Long.valueOf((1500 / 5) * 10);
    }

}
