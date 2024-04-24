package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("admin".equals(username) && "1234".equals(password)) {
            model.addAttribute("username", username);
            return "success";
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
