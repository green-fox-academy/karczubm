package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.modells.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankAccountController {
    List<BankAccount> accountList = new ArrayList<>();

    public BankAccountController() {
        accountList.add(new BankAccount("Simba", 2000, "lion", true, true));
        accountList.add(new BankAccount("Pumba", 2000, "pig", false, true));
        accountList.add(new BankAccount("Zordon", 2000, "lion", true, false));
        accountList.add(new BankAccount("Timon", 2000, "mirkat", false, true));
        accountList.add(new BankAccount("Zazu", 2000, "bird", false, true));
    }

    @GetMapping("show")
    public String bankAccountsLister(Model model) {
        model.addAttribute("accountList", accountList);
        return "show";
    }


    @GetMapping("html")
    public String html(Model model) {
        model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "html";
    }

    @GetMapping("characters")
    public String characters(Model model, @ModelAttribute("accountOwner") BankAccount accountOwner) {
        model.addAttribute("accountList", accountList);
        model.addAttribute("accountOwner", accountOwner);
        return "characters";
    }

    @PostMapping("characters")
    public String raiseMoney(@ModelAttribute("accountOwner") BankAccount accountOwner) {
        if (accountOwner.getAnimalType() == null) {
            BankAccount tmp = accountList.stream()
                    .filter(n -> n.getName().equals(accountOwner.getName()))
                    .collect(Collectors.toList())
                    .get(0);
            if (tmp.isKing()) {
                tmp.setBalance(tmp.getBalance() + 100);
            } else {
                tmp.setBalance(tmp.getBalance() + 10);
            }
        } else {
            accountList.add(accountOwner);
        }
        return "redirect:characters";
    }
}
