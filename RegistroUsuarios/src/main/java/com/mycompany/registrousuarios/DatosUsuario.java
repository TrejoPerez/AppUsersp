package com.mycompany.registrousuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
/**
 *
 * @author root
 */
public class DatosUsuario implements Serializable{
    private String nombre;
    private String correo;
    private String password;
    private DatosImagen imagen;
    
    public DatosUsuario(String nombre, String correo, String password,DatosImagen imagen){
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.imagen = imagen;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getPassword(){
        return this.password;
    }
    public DatosImagen getDatosImagen(){
        return this.imagen;
    }
}
