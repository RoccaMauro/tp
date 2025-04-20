package com.tp.tp.repository;

import java.util.ArrayList;
import java.util.List;
import com.tp.tp.model.Venta;

public class VentaRepository {

    private List<Venta> ventas = new ArrayList<Venta>();

    public void registrarVenta(Venta v) {
        ventas.add(v);
    }

    public List<Venta> obtenerTodas() {
        return ventas;
    }
}
