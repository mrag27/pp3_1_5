package ru.kata.spring.boot_security.demo.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/admin")
    public String showAllUser(Model model) {
        return "admin-profile";
    }

    @GetMapping("/user")
    public String showOneUser() {
        return "user-profile";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}

