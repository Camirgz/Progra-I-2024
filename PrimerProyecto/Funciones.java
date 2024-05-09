package PrimerExamen.PrimerProyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {


    public static int[][] crearMatrizRandom(int filas, int columnas) {
        int[][] matriz;

        matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static void enfrentamientoMatrices(int[][] matrizA, int[][] matrizB, int tamanio) {

        //Variables
        int array[] = new int[tamanio];
        int empates = 0;
        int puntosMatrizA = 0;
        int puntosMatrizB = 0;
        //Comparación y almacenamiento de scores en array
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                int indice = i * matrizA[i].length + j; //no perder el hilo del índice del array
                if (matrizA[i][j] == matrizB[i][j]) {
                    array[indice] = 0;
                } else if (matrizA[i][j] > matrizB[i][j]) {
                    array[indice] = 1;
                } else {
                    array[indice] = 2;
                }
            }
        }

        //Contador de victorias
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                empates += 1;
            }
            if (array[i] == 1) {
                puntosMatrizA += 1;
            }
            if (array[i] == 2) {
                puntosMatrizB += 1;
            }
        }

        //Imprimir cosas
        System.out.println();
        System.out.println("La matriz A es:");
        System.out.println("------------------------");
        imprimirMatriz(matrizA);
        System.out.println("------------------------");
        System.out.println();
        System.out.println("La matriz B es:");
        System.out.println("------------------------");
        imprimirMatriz(matrizB);
        System.out.println("------------------------");
        System.out.println();
        System.out.println("El array de puntos es:");
        imprimirArray(array);
        System.out.println();
        determinarGanador(puntosMatrizA, puntosMatrizB, empates);

    }

    public static void determinarGanador(int puntosMatrizA, int puntosMatrizB, int empates) {

        //Impresión de puntajes
        System.out.println("Puntos Matriz A: " + puntosMatrizA);
        System.out.println("Puntos Matriz B: " + puntosMatrizB);
        System.out.println("Puntos de Empate: " + empates);
        System.out.println();

        //Si queda empate queda empate
        if (puntosMatrizA == puntosMatrizB) {
            System.out.println("La partida termina en empate.");
            return;
        }

        //Definir ganador temporal (sin suma de empates)
        int ganador;
        if (puntosMatrizA > puntosMatrizB) {
            ganador = 1;
        } else {
            ganador = 2;
        }

        //Inicializar nuevas variables con puntajes anteriores
        int puntosAConEmpates = puntosMatrizA ;
        int puntosBConEmpates = puntosMatrizB ;

        //Definir a quién se le suman los empates
        if ((ganador == 1 )) {
            puntosBConEmpates += empates;
        } else if (ganador == 2) {
            puntosAConEmpates += empates;
        }

        //Impresión de puntajes
        System.out.println("Puntos Matriz A con empates: " + puntosAConEmpates);
        System.out.println("Puntos Matriz B con empates: " + puntosBConEmpates);
        System.out.println();

        //Determinar ganador final

        //1ra regla
        if(ganador == 1 && puntosBConEmpates>puntosAConEmpates){
            System.out.println("La partida queda en empate!");
        }
        if(ganador == 2 && puntosAConEmpates>puntosBConEmpates){
            System.out.println("La partida queda en empate!");
        }

        //2da regla
        if(ganador==1 && puntosBConEmpates == puntosAConEmpates){
            System.out.println("El ganador es la matriz A! ");
        }
        if(ganador==2 && puntosBConEmpates == puntosAConEmpates){
            System.out.println("El ganador es la matriz B! ");
        }

        //3ra regla
        if(ganador==1 && puntosBConEmpates < puntosAConEmpates){
            System.out.println("El ganador es la matriz A! ");
        }
        if(ganador==2 && puntosBConEmpates > puntosAConEmpates){
            System.out.println("El ganador es la matriz B! ");
        }

    }

    //Validador de entrada numérica
    public static int obtenerNumero(Scanner sc, String mensaje) {
        int numero = 0;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                if (numero >= 5 && numero <= 20) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a 5 y menor a 20. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.nextLine(); //limpar scanner;
            }
        }
        return numero;
    }

    //Validador de entrada de texto
    public static boolean obtenerTexto(Scanner sc, String mensaje) {
        String entrada = "";
        boolean primeraIteracion = true;
        while (true) {
            try {
                if (!primeraIteracion) {
                    System.out.println("Ingrese una respuesta válida.");
                } else {
                    primeraIteracion = false;
                }
                System.out.print(mensaje);
                entrada = sc.nextLine().toLowerCase();
                if (entrada.equals("si")) {
                    return true;
                } else if (entrada.equals("no")) {
                    return false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese una respuesta válida.");
            }
        }
    }

}

