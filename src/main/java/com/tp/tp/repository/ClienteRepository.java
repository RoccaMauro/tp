package com.tp.tp.repository;

import java.util.ArrayList;
import com.tp.tp.model.Cliente;

public class ClienteRepository {
    private ArrayList<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<Cliente>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarPorDni(String dni) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.obtenerDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarPorDni(String dni) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.obtenerDni().equals(dni)) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cliente> obtenerTodos() {
        return clientes;
    }
}