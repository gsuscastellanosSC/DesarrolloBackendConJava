/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes.app;

import java.util.Scanner;

/**
 *
 * @author sc
 */
public class mensajesService {
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeBD(registro);
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesBD();
    }
    
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        actualizacion.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensajeBD(actualizacion);
    }
    
     public static void borrarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeBD(id_mensaje);
    }
}
