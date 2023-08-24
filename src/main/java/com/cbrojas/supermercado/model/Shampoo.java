/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.supermercado.model;

/**
 *
 * @author Cristian rojas <cbrojas.com>
 */
public class Shampoo extends Producto{
    
    private int contenido;

    public Shampoo(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre : " +super.getNombre()+ " /// Contenido: " + this.contenido + "ml /// Precio: $" + super.getPrecio();
    }
    
    
    
    
}
