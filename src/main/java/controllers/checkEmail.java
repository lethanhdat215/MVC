package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class checkEmail {
//    @RequestMapping(value = "/trang-chu",method = RequestMethod.GET)
//    public ModelAndView homePage(){
//        ModelAndView modelAndView = new ModelAndView("hello");
//        return  modelAndView;
//    }

    @GetMapping("/getall")
    public String helloController(Model model, @RequestParam("txtcheckemail") String email) {
        String ketqua;
        String regex = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            ketqua = "hop le";
        } else {
            ketqua = "khong hop le";
        }
        model.addAttribute("inputEmail", email);
        model.addAttribute("result", ketqua);
        return "hello";
    }
}
