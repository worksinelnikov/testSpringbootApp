package com.sinol.testSpringbootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    public static final String BASE_PATH = "/";
    public static final String VIEW_NAME = "home";

    @GetMapping(BASE_PATH)
    public String home(Model model) {
        model.addAttribute("title", "Welcome!");
        return VIEW_NAME;
    }

}
