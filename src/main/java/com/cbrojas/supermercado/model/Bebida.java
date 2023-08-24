/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.supermercado.model;

/**
 *
 * @author Cristian rojas <cbrojas.com>
 */
public class Bebida extends Producto{

    private double volumen;
    
    public Bebida(double volumen, String nombre, int precio) {
        super(nombre, precio);
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Nombre : " +super.getNombre()+ " /// Litros: " + this.volumen + " /// Precio: $" + super.getPrecio();
    }
    
    
    
}
