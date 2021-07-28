package Controller;

import Model.entity.Category;
import Model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/categoryController")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "getAll.htm")
    public ModelAndView getAllCategory() {
        ModelAndView mav = new ModelAndView("admin/category/Category");
        List<Category> listCategory = categoryService.finAll();
        mav.addObject("listCategory", listCategory);
        return mav;
    }

    @RequestMapping(value = "initInsert.htm")
    public ModelAndView initInsertCategory() {
        ModelAndView mav = new ModelAndView("admin/category/Create");
        Category categoryNew = new Category();
        mav.addObject("categoryNew", categoryNew);
        return mav;
    }

    @RequestMapping(value = "/insert.htm", method = RequestMethod.POST)
    public String insertCategory(Category categoryNew) {
        boolean check = categoryService.save(categoryNew);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping("/initUpdate.htm")
    public ModelAndView initUpdateCategory(Integer categoryId) {
        ModelAndView mav = new ModelAndView("admin/category/Update");
        Category categoryUpdate = categoryService.findById(categoryId);
        mav.addObject("categoryUpdate", categoryUpdate);
        return mav;
    }

    @RequestMapping(value = "/update.htm", method = RequestMethod.POST)
    public String updateCategory(Category categoryUpdate) {
        boolean check = categoryService.merge(categoryUpdate);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/delete.htm")
    public String deleteCategory(Integer categoryId) {
        boolean check = categoryService.delete(categoryId);
        if (check) {
            return "redirect:getAll.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/initShow.htm", method = RequestMethod.GET)
    public ModelAndView showCategory(int categoryId) {
        ModelAndView mav = new ModelAndView("admin/category/Show");
        Category showCategory = categoryService.findById(categoryId);
        mav.addObject("showCategory",showCategory);
        return mav;
    }


}
