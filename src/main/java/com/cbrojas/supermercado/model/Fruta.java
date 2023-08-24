/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbrojas.supermercado.model;

/**
 *
 * @author Cristian rojas <cbrojas.com>
 */
public class Fruta extends Producto{
    
    private String unidadDeVenta;

    public Fruta(String unidadDeVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }
    

    @Override
    public String toString() {
        return "Nombre: "+super.getNombre() + " /// Precio: $"+super.getPrecio() + " /// Unidad de venta: "+ this.unidadDeVenta;
    }
    
    
}
