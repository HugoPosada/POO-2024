package MERCAREGALA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.calcularPrecio());
        }
    }

    public void productosEnPeligro() {
        for (Producto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Carne en peligro: " + carneFresca.getNombre());
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double suma = 0;
        for (Producto producto : productos) {
            suma += producto.calcularPrecio();
        }
        return suma / productos.size();
    }

    public void eliminarBandejas() {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto instanceof CarneCongelada) {
                CarneCongelada carneCongelada = (CarneCongelada) producto;
                iterator.remove();
            }
        }
    }

    void añadirProducto(CarneFresca carneFresca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
