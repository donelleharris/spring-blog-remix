package com.donelleharris.springblogremix.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String index(Model model){

        return "posts/index";
    }
}
