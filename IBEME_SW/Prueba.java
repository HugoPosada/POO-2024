package IBEME_SW;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el DNI del empleado:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese la edad del empleado (18-45):");
        int edad = scanner.nextInt();

        System.out.println("¿Está casado? (true/false):");
        boolean casado = scanner.nextBoolean();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, dni, edad, casado, salario);

        System.out.println("\nInformación del empleado:");
        System.out.println(empleado.toString());
        System.out.println("Clasificación: " + empleado.clasifica());
        System.out.println("Ingrese el porcentaje de aumento de salario:");
        int aumento = scanner.nextInt();
        empleado.subirSalario(aumento);
        System.out.println("\nInformación del empleado después del aumento:");
        System.out.println(empleado.toString());
        System.out.println("\nIngrese el número de líneas de código por hora del programador:");
        int lineasDeCodigoPorHora = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el lenguaje dominante del programador:");
        String lenguajeDominante = scanner.nextLine();
        Programador programador = new Programador(nombre, dni, edad, casado, salario, lineasDeCodigoPorHora, lenguajeDominante);
        System.out.println("\nInformación del programador:");
        System.out.println(programador.toString());
        double salarioProgramador = programador.calculaSalario();
        System.out.println("Salario calculado del programador: " + salarioProgramador);

        scanner.close();
    }
}
