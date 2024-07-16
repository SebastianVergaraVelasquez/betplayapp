package com.ligabetplay.betplayapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ligabetplay.betplayapp.models.User;
import com.ligabetplay.betplayapp.models.dto.UserDto;

@RestController
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Sebastian", "Vergara");
        model.addAttribute("title", "Soy el valor de la clave title");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/userform")
    public String userform(Model model) {
        User user = new User("Sebastian", "Vergara");
        model.addAttribute("title", "Soy el valor de la clave title");
        model.addAttribute("user", user);
        return "userform";
    }

    // @PostMapping("/betplayapp/api/userform")
    // public String submitForm(@RequestParam("titulo") String titulo,
    // @RequestParam("nombre") String nombre, @RequestParam("apellido") String
    // apellido) {
    // // Aquí puedes procesar los datos recibidos del formulario
    // System.out.println("Titulo: " + titulo);
    // System.out.println("Nombre: " + nombre);
    // System.out.println("Apellido: " + apellido);
    // // Puedes realizar más acciones aquí, como guardar en una base de datos, etc.

    // // Por ahora, redirigimos a una página de confirmación
    // return "redirect:/details";
    // }

    @PostMapping("/createproduct")
    public User createproduct(@RequestBody User user){
    return user;
    }

}
