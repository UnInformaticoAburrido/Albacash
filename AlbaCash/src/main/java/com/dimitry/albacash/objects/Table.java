/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dimitry.albacash.objects;

/**
 *
 * @author didra
 */
public class Table {
    private String numero;
    //Comanda master almacenara un objeto comanda el cual tendra toda la informacion de  todo el tiempo en el cual la mesa ha sido ocupada.
    private Comanda comandaMaster;
    //Como dice el nombre actual es una comanda la cual es la que se deve preparar y servir.
    private Comanda actual;
    
    //GEnerare un constructor

    public Table(String numero) {
        this.numero = numero;
    }
    
    
}
