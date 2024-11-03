package Coche;
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 1.2, 2015);
        coche1.setDniTitular("12345678A");

        CocheMatriculado cocheMatriculado1 = new CocheMatriculado("Ford", "Azul", 15000, 1.5, 2010, "ABC1234", "87654321B");
        
        System.out.println("Impuesto de matriculación: " + cocheMatriculado1.getImpuestoMatriculacion());
        
        coche1.comprarCoche(cocheMatriculado1);
        System.out.println("DNI titular del coche1 después de la compra: " + coche1.getDniTitular());
    }
}
