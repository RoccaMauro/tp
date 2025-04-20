package com.tp.tp.model;

public class Venta {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fecha;
    private double montoTotal;
    private FormaPago FormaPago;

    public Venta(Cliente c, Vehiculo v, String f, double monto) {
        cliente = c;
        vehiculo = v;
        fecha = f;
        montoTotal = monto;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Vehiculo obtenerVehiculo() {
        return vehiculo;
    }

    public String obtenerFecha() {
        return fecha;
    }

    public double obtenerMontoTotal() {
        return montoTotal;
    }

    public FormaPago getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        FormaPago = formaPago;
    }
}

