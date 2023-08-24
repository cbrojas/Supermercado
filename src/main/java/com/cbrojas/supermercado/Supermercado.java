/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cbrojas.supermercado;

import com.cbrojas.supermercado.model.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cristian rojas <cbrojas.com> 
 */
public class Supermercado {

    public static void main(String[] args) {
       
        List<Producto> productos = agregarProductos();
        
        productos.forEach(producto -> System.out.println(producto));
        
        System.out.println("=============================");
        System.out.println("Producto más caro: "+ Collections.max(productos));
        System.out.println("Producto más barato: "+ Collections.min(productos));
        
    }

    private static List<Producto> agregarProductos() {
        
        List<Producto> productos = new ArrayList<>();
        
        productos.add(new Bebida(1.5,"Coca-Cola Zero",20));
        productos.add(new Bebida(1.5,"Coca-Cola",18));
        productos.add(new Shampoo(500, "Shampoo Sedal", 19));
        productos.add(new Fruta("kilo", "Frutilla", 64));
        
        return productos;
    }
}
