/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author sc
 */
public class Inicio {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {            
            System.err.println("-------------------");
            System.err.println("Aplicación de mensajes");
            System.err.println("1. Crear mensaje       Create");
            System.err.println("2. Listar mensajes     Red");
            System.err.println("3. Editar un mensaje   Update");
            System.err.println("4. Eliminar un mensaje Delete");
            System.err.println("5. Salir");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.editarMensaje();
                    break;
                case 4:
                    mensajesService.borrarMensajes();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
        
        Conexion conexion = new Conexion();
        Connection cnx = conexion.getConnection();
        /*try(Connection cnx = conexion.getConnection()) {
            
        } catch (SQLException e) {
            System.out.println(e);
        }*/
    }
}
