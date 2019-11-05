package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterApp {
    AtomicLong counter=new AtomicLong();

    @RequestMapping("/web/greetCounter")
    public String greeting(Model model, @RequestParam String input){
        model.addAttribute("name",input);
        model.addAttribute("counter",counter.getAndIncrement());
        return "greetingCounter";
    }
}
