package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
        public String page(){
            return "page";

    }

    @GetMapping("/")
    public String page1(){
        return "pageJQuery";

    }
}
