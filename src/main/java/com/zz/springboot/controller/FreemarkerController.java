package com.zz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

    @RequestMapping("/freemarker")
    public String freemarker(Model model){
        model.addAttribute("message", "hello freemarker");
        return "hello";
    }
}
