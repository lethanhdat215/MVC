package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sandwich {
    @GetMapping("/getall")
    public String helloController(Model model, @RequestParam("Sandwich")String[] sandwich) {
        System.out.println(sandwich.length);
        model.addAttribute("Sandwichs",sandwich);
        model.addAttribute("Size",sandwich.length-1);
        return "hello";
    }
}
