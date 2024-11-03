package MERCAREGALA;
public class Carne extends ProductoBase {
    private String origen;

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }
}