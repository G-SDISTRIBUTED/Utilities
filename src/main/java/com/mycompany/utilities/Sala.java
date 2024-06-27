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
public class Sala {
    String token;
    String name;
    Usuario creador;
    List<Usuario> jugadores= new ArrayList<>();

    public Sala(String token, String name, Usuario creador) {
        this.token = token;
        this.name = name;
        this.creador = creador;
    }
    
    public Sala(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public List<Usuario> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Usuario> jugadores) {
        this.jugadores = jugadores;
    }

    public void addJugador(Usuario jugador){
        this.jugadores.add(jugador);
    }
    
    @Override
    public String toString() {
        return "Sala{" + "token=" + token + ", name=" + name + ", creador=" + creador + ", jugadores=" + jugadores + '}';
    }
    
    
}
