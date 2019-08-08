package com.neuedu.controllor;


import com.neuedu.pojo.Category;
import com.neuedu.pojo.Product;
import com.neuedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user/product/")
public class ProductController {

    @Autowired
    IProductService iProductService;

    @RequestMapping("find")
    public String findALL(HttpSession session)  {
        List<Product> products = iProductService.selectallProduct();
        session.setAttribute("productlist", products);
        return "productlist";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        int count = iProductService.deleteProduct(id);
        return "redirect:/user/product/find";

    }


    @RequestMapping(value = "update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") Integer id, HttpSession session) {


        Product product = iProductService.selectBYid(id);
        session.setAttribute("product", product);
        return "productupdate";
    }


    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public String update(@RequestParam("image")MultipartFile multipartFile,HttpServletRequest request, Product product, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String newFilename=null;
        if(multipartFile!=null){
            String uuid= UUID.randomUUID().toString();
            String filename=multipartFile.getOriginalFilename();
            String fileExtendname=filename.substring(filename.lastIndexOf("."));
            newFilename=uuid+fileExtendname;

            File file=new File("D:\\IdeaImages\\business_manage");
            if (!file.exists()){
                file.mkdir();
            }
            File newfile=new File(file,newFilename);
            multipartFile.transferTo(newfile);

        }
        product.setMainImage("/business_manage/"+newFilename);

        int count = iProductService.updateProduct(product);
        if (count > 0) {
            return "redirect:/user/product/find";
        }
        return "productupdate";
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert() {

        return "productinsert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(@RequestParam("image")MultipartFile multipartFile, Product product, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String newFilename=null;
        if(multipartFile!=null){
            String uuid= UUID.randomUUID().toString();
            String filename=multipartFile.getOriginalFilename();
            String fileExtendname=filename.substring(filename.lastIndexOf("."));
            newFilename=uuid+fileExtendname;

            File file=new File("D:\\IdeaImages\\business_manage");
            if (!file.exists()){
                file.mkdir();
            }
            File newfile=new File(file,newFilename);
            multipartFile.transferTo(newfile);

        }


        product.setMainImage("/business_manage/"+newFilename);

        int count = iProductService.addProduct(product);
        if (count > 0) {
            return "redirect:/user/product/find";
        }
        return "productinsert";
    }





}
