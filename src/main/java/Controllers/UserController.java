package Controllers;

import Entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "Create";
    }

    @PostMapping("/create-user")
    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        System.out.println(bindingResult.hasErrors());
        System.out.println(user.getEmail());
       if (bindingResult.hasErrors()){
           return "Create";
       }
        return "index";
    }
}
