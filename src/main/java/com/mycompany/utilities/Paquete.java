/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utilities;

import com.google.gson.Gson;

/**
 *
 * @author Pc
 */
public class Paquete{
    private String protocolo;
    private String parametros;
    private String tokenDeCliente;
    
    public Paquete(String protocolo,String parametros, String tokenDeCliente){
        this.protocolo=protocolo;
        this.parametros=parametros;
        this.tokenDeCliente=tokenDeCliente;
    }
    
    public Paquete(String protocolo,String parametros){
        this.protocolo=protocolo;
        this.parametros=parametros;
        this.tokenDeCliente=null;
    }

    public String obtenerProtocolo() {
        return protocolo;
    }

    public String obtenerParametros() {
        return parametros;
    }
    
    public void cambiarTokenDeCliente(String tokenDeCliente) {
        this.tokenDeCliente=tokenDeCliente;
    }
    
    public static Paquete deserializar(String mensaje) {
        Gson gson = new Gson();
        return gson.fromJson(mensaje, Paquete.class);
    }

    public static String serializar(Paquete paquete) {
        Gson gson = new Gson();
        return gson.toJson(paquete);
    }
}
