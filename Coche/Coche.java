package Coche;
public class Coche {
    private final String marca;
    private String color;
    private int km;
    private double precio;
    private final double factorContaminacion;
    private final int anio;
    private String matricula;
    private String dniTitular;

    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km = 0;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void incrementarKm(int km) {
        this.km += km;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        if (this.matricula == null) {
            this.matricula = matricula;
        }
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public double getPrecio() {
        return precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }
}
