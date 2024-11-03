package MERCAREGALA;
public abstract class ProductoBase implements Producto {
    protected String nombre;
    protected double peso;
    protected double precioKilo;

    public ProductoBase(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioKilo() {
        return precioKilo;
    }
}
