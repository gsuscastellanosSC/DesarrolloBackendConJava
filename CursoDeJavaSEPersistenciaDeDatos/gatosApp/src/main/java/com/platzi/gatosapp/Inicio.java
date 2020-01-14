/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.gatosapp;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author sc
 */
public class Inicio {
    public static void main (String []arg) throws IOException{
        int opcion_menu = -1;
        String[] botones = {" 1. ver gatos", "2. ver favoritos", "3. salir"};
        
         
        do {            
            String opcion = (String)JOptionPane.showInputDialog(null, "Gaticos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
            
            //validar la opción que selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
            if (opcion.equals(botones[i])){
                opcion_menu = i;
            }
        }   
            switch (opcion_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    GatosService.verFavorito(gato.apikey);
                    break;
                default:
                    break;
            }
        }while (opcion_menu != 1);
    }
}
