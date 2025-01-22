package com.ai25.team1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tf")
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
