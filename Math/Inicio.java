package Math;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Math2 math2 = new Math2();
            
            System.out.print("Ingrese el tamaño del array de enteros: ");
            int n = scanner.nextInt();
            int[] enteros = new int[n];
            
            System.out.println("Ingrese los elementos del array de enteros:");
            for (int i = 0; i < n; i++) {
                enteros[i] = scanner.nextInt();
            }
            
            System.out.println("Mínimo de enteros: " + math2.min(enteros));
            System.out.println("Máximo de enteros: " + math2.max(enteros));
            
            
            System.out.print("Ingrese el tamaño del array de dobles: ");
            int m = scanner.nextInt();
            double[] doubles = new double[m];
            
            System.out.println("Ingrese los elementos del array de dobles:");
            for (int i = 0; i < m; i++) {
                doubles[i] = scanner.nextDouble();
            }
            
            System.out.println("Mínimo de dobles: " + math2.min(doubles));
            System.out.println("Máximo de dobles: " + math2.max(doubles));
        }
    }
}
    

