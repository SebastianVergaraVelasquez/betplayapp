package com.ligabetplay.betplayapp.models.dto;

import com.ligabetplay.betplayapp.models.User;

public class UserDto {
    private String titulo;
    private User user;
    public UserDto() {
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
