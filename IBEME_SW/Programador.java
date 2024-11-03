package IBEME_SW;
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() {
        super();
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Líneas de código por hora: " + lineasDeCodigoPorHora + "\n" +
               "Lenguaje dominante: " + lenguajeDominante;
    }
}