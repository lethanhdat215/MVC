package controllers;

import models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class employeeController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/employee")
    public String managerEmployee(Model model,@ModelAttribute Employee employee){
        model.addAttribute("employee",employee);
        return "index";
    }
}
