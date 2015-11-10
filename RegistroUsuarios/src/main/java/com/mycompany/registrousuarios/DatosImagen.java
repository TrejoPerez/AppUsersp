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
public class DatosImagen implements Serializable{
   byte [] imagen;
   public DatosImagen(byte [] imagen){
       this.imagen = imagen;
   }
  
   public byte[] getImagen(){
       return this.imagen;
   }
   
}
