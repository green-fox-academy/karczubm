package com.karczubm.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class WebshopController {
    List<ShopItem> stock = new ArrayList<>();

    public WebshopController() {
        initializeStock();
    }

    public void initializeStock() {
        stock.add(new ShopItem("Running shoes", "Nike running shoes for everyday use", 19.99f, 5));
        stock.add(new ShopItem("Printer", "Some HP printer that will print pages", 49.9f, 3));
        stock.add(new ShopItem("Coca cola", "0.5 l standard coke", 0.99f, 1));
        stock.add(new ShopItem("Wokin", "Fried chicken with wokin sauce", 4.5f, 0));
        stock.add(new ShopItem("T-Shirt", "Blue with a corgi on a bike", 9.9f, 8));
    }

    @GetMapping(value = "/myWebShop")
    public String stockPasser(Model model) {
        model.addAttribute("items", stock);
        return "index";
    }

    @GetMapping(value = "myWebShop/available")
    public String stockAvailablePasser(Model model) {
        model.addAttribute("items", stock.stream()
                .filter(a -> a.getQuantity() != 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping(value = "myWebShop/cheapest")
    public String stockCheapestFirstPasser(Model model) {
        model.addAttribute("items", stock.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping(value = "myWebShop/nike")
    public String stockNikePasser(Model model) {
        model.addAttribute("items", stock.stream()
                .filter(a -> StringUtils.containsIgnoreCase(a.getDescription(), "nike", Locale.ENGLISH)
                        || StringUtils.containsIgnoreCase(a.getName(), "nike", Locale.ENGLISH))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping(value = "myWebShop/mostExpensive")
    public String stockMostExpensivePasser(Model model) {
        model.addAttribute("items", stock.stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .get());
        return "index";
    }
    @PostMapping(value = "/search")
    public String search(Model model, @RequestParam String search){
        model.addAttribute("items", stock.stream().filter(a->StringUtils.containsIgnoreCase(a.getDescription(), search, Locale.ENGLISH)
                || StringUtils.containsIgnoreCase(a.getName(), search, Locale.ENGLISH))
                .collect(Collectors.toList()));
        return "index";
    }
}
