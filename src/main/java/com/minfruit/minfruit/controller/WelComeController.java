package com.minfruit.minfruit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WelComeController {
    @GetMapping("/")
    public String hello(){
        return "welcome hello world";
    }

    @GetMapping("/{name}")
    public String name(@PathVariable String name){
        return "hello i am " + name;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
