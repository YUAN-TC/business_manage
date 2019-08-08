package com.neuedu.controllor;


import com.neuedu.consts.Const;
import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired(required = true)
    IUserService iUserService;

    @Autowired
    private HttpSession session;


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpServletRequest request,HttpServletResponse response) throws MyException {


        return "login";


    }
    @RequestMapping(value = "clogin")
    public String clogin(HttpServletRequest request,HttpServletResponse response){
        Cookie username_cookie = new Cookie("username",null);
        Cookie passsword_cookie = new Cookie("password",null);
        response.addCookie(username_cookie);
        response.addCookie(passsword_cookie);
        this. session.setAttribute("userInfo", null);
        return "redirect:login";

    }



    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(UserInfo userInfo, HttpServletRequest request,HttpServletResponse response) throws MyException {



        UserInfo userInfo1 = iUserService.login(userInfo);
        this. session.setAttribute("username", userInfo1);
        Cookie username_cookie = new Cookie("username", userInfo1.getUsername());
        Cookie passsword_cookie = new Cookie("password", userInfo1.getPassword());

        username_cookie.setMaxAge(60*60*24*7);
        passsword_cookie.setMaxAge(60*60*24*7);

        response.addCookie(username_cookie);
        response.addCookie(passsword_cookie);


        return "redirect:/user/home";
    }



    @RequestMapping("home")
    public String home() throws MyException {

        return "home/home";
    }



    @RequestMapping("find")
    public String findALL(HttpSession session) throws MyException {

        List<UserInfo> userInfos = iUserService.findAllUser();
        session.setAttribute("user", userInfos);
        return "userlist";
    }


    @RequestMapping(value = "update/{name}", method = RequestMethod.GET)
    public String update(@PathVariable("name") String name, HttpSession session) throws MyException {


        UserInfo userInfo = iUserService.findUserByName(name);
        session.setAttribute("user", userInfo);
        return "userinfoupdate";
    }


    @RequestMapping(value = "update/{name}", method = RequestMethod.POST)
    public String update(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, MyException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html；charset=UTF-8");
        int count = iUserService.updataUser(userInfo);
        if (count > 0) {
            return "redirect:/user/find";
        }
        return "userinfoupdate";
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String insert() throws MyException {

        return "userinsert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(UserInfo userInfo,HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, MyException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html；charset=UTF-8");
        int count = iUserService.addUser(userInfo);
        if (count > 0) {
            return "redirect:/user/find";
        }
        return "userinsert";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") int id) throws MyException {

        iUserService.deleteUser(id);
        return "redirect:/user/find";

    }



}
