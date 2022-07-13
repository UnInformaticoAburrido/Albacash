/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dimitry.albacash;

import java.time.LocalDateTime;

/**
 *
 * @author didra
 */
public class AlbaCash {

    public static void main(String[] args) {
        
    }
    //Este metodo busca almacenar la hora de creacion de una comanda
    private String obtenerfecha(){
        //para que el contructor inserte una hora exacta.
        String dev;
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        dev = ("Hora : " + hours  + ":"+ minutes +":"+seconds);
        return dev;
    }
}
