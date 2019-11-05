package com.example.demodependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilController {

    @GetMapping("useful")
    public String main(){
        return "useful";
    }

    @GetMapping("useful/coloured")
    public String randomBackground(@Autowired UtilityService service, Model model){
        model.addAttribute("backgroundColour", service.randomColor());
        return "coloured";
    }

    @GetMapping("useful/email")
    public String email(@RequestParam ("email") String email,@Autowired UtilityService service, Model model){
       model.addAttribute("message",service.emailValidatorMessage(email));
       model.addAttribute("colour",service.emailValidatorColour(email));
        return "email";
    }

    @GetMapping("useful/caesar")
    public String caesar(@RequestParam("text") String text, @RequestParam ("number") int number,@Autowired UtilityService service,Model model){
        model.addAttribute("newText",service.caesar(text,number));
        return "caesar";
    }
}

