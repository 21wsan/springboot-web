package com.wsan.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsan.springboot.webapp.springboot_web.models.User;
import com.wsan.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("willi", "sanchez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo, Spring Boot");
        return userDto;
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Jhon", "Doe");
        User user2 = new User("Andres", "Guzman");
        User user3 = new User("Pepe", "Doe");

        //Igual resultado en una linea de codigo
        List<User> users = Arrays.asList(user, user2, user3);
        /*
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        */

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("willi", "sanchez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo, Spring Boot");
        body.put("user", user);
        return body;
    }
}