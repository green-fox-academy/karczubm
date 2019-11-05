package com.example.demodependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GFAController {

    private GFAService service;

    @Autowired
    public GFAController(GFAService service) {
        this.service = service;
    }

    @GetMapping("gfa")
    public String main(Model model) {
        model.addAttribute("number", service.countStudents());
        return "gfa";
    }

    @GetMapping("gfa/students")
    public String allStudents(Model model) {
        model.addAttribute("students", service.findAll());
        return "students";
    }

    @GetMapping("gfa/list")
    public String studentList(Model model) {
        model.addAttribute("students", service.findAll());
        return "list";
    }

    @GetMapping("gfa/add")
    public String studAdder() {
        return "add";
    }

    @GetMapping("gfa/save")
    public String studentSaver(@RequestParam("name") String name) {
        service.save(name);
        return "save";
    }

    @GetMapping("gfa/check")
    public String check1(@ModelAttribute ("student") String name, Model model) {
        model.addAttribute("name", name);
        return "check";
    }

    @PostMapping("gfa/check")
    public String check2(@RequestParam("student") String name) {
        System.out.println("cica");
        service.checkStudent(name);
        return "redirect:check";
    }
}
