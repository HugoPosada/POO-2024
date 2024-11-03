package IBEME_SW;
public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        setNombre(nombre);
        setDni(dni);
        setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.edad = 18;
        this.casado = false;
        this.salario = 0.0;
    }

    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "DNI: " + dni + "\n" +
               "Edad: " + edad + "\n" +
               "Casado: " + (casado ? "Sí" : "No") + "\n" +
               "Salario: " + salario;
    }

    public void subirSalario(int porcentaje) {
        if (porcentaje > 0) {
            salario += salario * porcentaje / 100;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

    

