package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzx
 * 2022/4/3 18:05
 */
@Controller
public class MyController {
    @RequestMapping("/doquery")
    public String doQuery(Model model){
        model.addAttribute("name","name");
        System.out.println(4);
        return "test";
    }
}
