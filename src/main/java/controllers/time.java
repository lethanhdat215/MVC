package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Controller
public class time {
    @GetMapping("/getall")
    public String helloController(Model model, @RequestParam("times") String input) {
        Date ketqua = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new java.util.Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Thời gian hiện tại của Hàn Quốc là " +
                cal.get(Calendar.HOUR_OF_DAY) + ":" +
                cal.get(Calendar.MINUTE) + ":" +
                cal.get(Calendar.SECOND));

        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeZone(TimeZone.getTimeZone("Asia/USA"));
        cal1.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        cal1.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        cal1.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Thời gian hiện tại của Mỹ là " +
                cal1.get(Calendar.HOUR_OF_DAY) + ":" +
                cal1.get(Calendar.MINUTE) + ":" +
                cal1.get(Calendar.SECOND));
        if (input.equalsIgnoreCase("vietNam")) {
           ketqua = date;
        } else if (input.equalsIgnoreCase("hanQuoc")) {
            ketqua = cal.getTime();
        } else {
            ketqua = cal1.getTime();
        }
        model.addAttribute("ketqua", ketqua);

        return "hello";
    }
}
