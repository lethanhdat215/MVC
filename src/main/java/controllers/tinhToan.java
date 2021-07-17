package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
public class tinhToan {
    @GetMapping("/getall")
    public String helloControleer(Model model, @RequestParam("numberOne") int numberOne,
                                  @RequestParam("numberTwo") int numberTwo, @RequestParam("action") String action) {
        String result = "";
        String comparator = "";
        switch (action) {
            case "Addition(+)": {
                result = String.valueOf(numberOne + numberTwo);
                comparator = "+";
                break;
            }
            case "Subtraction(-)": {
                result = String.valueOf(numberOne - numberTwo);
                comparator = "-";
                break;
            }
            case "Multiplication(X)": {
                result = String.valueOf(numberOne * numberTwo);
                comparator = "X";
                break;
            }
            case "Division(/)": {
                if (numberTwo == 0) {
                    result = "not divisible by 0!";
                } else {
                    result = String.valueOf(numberOne / numberTwo);
                }
                comparator = "/";
                break;
            }
        }
        model.addAttribute("numberOne", numberOne);
        model.addAttribute("numberTwo", numberTwo);
        model.addAttribute("result", result);
        model.addAttribute("comparator", comparator);

        return "hello";
    }
}
