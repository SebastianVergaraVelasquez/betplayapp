package com.ligabetplay.betplayapp.controllers;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ligabetplay.betplayapp.models.User;
import com.ligabetplay.betplayapp.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")

public class UserRestController {
    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Sebastian", "Vergara");
        UserDto userdto = new UserDto();
        userdto.setTitulo("Ingeniebrio");
        userdto.setUser(user);
        return userdto;
    }
}