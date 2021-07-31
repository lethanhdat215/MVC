package Controller;


import HelperDate.HelperDate;
import Model.entity.Blog;
import Model.entity.Category;
import Model.service.BlogService;
import Model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = "/blogController")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    HelperDate helperDate;

//    @RequestMapping(value = "/getAll.htm")
//    public ModelAndView getAllProduct() {
//        ModelAndView mav = new ModelAndView("admin/blog/Blog");
//        List<Blog> listBlog = blogService.finAll();
//        mav.addObject("listBlog", listBlog);
//        return mav;
//    }

    @RequestMapping(value = "initInsert.htm")
    public ModelAndView initInsertBlog() {
        ModelAndView mav = new ModelAndView("admin/blog/Create");
        Blog blogNew = new Blog();
        List<Category> listCategory = categoryService.finAll();
        mav.addObject("listCategory", listCategory);
        mav.addObject("blogNew", blogNew);
        return mav;
    }

    @RequestMapping(value = "/insert.htm", method = RequestMethod.POST)
    String insertBlog(Blog blogNew) {
        blogNew.setBlogDate(helperDate.date());
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
        blogUpdate.setBlogDate(helperDate.date());
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

    @GetMapping(value = "/getAll.htm")
    public String home(@RequestParam(name = "page", required = false) Integer page, Model model) {
        int limit = 3;
        int totalRecord = (int) blogService.countTotalRecords();
        int endPage = totalRecord / limit;
        if (endPage % limit != 0) {
            endPage++;
        }
        if (page == null) {
            page = 1;
        }
        int position = (page - 1) * limit;
        List<Blog> listBlog = blogService.getListBlog(position, limit);
        List<Category> listCategory = categoryService.finAll();
        model.addAttribute("listCategory",listCategory);
        model.addAttribute("end", endPage);
        model.addAttribute("listBlog", listBlog);
        model.addAttribute("page", page);
        return "admin/blog/Blog";
    }

    @GetMapping(value = "/getAllByDate.htm")
    public String getBlogByDate(Model model) {
        List<Blog> listBlog = helperDate.finAllByDate();
        model.addAttribute("listBlog", listBlog);
        return "admin/blog/Blog";
    }


    @RequestMapping(value = "/initSearchByName.htm")
    public ModelAndView initSearchBlogByName(String blogName) {
        ModelAndView mav = new ModelAndView("admin/blog/Search");
        List<Blog> listBlogName = blogService.finAllByName(blogName);
        System.out.println(blogName);
        mav.addObject("lisBlogName", listBlogName);
        System.out.println(listBlogName.size());
        return mav;
    }


    @RequestMapping(value = "/showBlogByCate.htm", method = RequestMethod.GET) //
    public String showProductBike(Model model , @RequestParam(name = "cateId") Integer cateId) {
        Category cate = categoryService.findById(cateId);
        List<Blog> listBlog = blogService.finByCate(cate);
        model.addAttribute("listBlog",listBlog);
        return "admin/blog/Bike";
    }
}
