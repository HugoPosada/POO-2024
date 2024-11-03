package Juan_Desguace;
public class Main {
    public static void main(String[] args) {
        Camion[] camiones = new Camion[3];
        camiones[0] = new Camion(20000, "Volvo", 30, 4);
        camiones[1] = new Camion(25000, "Scania", 25, 6);
        camiones[2] = new Camion(30000, "Mercedes", 35, 8);

        System.out.println("Precios de venta de los camiones:");
        for (Camion camion : camiones) {
            System.out.println("Camión " + camion.getMarca() + ": " + camion.precioVenta());
        }

        Furgoneta[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta(15000, "Renault", 12);
        furgonetas[1] = new Furgoneta(18000, "Peugeot", 8);

        System.out.println("\nPrecios de venta de las furgonetas:");
        for (Furgoneta furgoneta : furgonetas) {
            System.out.println("Furgoneta " + furgoneta.getMarca() + ": " + furgoneta.precioVenta());
        }

        Vehiculo[] vehiculos = new Vehiculo[5];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

        System.out.println("\nPrecios de venta de todos los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + ": " + vehiculo.precioVenta());
        }
    }
}
