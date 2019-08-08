package com.neuedu.controllor;


import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user/category/")
public class CatagoryController {



    @Autowired
    ICategoryService iCategoryService;

    @RequestMapping("find")
    public String findALL(HttpSession session)  {


        List<Category> categories = iCategoryService.findAllCategory();
        session.setAttribute("categorylist", categories);
        session.setAttribute("category", null);
        return "category/list";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        int count = iCategoryService.deleteCategory(id);
        return "redirect:/user/category/find";

    }


    @RequestMapping(value = "update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") Integer id, HttpSession session) {


        Category category = iCategoryService.findCategoryById(id);
        session.setAttribute("category", category);
        return "category/index";
    }


    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public String update(HttpServletRequest request,Category category,  HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int count = iCategoryService.updataCategory(category);
        if (count > 0) {
            return "redirect:/user/category/find";
        }
        return "category/index";
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert() {

        return "category/index";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(Category category,HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int count = iCategoryService.addCategory(category);
        if (count > 0) {
            return "redirect:/user/category/find";
        }
        return "category/index";
    }



}
