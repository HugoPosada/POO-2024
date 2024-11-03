package VEHICULOS;

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String placa, int cilindraje, int precio, boolean tieneRadio, boolean tieneNavegador) {
        super(placa, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        if (cilindraje > 2499) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.2);
        }
    }
     @Override
    public void calcularImpuestoCirculacion() {
        double incremento = 0;
        if (tieneRadio) incremento += 0.01;
        if (tieneNavegador) incremento += 0.02;
        double nuevoImpuesto = getImpuestoCirculacion() * (1 + incremento);
        setImpuestoCirculacion(nuevoImpuesto);
    }

    @Override
    public void setImpuestoCirculacion(double impuesto) {
    }
}
    
    
    
    
    

