package com.sinol.testSpringbootApp.controllers;

import com.sinol.testSpringbootApp.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class GreetingController {

    public static final String BASE_PATH = "/";
    public static final String VIEW_NAME = "home";

    @GetMapping(BASE_PATH)
    public String home(Model model) {
        model.addAttribute("title", "Welcome!");
        Person person = Person.builder().id(UUID.randomUUID()).name("Ivan").email("qwerty@gmail.com").address("123456").address("654321").build();
        model.addAttribute("person", person.toString());
        return VIEW_NAME;
    }

}
