package Garaje;

import VEHICULOS.Auto;
import VEHICULOS.Camioneta;
import VEHICULOS.Moto;
import VEHICULOS.Vehiculo;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static GestionEmpresa gestion;
    private static Scanner scanner;

    public static void main(String[] args) {
        gestion = new GestionEmpresa();
        scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Gestión de Garajes");

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcionValida();
            procesarOpcion(opcion);
        } while (opcion != 7);

        System.out.println("Gracias por usar el Sistema de Gestión de Garajes. ¡Hasta luego!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n========== Menú Principal ==========");
        System.out.println("1. Crear garaje");
        System.out.println("2. Eliminar garaje");
        System.out.println("3. Ingresar vehículo");
        System.out.println("4. Retirar vehículo");
        System.out.println("5. Generar informe de ocupación");
        System.out.println("6. Generar informe de recaudo mensual");
        System.out.println("7. Salir");
        System.out.println("=====================================");
    }

    private static int obtenerOpcionValida() {
        int opcion = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 7) {
                    entradaValida = true;
                } else {
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
            }
        }
        return opcion;
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearGaraje();
                break;
            case 2:
                eliminarGaraje();
                break;
            case 3:
                ingresarVehiculo();
                break;
            case 4:
                retirarVehiculo();
                break;
            case 5:
                generarInformeOcupacion();
                break;
            case 6:
                generarInformeRecaudoMensual();
                break;
            case 7:
                System.out.println("Saliendo del sistema...");
                break;
        }
    }

    private static void crearGaraje() {
        scanner.nextLine();
        System.out.println("\n--- Crear Nuevo Garaje ---");
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Nombre del Administrador: ");
        String nombreAdministrador = scanner.nextLine();
        System.out.print("Número de Espacios: ");
        int numeroEspacios = scanner.nextInt();

        gestion.crearGaraje(departamento, ciudad, direccion, telefono, email, nombreAdministrador, numeroEspacios);
        System.out.println("Garaje creado exitosamente.");
    }

    private static void eliminarGaraje() {
        System.out.println("Funcionalidad de eliminar garaje no implementada.");
    }

    private static void ingresarVehiculo() {
        scanner.nextLine();
        System.out.println("\n--- Ingresar Vehículo ---");
        System.out.print("Placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cilindraje: ");
        int cilindraje = scanner.nextInt();

        System.out.println("Tipo de vehículo (1: Auto, 2: Moto, 3: Camioneta): ");
        int tipoVehiculo = scanner.nextInt();

        Vehiculo vehiculo = null;
        switch (tipoVehiculo) {
            case 1:
                vehiculo = new Auto(marca, precio, cilindraje, false, false);
                break;
            case 2:
                vehiculo = new Moto(marca, precio, cilindraje, false);
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Tipo de servicio (SUV, Pickup, Carga, Otro): ");
                String tipoServicio = scanner.nextLine();
                System.out.print("Número de pasajeros: ");
                int numeroPasajeros = scanner.nextInt();
                System.out.print("¿Tiene remolque? (true/false): ");
                boolean tieneRemolque = scanner.nextBoolean();
                vehiculo = new Camioneta(marca, precio, cilindraje, tipoServicio, numeroPasajeros, tieneRemolque);
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
                return;
        }

        try {
            Garaje garaje = gestion.getRedDeGarajes().getGarajes().get(0);
            gestion.ingresarVehiculo(garaje, vehiculo);
            System.out.println("Vehículo ingresado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al ingresar el vehículo: " + e.getMessage());
        }
    }

    private static void retirarVehiculo() {
        scanner.nextLine();
        System.out.println("\n--- Retirar Vehículo ---");
        System.out.print("Placa del vehículo a retirar: ");
        String placa = scanner.nextLine();

        Garaje garaje = gestion.getRedDeGarajes().getGarajes().get(0);
        gestion.retirarVehiculo(garaje, placa);
        System.out.println("Vehículo retirado exitosamente.");
    }

    private static void generarInformeOcupacion() {
        System.out.println("\n--- Informe de Ocupación ---");
        gestion.generarInformeOcupacion();
    }

    private static void generarInformeRecaudoMensual() {
        System.out.println("\n--- Informe de Recaudo Mensual ---");
        gestion.generarInformeRecaudoMensual();
    }
}
