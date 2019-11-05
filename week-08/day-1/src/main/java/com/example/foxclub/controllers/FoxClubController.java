package com.example.foxclub.controllers;

import com.example.foxclub.services.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxClubController {
    private FoxClubService service;

    @Autowired
    public FoxClubController(FoxClubService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String indexMap(Model model, @RequestParam(required = false) String name) {
        if (name == null) {
            return "login";
        } else {
            model.addAttribute("name", service.getFoxName(name));
            model.addAttribute("food", service.getFoxFood(name));
            model.addAttribute("drink", service.getFoxDrink(name));
            model.addAttribute("trick", service.getFoxTricksNumber(name));
            model.addAttribute("tricks", service.getFoxTricks(name));
            return "index";
        }
    }

    @GetMapping("add")
    public String addFoxGet() {
        return "add";
    }

    @PostMapping("add")
    public String addFoxPost(@RequestParam String name) {
        service.addNewFox(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/login")
    public String loginPageGet() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPagePost(@RequestParam String name) {
        if (service.isFoxExists(name)) {
            return "redirect:/?name=" + name;
        } else {
            return "add";
        }
    }

    @GetMapping("/nutritionStore")
    public String nutStoreGet(Model model, @RequestParam String name) {
        model.addAttribute("foods", service.getFoods());
        model.addAttribute("drinks", service.getDrinks());
        model.addAttribute("name", name);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String nutStorePost(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
        service.changeFoxFood(name, food);
        service.changeFoxDrink(name, drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("trickCenter")
    public String trickCEnterGet(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("tricks", service.getTricks());
        return "trickCenter";
    }

    @PostMapping("trickCenter")
    public String trickCenterPost(@RequestParam String name, String trick) {
        service.teachFoxATrick(name, trick);
        return "redirect:/?name=" + name;
    }
}
