package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {
@RequestMapping("/web/greeting")
    public String greeting(Model model){
        model.addAttribute("name","world");
        return "greeting";
}
}
