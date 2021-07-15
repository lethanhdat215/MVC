package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@Controller
public class TraCuu {
    @GetMapping("/getAll")
    public String helloController(Model model, @RequestParam("txtTiengAnh") String tiengAnh) {
        TreeMap<String,String> map = new TreeMap<String,String>();
        String result = "";
        map.put("One","Một");//one => mot
        map.put("Two","Hai");
        map.put("Three","Ba");
        map.put("For","Bốn");
        map.put("Five","Năm");
        for (Map.Entry<String, String> entry : map.entrySet()) {
//           entry.getKey() + " - " + entry.getValue())
            if (tiengAnh.equalsIgnoreCase(entry.getKey())) {
                result = entry.getValue();
            }else {
                result = "Không tìm thấy nghĩa";
            }
        }
        model.addAttribute("inputEnglish", tiengAnh);
        model.addAttribute("tiengViet",result);
        return "hello";
    }
}
