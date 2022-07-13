/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dimitry.albacash.objects;

import com.dimitry.albacash.utilities.*;

/**
 *
 * @author didra
 */
public class Producte {
    private String nombre;
    private Alergenos[] listadoAlergenos;
    private int stock;
    private int precio;
    private Producte[] ingredientes;
    //Generamos un constructor vacio que se usara para generar recursivamente productos desde el archivo
    public Producte() {
    }
    //Constructor base este se eliminara en un futuro

    public Producte(String nombre, Alergenos[] listadoAlergenos, int stock, int precio, Producte[] ingredientes) {
        this.nombre = nombre;
        this.listadoAlergenos = listadoAlergenos;
        this.stock = stock;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public void GsonProducte(){
        
    }
    
}
