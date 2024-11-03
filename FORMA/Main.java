package FORMA;
public class Main {
    public static void main(String[] args) {
        // Crear formas
        CUADRADO cuadrado1 = new CUADRADO("Cuadrado 1", 0, 0, "Rojo", 4);
        CUADRADO cuadrado2 = new CUADRADO("Cuadrado 2", 1, 1, "Azul", 5);
        TRIANGULO triangulo1 = new TRIANGULO("Triángulo 1", 2, 2, "Verde", 6, 8);
        TRIANGULO triangulo2 = new TRIANGULO("Triángulo 2", 3, 3, "Amarillo", 4, 3);

        FORMA[] formas = {cuadrado1, cuadrado2, triangulo1, triangulo2};

        double sumaArea = 0;
        double sumaAreaCuadrados = 0;
        int contadorCuadrados = 0;

        for (FORMA forma : formas) {
            sumaArea += forma.calcularArea();
            if (forma instanceof CUADRADO) {
                sumaAreaCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las áreas de todas las formas: " + sumaArea);
        if (contadorCuadrados > 0) {
            double mediaAreaCuadrados = sumaAreaCuadrados / contadorCuadrados;
            System.out.println("Media de las áreas de los cuadrados: " + mediaAreaCuadrados);
        }
        
        double sumaPerimetros = 0;
        for (FORMA forma : formas) {
            if (forma instanceof IFormas iFormas) {
                sumaPerimetros += iFormas.calcularPerimetro();
            }
        }
        System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
    }
}
