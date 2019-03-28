package com.zut.pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/lg")
public class loginController {

    @RequestMapping("/loginPage")
    public String loginPage(){
        System.out.print("************");
        return "/login";
    }

    @RequestMapping(path = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(HttpServletRequest request){


        return "success";
    }

    @RequestMapping(path="/regist", method = {RequestMethod.GET, RequestMethod.POST})
    public String register(){
        return "/register";
    }


}
