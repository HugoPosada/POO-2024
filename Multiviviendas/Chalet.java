package Multiviviendas;
public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return getSuperficieEnMetros() * 1300; // Precio específico para chalets
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = getPrecio() * 0.05; // 5% del precio
        if (conPiscina) {
            impuesto += 200; // 200 euros más si tiene piscina
        }
        return impuesto;
    }
}
