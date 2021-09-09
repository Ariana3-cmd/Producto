/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba01.demo.entity;

/**
 *
 * @author yorman
 */
public class Producto {
    
    private int idp;
    private String nombre;
    private int costo; 
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, int costo, int stock) {
        this.nombre = nombre;
        this.costo = costo;
        this.stock = stock;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
