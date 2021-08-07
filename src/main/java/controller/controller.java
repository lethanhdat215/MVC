package controller;

import entity.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("counter")
public class controller {

    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter(0);
    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") Counter counTer) {
        counTer.increment();
        System.out.println(counTer.getCount());
        return "index";
    }
}