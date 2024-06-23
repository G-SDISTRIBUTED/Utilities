/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Pc
 */
public class Paquete implements Serializable {
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
    
    public static Paquete deserializar(String mensaje) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(mensaje, Paquete.class);
        } catch (IOException e) {
            throw new RuntimeException("Error deserializando el paquete", e);
        }
    }

    public static String serializar(Paquete paquete) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(paquete);
        } catch (IOException e) {
            throw new RuntimeException("Error serializando el paquete", e);
        }
    }

    public void cambiarTokenDeCliente(String tokenDeCliente) {
        this.tokenDeCliente=tokenDeCliente;
    }
}
