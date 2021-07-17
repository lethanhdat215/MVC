package controllers;

import models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/Login")
    public String loginUser(Model model, @ModelAttribute Login login) {
        model.addAttribute("login", login);
        return "index";
    }
}
