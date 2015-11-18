package com.zz.springboot.controller;

import com.zz.springboot.entity.User;
import com.zz.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/springboot")
    @ResponseBody
    public String helloSpringBoot() {
        return "helloSpringBoot";
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<User> list() {
        return userService.findAll();
    }

    @RequestMapping("/user/create")
    @ResponseBody
    public User create(User user) {
        return userService.save(user);
    }
}
