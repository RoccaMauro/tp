package com.tp.tp.model;

public class FormaPago {
    private String tipo;
    private String detalle;

    public FormaPago(String tipo, String detalle) {
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

