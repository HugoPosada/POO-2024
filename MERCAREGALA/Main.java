package MERCAREGALA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de producto (carne/pescado): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Precio por kilo: ");
                    double precioKilo = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer

                    if (tipo.equalsIgnoreCase("carne")) {
                        System.out.print("Origen (vacuno/avícola): ");
                        String origen = scanner.nextLine();
                        System.out.print("Tipo (fresca/congelada): ");
                        String tipoCarne = scanner.nextLine();

                        if (tipoCarne.equalsIgnoreCase("fresca")) {
                            System.out.print("Días de caducidad: ");
                            int diasCaducidad = scanner.nextInt();
                            almacen.añadirProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));
                        } else if (tipoCarne.equalsIgnoreCase("congelada")) {
                            System.out.print("Empresa distribuidora: ");
                            String empresaDistribuidora = scanner.nextLine();
                            almacen.añadirProducto(new CarneCongelada(nombre, peso, precioKilo, origen, empresaDistribuidora));
                        }
                    } else if (tipo.equalsIgnoreCase("pescado")) {
                        System.out.print("Tipo de pescado: ");
                        String tipoPescado = scanner.nextLine();
                        almacen.añadirProducto(new Pescado(nombre, peso, precioKilo, tipoPescado));
                    }
                    break;

                case 2:
                    almacen.listarProductos();
                    break;

                case 3:
                    almacen.productosEnPeligro();
                    break;

                case 4:
                    double precioMedio = almacen.calcularPrecioMedio();
                    System.out.println("Precio medio: " + precioMedio);
                    break;

                case 5:
                    almacen.eliminarBandejas();
                    System.out.println("Bandejas eliminadas.");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}