package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("registerPage")
    public String registerPage(){
        return "register";
    }

    @RequestMapping("register")
    public String register(User user){
        int i = userService.addUser(user);
        if(i != -1){

            return "login";
        }else {
            return "register";
        }
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("login")
    public String login(User user, HttpSession session){
        User user1 = userService.getUser(user);
        if(user1 != null){
            session.setAttribute("user",user1);
            return "redirect:home";
        }else {
            return "login";
        }
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.setAttribute("user",null);
        return "redirect:home";
    }
}
