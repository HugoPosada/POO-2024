package ALFOMBRAS;
import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String nombre;
    private List<Alfombra> alfombras;

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarAlfombra(Alfombra alf) {
        return alfombras.add(alf);
    }

    public double calcularPrecioTotal() {
        double totalPrecio = 0;
        for (Alfombra alfombra : alfombras) {
            totalPrecio += alfombra.calcularPrecio();
        }
        return totalPrecio;
    }

    public double calcularPrecioAlfombrasCuadradas() {
        double totalPrecioCuadradas = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra instanceof AlfombraCuadrada) {
                totalPrecioCuadradas += alfombra.calcularPrecio();
            }
        }
        return totalPrecioCuadradas;
    }
}

    

