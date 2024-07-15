package com.ligabetplay.betplayapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ligabetplay.betplayapp.models.User;


@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Sebastian", "Vergara");
        model.addAttribute("title", "Soy el valor de la clave title");
        model.addAttribute("user", user);
        return "details";
    }
}
