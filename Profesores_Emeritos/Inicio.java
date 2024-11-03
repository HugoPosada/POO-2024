package Profesores_Emeritos;

public class Inicio {
    public static void main(String[] args) {
        Profesores_Emeritos profesorEmerito = new Profesores_Emeritos(10,"Juan Pérez", 65, 30);

       
        System.out.println("Nombre: " + profesorEmerito.getNombre());
        System.out.println("Edad: " + profesorEmerito.getEdad());
        System.out.println("Años Consolidados: " + profesorEmerito.getAñosConsolidados());
        System.out.println("Años como Emérito: " + profesorEmerito.getAñosEmerito());
        System.out.println("Salario Base: " + profesorEmerito.obtenerSalarioBase());
    }
}
    

