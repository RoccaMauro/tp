package com.tp.tp.repository;

import java.util.ArrayList;
import com.tp.tp.model.Vehiculo;

public class VehiculoRepository {
    private ArrayList<Vehiculo> vehiculos;

    public VehiculoRepository() {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public Vehiculo buscarPorPatente(String patente) {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if (v.obtenerPatente().equals(patente)) {
                return v;
            }
        }
        return null;
    }

    public boolean eliminarPorPatente(String patente) {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if (v.obtenerPatente().equals(patente)) {
                vehiculos.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vehiculo> obtenerTodos() {
        return vehiculos;
    }
}
