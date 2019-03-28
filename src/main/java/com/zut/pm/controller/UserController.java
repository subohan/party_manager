package com.zut.pm.controller;

import com.zut.pm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value="login", method=RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request){
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String res = userService.login(account, password);
        return res;
    }

}
