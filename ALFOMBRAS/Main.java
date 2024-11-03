package ALFOMBRAS;

public class Main {
    public static void main(String[] args) {
        
        AlfombraRedonda alfombra1 = new AlfombraRedonda("Roja", 50, 3);
        AlfombraCuadrada alfombra2 = new AlfombraCuadrada("Azul", 30, 4);
        AlfombraCuadrada alfombra3 = new AlfombraCuadrada("Verde", 40, 5);

        Habitacion habitacion = new Habitacion("Sala de Estar");
        habitacion.agregarAlfombra(alfombra1);
        habitacion.agregarAlfombra(alfombra2);
        habitacion.agregarAlfombra(alfombra3);

        System.out.println("Precio total de todas las alfombras en " + habitacion.getNombre() + ": " + habitacion.calcularPrecioTotal());
        System.out.println("Precio total de alfombras cuadradas en " + habitacion.getNombre() + ": " + habitacion.calcularPrecioAlfombrasCuadradas());

        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion);

        System.out.println("Precio total de todas las alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de alfombras cuadradas en la mansión: " + mansion.calcularPrecioAlfombrasCuadradas());
    }
}

