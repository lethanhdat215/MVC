package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tinhtoan {
    @GetMapping("/getAll")// đường dẫn
    public String helloControllers(Model model, @RequestParam("txtsotien") float txtsotien) {
        float result = txtsotien * 23000;
        model.addAttribute("result", result);
        model.addAttribute("dola", txtsotien);
        return "hello";
    }
}

