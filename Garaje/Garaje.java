package Garaje;

import Exception.GarajeLlenoException;
import Exception.MaximoCamionesException;
import Exception.MaximoMotosException;
import VEHICULOS.Camioneta;
import VEHICULOS.Moto;
import VEHICULOS.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private String departamento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String nombreAdministrador;
    private int numeroEspacios;
    private List<Vehiculo> vehiculos;

    public Garaje(String departamento, String ciudad, String direccion, String telefono, String email, String nombreAdministrador, int numeroEspacios) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nombreAdministrador = nombreAdministrador;
        this.numeroEspacios = numeroEspacios;
        this.vehiculos = new ArrayList<>();
    }

    public void ingresarVehiculo(Vehiculo vehiculo) throws GarajeLlenoException, MaximoCamionesException, MaximoMotosException {
        if (vehiculos.size() >= numeroEspacios) {
            throw new GarajeLlenoException("El garaje está lleno");
        }
        
        if (vehiculo instanceof Camioneta) {
            int cantidadCamiones = contarVehiculosPorTipo(Camioneta.class);
            int limiteCamiones = (numeroEspacios < 100) ? 10 : 20;
            if (cantidadCamiones >= limiteCamiones) {
                throw new MaximoCamionesException("Se ha alcanzado el límite de camiones");
            }
        }
        
        if (vehiculo instanceof Moto) {
            int cantidadMotos = contarVehiculosPorTipo(Moto.class);
            if (cantidadMotos >= numeroEspacios * 0.2) {
                throw new MaximoMotosException("Se ha alcanzado el límite de motos");
            }
        }
        
        vehiculos.add(vehiculo);
    }

    public void retirarVehiculo(String placa) {
        vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public int contarVehiculosPorTipo(Class<?> tipo) {
        return (int) vehiculos.stream().filter(v -> tipo.isInstance(v)).count();
    }

    public double calcularRecaudoMensual() {
        return vehiculos.stream().mapToDouble(v -> v.getCuotaMesGaraje()).sum();
    }

    Object getVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCiudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
