package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexHandler
{

    @GetMapping("/index")
    public String index(){
        System.out.println("index...");
        return "index";
    }

//    @GetMapping("/index2")
//    public String index2(Map<String,String> map){
//        map.put("name","张三");
//        return "index";
//    }
}