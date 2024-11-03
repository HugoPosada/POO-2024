package VEHICULOS;
public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(String placa, int cilindraje, int precio, boolean tieneSidecar) {
        super(placa, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
        if (tieneSidecar) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.5);
        }
    }

    @Override
    public void calcularImpuestoCirculacion() {
        double incremento = tieneSidecar ? 0.10 : 0.0;
        super.calcularImpuestoCirculacion();
        double nuevoImpuesto = getImpuestoCirculacion() * (1 + incremento);
        setImpuestoCirculacion(nuevoImpuesto);
    }

    @Override
    public void setImpuestoCirculacion(double impuesto) {
    }
}
