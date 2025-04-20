package com.tp.tp.model;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;

    // Constructor vacío necesario para poder usar: new Cliente()
    public Cliente() {
    }

    // Constructor con parámetros opcional
    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Métodos "setter"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Métodos "getter"
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Object obtenerDni() {
        return obtenerDni();
    }

}

