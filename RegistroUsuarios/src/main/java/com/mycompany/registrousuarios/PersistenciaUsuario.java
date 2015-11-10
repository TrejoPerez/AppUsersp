package com.mycompany.registrousuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author root
 */
public class PersistenciaUsuario {
   public static void guardarUsuario(DatosUsuario u) throws Exception{
       ArrayList<DatosUsuario> usuario = new ArrayList<DatosUsuario>();
       File f = new File("Usuarios");
       try{
            if(f.exists()) usuario=leerUsuario();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            usuario.add(u);
            oos.writeObject(usuario);
            System.out.println("Usuario Guardado");
       }catch(Exception e){
       }    
       
   }
   public static ArrayList<DatosUsuario> leerUsuario(){
       ArrayList<DatosUsuario> usuario = new ArrayList<DatosUsuario>();
       try{
        
        File f = new File("Usuarios");
        //Se obtienen los bytes de un archivo
        FileInputStream fis= new FileInputStream(f);
        //Deserializa un archivo que contenga primitivos
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuario =(ArrayList<DatosUsuario>) ois.readObject();
        
       }catch(Exception e){
           
       }
       return usuario;
       
   }
   public static DatosUsuario leerId(int i){
        DatosUsuario u=null;
        ArrayList<DatosUsuario> usuario = new ArrayList<DatosUsuario>();
        File f = new File("Usuarios");
       try{
        
        if(f.exists()) usuario = leerUsuario();
        u = usuario.get(i);
        
       }catch(Exception e){
           
       }
       return u;
       
   }
}
