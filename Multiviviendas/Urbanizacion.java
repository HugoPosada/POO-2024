package Multiviviendas;
import java.util.ArrayList;
import java.util.List;

public class Urbanizacion {
    private List<Vivienda> viviendas;

    public Urbanizacion() {
        this.viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            total += vivienda.getPrecio();
        }
        return total;
    }

    public double calcularPrecioChalets() {
        double totalChalets = 0;
        for (Vivienda vivienda : viviendas) {
            if (vivienda instanceof Chalet) {
                totalChalets += vivienda.getPrecio();
            }
        }
        return totalChalets;
    }
}
