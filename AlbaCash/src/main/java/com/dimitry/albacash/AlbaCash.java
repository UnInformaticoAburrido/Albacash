/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dimitry.albacash;

import java.time.LocalDateTime;

/**
 *
 * @author didra
 */
public class AlbaCash {
    public String obtenerfecha(){
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
