/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes.app;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sc
 */
public class MensajesDAO {
    public static void crearMensajeBD(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps =  conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado");
            }catch (SQLException ex) {
                System.out.println(ex);
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void leerMensajesBD(){
        Conexion db_connect = new Conexion();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try (Connection conexion = db_connect.getConnection()){
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareCall(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID : " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch (SQLException e) {
            System.out.println("no se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }
    public static void actualizarMensajeBD(Mensajes mensaje){
         Conexion db_connect = new Conexion();
         
         try (Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
             try {
                 String query = "UPDATE mensajes set mensaje= ?  WHERE id_mensaje = ?";
                 ps = conexion.prepareStatement(query);
                 ps.setString(1, mensaje.getMensaje());
                 ps.setInt(2, mensaje.getId_mensaje());
                 ps.executeUpdate();
                 System.out.println("El mensaje ha sido actualizado");
             }catch (SQLException ex) {
                 System.out.println(ex);
                 System.out.println("No se pudo actualizar el mensaje");
             }
         }catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void borrarMensajeBD(int id_mensaje){
         Conexion db_connect = new Conexion();
         
         try (Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
             try {
                 String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                 ps = conexion.prepareStatement(query);
                 ps.setInt(1, id_mensaje);
                 ps.executeUpdate();
                 System.out.println("El mensaje ha sido borrado");
             }catch (SQLException ex) {
                 System.out.println(ex);
                 System.out.println("No se pudo borrar el mensaje");
             }
         }catch (SQLException e) {
            System.out.println("no se pudo borrar el mensaje");
            System.out.println(e);
        }
    }
}
