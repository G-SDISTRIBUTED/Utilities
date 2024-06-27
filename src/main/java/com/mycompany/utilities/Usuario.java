/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utilities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Usuario {
    Integer id;
    String name;
    String username;
    String email;
    String telefono;
    String password;
    List<String> socketTokens= new ArrayList<>();

    public Usuario(Integer id, String name, String username, String email, String telefono, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
    }

    public Usuario(String username) {
        this.username = username;
    }

    public Usuario(Integer id, String username) {
        this.id = id;
        this.username = username;
    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void addSocketToken(String token){
        socketTokens.add(token);
    }
    
    public String getLastSocketToken(){
        return socketTokens.get(socketTokens.size()-1);
    }
}
