package Controller;


import HelperDate.HelperDate;
import Model.entity.Blog;
import Model.entity.Category;
import Model.service.BlogService;
import Model.service.CategoryService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.List;


@Controller
@RequestMapping(value = "/blogController")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    HelperDate date;

    @RequestMapping(value = "/getAll.htm")
    public ModelAndView getAllProduct() {
        ModelAndView mav = new ModelAndView("admin/blog/Blog");
        List<Blog> listBlog = blogService.finAll();
        mav.addObject("listBlog", listBlog);
        return mav;
    }

    @RequestMapping(value = "initInsert.htm")
    public ModelAndView initInsertBlog() {
        ModelAndView mav = new ModelAndView("admin/blog/Create");
        Blog blogNew = new Blog();
        List<Category> listCategory = categoryService.finAll();
        mav.addObject("listCategory",listCategory);
        mav.addObject("blogNew", blogNew);
        return mav;
    }

    @RequestMapping(value = "/insert.htm", method = RequestMethod.POST)
    String insertBlog(Blog blogNew) {
        blogNew.setBlogDate(date.date());
        boolean check = blogService.save(blogNew);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/initUpdate.htm")
    public ModelAndView initUpdateBlog(Integer blogId) { // lay tham so truyen tu tren request
        ModelAndView mav = new ModelAndView("admin/blog/Update");
        Blog blogUpdate = blogService.findById(blogId);
        List<Category> listCategory = categoryService.finAll();
        mav.addObject("listCategory", listCategory);
        mav.addObject("blogUpdate", blogUpdate);
        return mav;
    }

    @RequestMapping(value = "/update.htm", method = RequestMethod.POST) // xu ly tham so truyen tu tren request
    public String updateBlog(Blog blogUpdate) {
        blogUpdate.setBlogDate(date.date());
        boolean check = blogService.merge(blogUpdate);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/delete.htm")
    public String deleteBlog(int blogId) {
        boolean check = blogService.delete(blogId);
        System.out.println(check);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";

        }

    }

    @RequestMapping(value = "/initShow.htm", method = RequestMethod.GET) //
    public ModelAndView showProduct(int blogId) {
        ModelAndView mav = new ModelAndView("admin/blog/Show");
        Blog showBlog = blogService.findById(blogId);
        mav.addObject("showBlog", showBlog);
        return mav;
    }

}
