package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    @ResponseBody//felesleges mert a restController egyben response body is
    public Greeting greeting(@RequestParam String name) {
        Greeting greeting = new Greeting(counter.getAndIncrement(), "hello, " + name);
        return greeting;
    }
}
