package Garaje;

import java.util.ArrayList;
import java.util.List;

public class RedDeGarajes {
    private List<Garaje> garajes;

    public RedDeGarajes() {
        this.garajes = new ArrayList<>();
    }

    public void agregarGaraje(Garaje garaje) {
        garajes.add(garaje);
    }

    public void eliminarGaraje(Garaje garaje) {
        garajes.remove(garaje);
    }

    public void actualizarGaraje(Garaje garajeAntiguo, Garaje garajeNuevo) {
        int index = garajes.indexOf(garajeAntiguo);
        if (index != -1) {
            garajes.set(index, garajeNuevo);
        }
    }

    public boolean verificarVehiculoRegistrado(String placa) {
        return garajes.stream().anyMatch(g -> g.getVehiculos().stream().anyMatch(v -> v.getPlaca().equals(placa)));
    }

    public double calcularRecaudoTotalMensual() {
        return garajes.stream().mapToDouble(Garaje::calcularRecaudoMensual).sum();
    }

    public void generarInformeOcupacion() {
        for (Garaje garaje : garajes) {
            System.out.println("Garaje en " + garaje.getCiudad() + ": " + garaje.getVehiculos().size() + "/" + garaje.getNumeroEspacios());
        }
    }

    public void generarInformeOcupacionPorTipo(Class<?> tipo) {
        for (Garaje garaje : garajes) {
            int cantidad = garaje.contarVehiculosPorTipo(tipo);
            System.out.println("Garaje en " + garaje.getCiudad() + ": " + cantidad + " " + tipo.getSimpleName());
        }
    }

    Iterable<Garaje> getGarajes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
