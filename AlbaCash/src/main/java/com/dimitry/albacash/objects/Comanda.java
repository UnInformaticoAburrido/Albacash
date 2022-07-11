/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dimitry.albacash.objects;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author didra
 */
public class Comanda {
    private int numeroMesa;
    private String fecha;
    private String Autor;
    private ArrayList<Linea> cuerpo;
    
    //Generare un contructor el cual contruira la comanda con informacion predefinida y posteriormente añadira las lineas.

    public Comanda(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        
        
    }
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
