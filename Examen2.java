package PrimerExamen;

import java.util.Scanner;

public class Examen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del array: ");
        int longitud = sc.nextInt();

        int[] array = generarArray(longitud);
        System.out.println("Array original:");
        mostrarArray(array);

        invertirArray(array);
        System.out.println("\nArray invertido:");
        mostrarArray(array);
    }

    public static int[] generarArray(int longitud) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            inicio++;
            fin--;
        }
    }
}