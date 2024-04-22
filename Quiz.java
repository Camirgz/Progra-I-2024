package PrimerExamen;

import java.util.Scanner;

public class Quiz {

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            System.out.println(a + " - " + b + " = " + (a - b));
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números enteros A y B al usuario
        System.out.print("Ingrese el primer número entero positivo (A): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo (B): ");
        int b = scanner.nextInt();

        // Calcular el MCD y mostrar los pasos y el resultado
        System.out.println("Pasos para calcular el MCD utilizando el algoritmo de Euclides:");
        int mcd = calcularMCD(a, b);
        System.out.println("\nEl máximo común divisor (MCD) de " + a + " y " + b + " es: " + mcd);

        scanner.close();
    }
}
