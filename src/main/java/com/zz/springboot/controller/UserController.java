package com.zz.springboot.controller;

import com.zz.springboot.entity.User;
import com.zz.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> list() {
        return userService.findAll();
    }

    @RequestMapping("create")
    public User create(User user) {
        return userService.save(user);
    }
}
