package VEHICULOS;
import java.util.Scanner;

public class MenuGaraje extends Garaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();
        int opcion;

        do {
            System.out.println("=== Menú de Gestión del Garaje ===");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese el cilindraje del vehículo: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la matrícula (6 caracteres): ");
                    String placa = scanner.nextLine();
                    Vehiculo vehiculo = new Vehiculo(marca, precio, cilindraje);
                    if (vehiculo.matricular(placa)) {
                        if (garaje.alquilarEspacio(vehiculo)) {
                            System.out.println("Espacio alquilado exitosamente.");
                        } else {
                            System.out.println("No se pudo alquilar el espacio. Verifique las condiciones.");
                        }
                    } else {
                        System.out.println("Matrícula inválida. Debe tener 6 caracteres.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a retirar: ");
                    String matriculaRetiro = scanner.nextLine();
                    if (garaje.retirarVehiculo(matriculaRetiro)) {
                        System.out.println("Vehículo retirado exitosamente.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 3:
                    double ingresos = garaje.calcularIngresos();
                    System.out.println("Ingresos mensuales: " + ingresos);
                    break;

                case 4:
                    int cantidadAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto("", 0, 0, false, false));
                    int cantidadMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false));
                    int totalVehiculos = cantidadAutos + cantidadMotos;

                    System.out.println("Cantidad de autos: " + cantidadAutos);
                    System.out.println("Cantidad de motos: " + cantidadMotos);

                    if (totalVehiculos > 0) {
                    double proporcionAutos = (double) cantidadAutos / totalVehiculos * 100;
                    double proporcionMotos = (double) cantidadMotos / totalVehiculos * 100;

                    System.out.printf("Proporción de autos: %.2f%%\n", proporcionAutos);
                    System.out.printf("Proporción de motos: %.2f%%\n", proporcionMotos);
                 } else {
                   System.out.println("No hay vehículos en el garaje.");
                  }
                   break;
                case 5:
                    System.out.println("Listado de vehículos en el garaje:");
                    for (Vehiculo v : garaje.getEspacios()) {
                        if (v != null) {
                            System.out.println("Matrícula: " + v.getPlaca() + ", Cuota Mensual: " + v.getCuotaMesGaraje() + ", Tipo: " + v.getClass().getSimpleName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}