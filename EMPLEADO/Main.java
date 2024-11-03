package EMPLEADO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     Empleado[] empleados = new Empleado[4];

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el teléfono del empleado " + (i + 1) + ": ");
            String telefono = scanner.nextLine();
            empleados[i] = new Empleado(nombre, telefono);
        }
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
        }
        System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
        scanner.close();
    }

}
   
    
    
    
    
    

