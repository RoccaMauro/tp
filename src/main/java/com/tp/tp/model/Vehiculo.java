package com.tp.tp.model;

public class Vehiculo {
    private String patente;
    private String marca;
    private int modelo;
    private double precio;

    public Vehiculo(String patente, String marca, int modelo, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String obtenerPatente() {
        return patente;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerModelo() {
        return modelo;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void modificarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String obtenerAño() {
        return String.valueOf(modelo);
    }
}

