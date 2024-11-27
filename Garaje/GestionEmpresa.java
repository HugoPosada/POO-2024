package Garaje;

import Exception.VehiculoYaRegistradoException;

public class GestionEmpresa {
    private RedDeGarajes redDeGarajes;

    public GestionEmpresa() {
        this.redDeGarajes = new RedDeGarajes();
    }

    public void crearGaraje(String departamento, String ciudad, String direccion, String telefono, String email, String nombreAdministrador, int numeroEspacios) {
        Garaje garaje = new Garaje(departamento, ciudad, direccion, telefono, email, nombreAdministrador, numeroEspacios);
        redDeGarajes.agregarGaraje(garaje);
    }

    public void eliminarGaraje(Garaje garaje) {
        redDeGarajes.eliminarGaraje(garaje);
    }

    public void actualizarGaraje(Garaje garajeAntiguo, Garaje garajeNuevo) {
        redDeGarajes.actualizarGaraje(garajeAntiguo, garajeNuevo);
    }

    public void ingresarVehiculo(Garaje garaje, Vehiculo vehiculo) throws GarajeLlenoException, MaximoCamionesException, MaximoMotosException, VehiculoYaRegistradoException {
        if (redDeGarajes.verificarVehiculoRegistrado(vehiculo.getPlaca())) {
            throw new VehiculoYaRegistradoException("El vehículo ya está registrado en otro garaje");
        }
        garaje.ingresarVehiculo(vehiculo);
    }

    public void retirarVehiculo(Garaje garaje, String placa) {
        garaje.retirarVehiculo(placa);
    }

    public void generarInformeOcupacion() {
        redDeGarajes.generarInformeOcupacion();
    }

    public void generarInformeOcupacionPorTipo(Class<?> tipo) {
        redDeGarajes.generarInformeOcupacionPorTipo(tipo);
    }

    public void generarInformeRecaudoMensual() {
        System.out.println("Recaudo total mensual: $" + redDeGarajes.calcularRecaudoTotalMensual());
        for (Garaje garaje : redDeGarajes.getGarajes()) {
            System.out.println("Garaje en " + garaje.getCiudad() + ": $" + garaje.calcularRecaudoMensual());
        }
    }

    void generarInformeOcupacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getRedDeGarajes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
