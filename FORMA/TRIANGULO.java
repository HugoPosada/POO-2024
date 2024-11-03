package FORMA;
public class TRIANGULO extends FORMA implements IFormas {
    private double base;
    private double altura;

    public TRIANGULO(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
  

   
    
    
    
    

