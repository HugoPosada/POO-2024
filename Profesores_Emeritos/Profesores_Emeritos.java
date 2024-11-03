package Profesores_Emeritos;

public class Profesores_Emeritos extends Profesor {
    private int añosEmerito;

    public Profesores_Emeritos(int añosEmerito, String nombre, int edad, int añosConsolidados) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }
public double obtenerSalrioBase(){
    return 925 + (añosConsolidados * 12.25) + (23.40 * añosEmerito);
    
}

    public int getAñosEmerito() {
        return añosEmerito;
    }

    String obtenerSalarioBase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    }
    

