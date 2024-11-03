package Juan_Desguace;
public abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public String getMarca() {
        return marca;
    }

    public abstract double precioVenta();
}