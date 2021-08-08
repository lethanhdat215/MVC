package controller;


import Helper.Helper;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping(value = "/bookController")
public class BookController {


//    @RequestMapping("/")
//    public String index() {
//        return "/index";
//    }
//
//    @RequestMapping("/error")
//    public String error() throws Exception {
//        throw new Exception("testing");
//    }


    @Autowired
    private BookService bookService;

    @Autowired
    private Helper helper;

    @RequestMapping(value = "getAll.htm")
    public ModelAndView getAllBook() {
        ModelAndView mav = new ModelAndView("Book");
        List<Book> listBook = bookService.findAll();
        mav.addObject("listBook", listBook);
        return mav;
    }

//    @RequestMapping(value = "borrowBook.htm")
//    public ModelAndView borrowBook() {
//        ModelAndView mav = new ModelAndView("Borrow");
//        List<Book> listBook = bookService.findAll();
//        mav.addObject("listBook", listBook);
//        return mav;
//    }


    @RequestMapping(value = "/initShow.htm", method = RequestMethod.GET) //
    public ModelAndView showProduct(int bookId) {
        ModelAndView mav = new ModelAndView("Show");
        Book showBook = bookService.findById(bookId);
        mav.addObject("showBook", showBook);
        return mav;
    }

    @RequestMapping(value = "/muonSach.htm", method = RequestMethod.GET)
    public ModelAndView muonSach(int bookId) {
        ModelAndView mav;
        Book showBook = bookService.findById(bookId);
        showBook.setQuantity(showBook.getQuantity() - 1);
        int maCode = helper.random();
        showBook.setMaCode(maCode);
        boolean check = bookService.merge(showBook);
        if (showBook.getQuantity() <= 0) {
            mav = new ModelAndView("Error");
        } else {
            mav = new ModelAndView("MuonSach");
        }
        mav.addObject("showBook", showBook);
        mav.addObject("maCode", maCode);
        return mav;
    }


    @RequestMapping(value = "/traSach.htm", method = RequestMethod.POST)
    public String traSach(@RequestParam(name = "bookId") Integer bookId, @RequestParam(name = "code") Integer maCode) {
        Book showBook = bookService.findById(bookId);
        if (maCode == showBook.getMaCode()) {
            showBook.setQuantity(showBook.getQuantity() + 1);
            boolean check = bookService.merge(showBook);
            return "TraSach";
        } else {
            return "Error";
        }
    }

}
