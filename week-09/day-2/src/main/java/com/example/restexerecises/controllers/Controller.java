package com.example.restexerecises.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String renderIndex() {
        return "index";
    }
}
