package com.tp.tp;

import com.tp.tp.model.Cliente;
import com.tp.tp.model.Vehiculo;
import com.tp.tp.repository.ClienteRepository;
import com.tp.tp.repository.VehiculoRepository;
import com.tp.tp.model.Venta;
import com.tp.tp.repository.VentaRepository;

public class Main {
    public static void main(String[] args) {
        
        // Crear repositorios
        ClienteRepository repositorioClientes = new ClienteRepository();
        VehiculoRepository repositorioVehiculos = new VehiculoRepository();
        VentaRepository repositorioVentas = new VentaRepository();

        // Crear cliente
        Cliente cliente1 = new Cliente("Juan", "Perez", "12345678");
        repositorioClientes.agregarCliente(cliente1);

        // Crear vehículo
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 15000.0);
        repositorioVehiculos.agregarVehiculo(vehiculo1);

        // Crear venta
        Venta venta1 = new Venta(cliente1, vehiculo1, "2025-04-08", 15000.0);
        repositorioVentas.registrarVenta(venta1);

        // Mostrar la venta
        System.out.println("Venta registrada:");
        System.out.println("Cliente: " + venta1.obtenerCliente().getNombre() + " " + venta1.obtenerCliente().getApellido());
        System.out.println("Vehículo: " + venta1.obtenerVehiculo().obtenerMarca() + " " + venta1.obtenerVehiculo().obtenerModelo());
        System.out.println("Fecha: " + venta1.obtenerFecha());
        System.out.println("Monto total: $" + venta1.obtenerMontoTotal());
    }
}

