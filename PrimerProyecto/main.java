package PrimerExamen.PrimerProyecto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al enfrentamiento de matrices!");

            int filas = Funciones.obtenerNumero(sc, "Ingrese el número de filas (menor a 20 y mayor a 0): ");
            int columnas = Funciones.obtenerNumero(sc, "Ingrese el número de columnas (menor a 20 y mayor a 0): ");

            Funciones.enfrentamientoMatrices(Funciones.crearMatrizRandom(filas, columnas), Funciones.crearMatrizRandom(filas, columnas), filas * columnas);

            System.out.println("Desea jugar de nuevo? Digite si o no: ");
            boolean respuesta = Funciones.obtenerTexto(sc, "");

            if (respuesta == false) {
                break;
            }
        }
        System.out.println("Gracias!");
    }
}
