package com.wsan.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){
        return "redirect:/details";
        //return "forward:/list"; //opcion adicional no borrar esta linea
    }   
}
