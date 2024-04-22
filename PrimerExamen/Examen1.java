package PrimerExamen.PrimerExamen;

import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero con una cantidad de cifras impar: ");
        int entrada = sc.nextInt();

        piramide(entrada);
    }

    public static void piramide(int x) {

        String numStr = String.valueOf(x);

        for (int i = 1; i <= numStr.length(); i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(numStr.charAt(j));
            }
            System.out.println();
        }

        for (int i = numStr.length() - 2; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(numStr.charAt(j));
            }
            System.out.println();

}
}}
