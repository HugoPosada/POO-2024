package VEHICULOS;
import java.util.ArrayList;

public class Garaje {
    private ArrayList<Vehiculo> vehiculos;
    private static final int MAX_PLACAS = 10;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculos.size() < MAX_PLACAS && vehiculo.getPlaca() != null) {
            String RMA1902 = null;
            int motosCount = calcularOcupacionPorTipoVehiculo(new Moto(RMA1902, 0, 0, false));
            if (motosCount < 0.8 * MAX_PLACAS) {
                vehiculos.add(vehiculo);
                return true;
            }
        }
        return false;
    }

    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass() == v.getClass()) {
                count++;
            }
        }
        return count;
    }

    public double calcularIngresos() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getCuotaMesGaraje();
        }
        return total;
    }

    boolean retirarVehiculo(String matriculaRetiro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<Vehiculo> getEspacios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
