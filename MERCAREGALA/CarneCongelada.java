package MERCAREGALA;
public class CarneCongelada extends Carne {
    private String empresaDistribuidora;

    public CarneCongelada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora) {
        super(nombre, peso, precioKilo, origen);
        this.empresaDistribuidora = empresaDistribuidora;
    }

    public String getEmpresaDistribuidora() {
        return empresaDistribuidora;
    }
}