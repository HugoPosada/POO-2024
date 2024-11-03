package Multiviviendas;
public class Principal {
    public static void main(String[] args) {
        Urbanizacion urbanizacion = new Urbanizacion();
        
        Piso piso1 = new Piso("Calle Falsa 123", 80, 2, 5);
        Adosado adosado1 = new Adosado("Calle Verdadera 456", 120, 2);
        Chalet chalet1 = new Chalet("Calle del Sol 789", 150, 1, true);
        Chalet chalet2 = new Chalet("Calle de la Luna 101", 200, 2, false);

        urbanizacion.agregarVivienda(piso1);
        urbanizacion.agregarVivienda(adosado1);
        urbanizacion.agregarVivienda(chalet1);
        urbanizacion.agregarVivienda(chalet2);

        System.out.println("Precio total de todas las viviendas: " + urbanizacion.calcularPrecioTotal());
        System.out.println("Precio total de todos los chalets: " + urbanizacion.calcularPrecioChalets());
    }
}