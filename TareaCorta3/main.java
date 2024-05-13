package PrimerExamen.TareaCorta3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Instancias
        Matriz matriz1 = new Matriz(3, 2);
        Funciones funciones = new Funciones();
        Scanner sc = new Scanner(System.in);

        // Multiplicando las matrices
        int filas = funciones.obtenerNumero(sc, "Hola! \nIngrese el número de filas: ");
        int columnas = funciones.obtenerNumero(sc, "Ingrese el número de columnas: ");

        // Imprimiendo las matrices y el resultado
        System.out.println("Matriz 1:");
        matriz1.imprimirMatriz();

        System.out.println("\nMatriz 2:");
        Matriz matriz2 = new Matriz(filas, columnas);
        matriz2.imprimirMatriz();

        System.out.println("\nResultado de la multiplicación:");
        int[][] resultado = matriz1.multiplicar(matriz2);

        if (resultado.length > 0) {
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[0].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}