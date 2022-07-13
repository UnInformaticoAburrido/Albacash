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
    private float numeroMesa;
    private String fecha;
    private String Autor;
    private ArrayList<Linea> cuerpo;
    
    //Generare un contructor el cual contruira la comanda con informacion predefinida y posteriormente añadira las lineas.

    public Comanda(float numeroMesa, String fecha) {
        this.numeroMesa = numeroMesa;
        this.fecha=fecha;
    }
    public Comanda(float numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.fecha=fecha;
    }
}
