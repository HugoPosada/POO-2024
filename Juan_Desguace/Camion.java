package Juan_Desguace;
public class Camion extends Vehiculo {
    private double tamanoRemolque;
    private int numeroEjes;

    public Camion(double precioCompra, String marca, double tamanoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6 * numeroEjes; 
    }

    public double getTamanoRemolque() {
        return tamanoRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
}