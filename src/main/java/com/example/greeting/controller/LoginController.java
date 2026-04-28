package com.example.greeting.controller;

import com.example.greeting.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        if(user.getUsername().equals("admin") && user.getPassword().equals("1234")) {
            return "success";
        } else {
            return "error";
        }
    }
}