package Profesores_Emeritos;

public class Profesor {
    protected String nombre;
    protected int edad, añosConsolidados;

    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }   
}
