package com.jx.controller;


import com.jx.bean.User;
import com.jx.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public String login(@Param("name") String name, @Param("password") String password, HttpSession session) {
        User login = userService.login(name, password);
        if (login != null) {
            session.setAttribute("login", login);

            return "home";
        } else {
            return "用户名或者密码错误";
        }


    }
}



