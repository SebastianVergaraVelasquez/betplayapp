package com.ligabetplay.betplayapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ligabetplay.betplayapp.models.User;
import com.ligabetplay.betplayapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")

public class UserRestController {
    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Sebastian", "Vergara");
        UserDto userdto = new UserDto();
        userdto.setTitulo("Ingeniebrio");
        userdto.setUser(user);
        return userdto;
    }

    @GetMapping("/list-details")
    public List<User>listdetails() {
        User user = new User("Juan", "Perez");
        User userA = new User("Camilo", "Hernandez");
        User userB = new User("Martha", "Estupiñan");
        List<User> lstUsers = new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }

}