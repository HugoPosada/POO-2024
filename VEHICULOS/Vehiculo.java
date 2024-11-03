package VEHICULOS;
public class Vehiculo {
  private String placa = null;
    private String marca;
    double precio;
    private int cilindraje;
    private double ImpuestoCirculacion;
    private double CuotaMesGaraje;
    private static final double CUOTA_BASE = 100;

    public Vehiculo(String placa, double precio, int cilindraje) {
        this.placa = null;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.CuotaMesGaraje = CUOTA_BASE;
        ImpuestoCirculacion();
        
        }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return ImpuestoCirculacion;
    }

    public void setImpuestoCirculacion(double ImpuestoCirculacion) {
        this.ImpuestoCirculacion = ImpuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return CuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (CuotaMesGaraje >= 0) 
        this.CuotaMesGaraje = cuotaMesGaraje;
    }

    private void ImpuestoCirculacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 public void calcularImpuestoCirculacion() {
        this.ImpuestoCirculacion = 0.02 * precio;
} 
public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        }
        return false;
    }
}
