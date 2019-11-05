package com.example.todo.controllers;

import com.example.todo.repositories.RepoInterface;
import com.example.todo.services.ToDoService;
import com.example.todo.services.ToDoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "todo")
public class ToDoController {

    ToDoServiceInterface service;

    @Autowired
    public ToDoController(ToDoServiceInterface service) {
        this.service = service;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String ready) {
        if (ready == null) {
            model.addAttribute("todolist", service.findAll());
        } else if (ready.equals("true")) {
            model.addAttribute("todoList", service.findReady());
        }
        return "todolist";
    }
}
