package Controller;

import Model.entity.Blog;
import Model.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/blogController")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/getAll.htm")
    public ModelAndView getAllProduct() {
        ModelAndView mav = new ModelAndView("Blog");
        List<Blog> listBlog = blogService.finAll();
        mav.addObject("listBlog", listBlog);
        return mav;
    }

    @RequestMapping(value = "initInsert.htm")
    public ModelAndView initInsertBlog() {
        ModelAndView mav = new ModelAndView("Create");
        Blog blogNew = new Blog();
        mav.addObject("blogNew", blogNew);
        return mav;
    }

    @RequestMapping(value = "/insert.htm", method = RequestMethod.POST)
    String insertBlog(Blog blogNew) {
        boolean check = blogService.save(blogNew);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/initUpdate.htm")
    public ModelAndView initUpdateBlog(int blogId) {
        ModelAndView mav = new ModelAndView("Update");
        Blog blogUpdate = blogService.findByI(blogId);
        mav.addObject("blogUpdate", blogUpdate);
        return mav;
    }

    @RequestMapping(value = "/update.htm", method = RequestMethod.POST)
    public String updateBlog(Blog blogUpdate) {
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
        }else {
            return "Error";

        }

    }

}
