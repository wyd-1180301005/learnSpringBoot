package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String show1(Model model){
        model.addAttribute("msg", "Hello, Thymeleaf!");
        return "index";
    }
}
