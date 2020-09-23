package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String demo(){
        return "home";
    }

    @GetMapping("/music")
    public String music(){
        return "music";
    }

    @GetMapping("/video")
    public String video(){
        return "video";
    }

    @GetMapping("/about")
    public String test(){
        return "about";
    }
}
