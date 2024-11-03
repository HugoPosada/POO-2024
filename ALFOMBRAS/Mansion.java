package ALFOMBRAS;
import java.util.ArrayList;
import java.util.List;

public class Mansion {
    private List<Habitacion> arrayHabitaciones;

    public Mansion() {
        this.arrayHabitaciones = new ArrayList<>();
    }

    public boolean agregarHabitacion(Habitacion hab) {
        return arrayHabitaciones.add(hab);
    }

    public double calcularPrecioTotalAlfombras() {
        double totalPrecio = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            totalPrecio += habitacion.calcularPrecioTotal();
        }
        return totalPrecio;
    }

    public double calcularPrecioAlfombrasCuadradas() {
        double totalPrecioCuadradas = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            totalPrecioCuadradas += habitacion.calcularPrecioAlfombrasCuadradas();
        }
        return totalPrecioCuadradas;
    }
}

