package com.kjlink.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/demo")
public class FirstDocker {

    @RequestMapping("/index")
    public String firstPage(HttpServletRequest request){
        return "demo/index";
    }
}
