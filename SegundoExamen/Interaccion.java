package PrimerExamen.SegundoExamen;

import java.util.Scanner;

public class Interaccion {
    Scanner sc = new Scanner(System.in);
    private Matriz matriz;

    // Constructor
    public Interaccion(Matriz matriz) {
        this.matriz = matriz;
    }

    public int pedirDato(int limite, Scanner sc) {
        if (limite == 10) {
            while (true) {
                System.out.println("Ingrese el numero correspondiente a la ciudad a la que desea viajar, observe el menu: ");
                System.out.println("1.CDMX\n2.MTY\n3.GUAD\n4.SJO\n5.BOG\n6.MED\n7.LIM\n8.QUI\n9.RIO\n10.ARG");
                String entStr = sc.nextLine();
                try {
                    int ent = Integer.parseInt(entStr);
                    if (ent > 0 && ent <= 10) {
                        System.out.println("Se ha ingresado un viaje para la ciudad de: " + matriz.obtenerCiudad(ent));
                        return ent;
                    } else {
                        System.out.println("Ingrese un valor válido entre 1 y 10!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un valor válido entre 1 y 10!");
                }
            }
        } else {
            while (true) {
                System.out.println("Ingrese el numero correspondiente al horario en el que desea viajar, observe el menu: ");
                System.out.println("1.Madrugada, a las 3:00am\n2.Mañana A, a las 6:00am\n3.Mañana B, a las 10:00am\n4.Tarde A, a las 2:00pm\n5.Tarde B, a las 4:00pm\n6.Noche, a las 10:00pm");
                String entStr = sc.nextLine();
                try {
                    int ent = Integer.parseInt(entStr);
                    if (ent > 0 && ent <= 6) {
                        System.out.println("Se ha ingresado: " + matriz.obtenerHorario(ent));
                        return ent;
                    } else {
                        System.out.println("Ingrese un valor válido entre 1 y 6!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un valor válido entre 1 y 6!");
                }
            }
        }
    }

    public int solicitarDato(Scanner sc) {
        while (true) {
            System.out.println("Ingrese la cantidad de asientos que desea comprar: ");
            String entrada = sc.nextLine();
            try {
                int entradaInt = Integer.parseInt(entrada);
                return entradaInt;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un valor válido");
            }
        }
    }

    public void start() {
        while (true) {
            System.out.println("=== Bienvenido al sistema de trenes de LATAM ===");
            System.out.println("Si quiere reservar un vuelo ingrese 'si', si no, ingrese 'fin':");
            String entrada = sc.nextLine().toLowerCase();
            if (entrada.equals("si")) {
                System.out.println("======================");
                int ciudad = pedirDato(10, sc);
                int fila = pedirDato(6, sc);
                int cantidad = solicitarDato(sc);
                matriz.modificarMatriz(ciudad, fila, cantidad);
                System.out.println("======================");
            } else if (entrada.equals("fin")) {
                System.out.println("======================");
                System.out.println("Gracias!");
                System.out.println("======================");
                break;
            } else {
                System.out.println("Ingrese un valor válido!");
            }
        }
    }
}
