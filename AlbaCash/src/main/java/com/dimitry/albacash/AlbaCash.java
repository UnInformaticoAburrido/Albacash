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
        System.out.println("Hello World!");
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);
    }
}
