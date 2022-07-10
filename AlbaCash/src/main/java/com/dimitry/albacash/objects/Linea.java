/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dimitry.albacash.objects;

import java.util.ArrayList;

/**
 *
 * @author didra
 */
public class Linea {
    private Producte producto;
    private int cantidad;
    private ArrayList<Linea> especificaciones;
    
    //Generare un constructor el cual se llamara cada vez que se inserte un objeto este no contendra ningun control de errores

    public Linea(Producte producto, int cantidad, ArrayList<Linea> especificaciones) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.especificaciones = especificaciones;
    }
    
    
    
    //Geters and Setters
    
    public Producte getProducto() {
        return producto;
    }

    public void setProducto(Producte producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Linea> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(ArrayList<Linea> especificaciones) {
        this.especificaciones = especificaciones;
    }
    
    
    
}
