package com.wsan.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wsan.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("willi", "sanchez");
        user.setEmail("sancheznw@correo.com");
        model.addAttribute("title", "Hola mundo, Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
    @ModelAttribute("users")
    public List<User> usersModel() {
        return  Arrays.asList(
                new User("Pepe", "Gonzalez"),
                new User("Lalo", "Perez", "Lalo@correo.com"),
                new User("Jhon", "Doe", "Jhon@correo.com"),
                new User("Maria", "Ramos"));
    }
}
