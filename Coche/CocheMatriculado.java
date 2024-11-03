package Coche;
public class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio, String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        calculaImpuestoMatriculacion();
    }

    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        if (2024 - getAnio() > 10) {
            impuestoMatriculacion += 100;
        }
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }
}
