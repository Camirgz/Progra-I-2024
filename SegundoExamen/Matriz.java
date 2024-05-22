package PrimerExamen.SegundoExamen;

public class Matriz {
    private int[][] matriz = new int[10][6];

    // LLenar matriz
    public Matriz() {
        llenarMatriz();
    }

    public int getEspacios(int ciudad, int hora) {
        return matriz[ciudad][hora];
    }

    public void modificarMatriz(int ciudad, int hora, int cantidad) {
        if (getEspacios(ciudad, hora) >= cantidad) {
            matriz[ciudad][hora] -= cantidad;
            System.out.println("=== Su reserva fue exitosa ===");
        } else {
            System.out.println("No es posible realizar su reserva quedan: " + getEspacios(ciudad, hora));
        }
    }

    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (66 - 50 + 1) + 50);
            }
        }
    }

    public String obtenerCiudad(int numero) {
        String resultado;
        switch (numero) {
            case 1:
                resultado = "Ciudad de México";
                break;
            case 2:
                resultado = "Monterrey";
                break;
            case 3:
                resultado = "Guadalajara";
                break;
            case 4:
                resultado = "San José";
                break;
            case 5:
                resultado = "Bogotá";
                break;
            case 6:
                resultado = "Medellin";
                break;
            case 7:
                resultado = "Lima";
                break;
            case 8:
                resultado = "Quito";
                break;
            case 9:
                resultado = "Rio de Janeiro";
                break;
            case 10:
                resultado = "Argentina";
                break;
            default:
                resultado = "";
                break;
        }
        return resultado;
    }

    public String obtenerHorario(int numero) {
        String resultado;
        switch (numero) {
            case 1:
                resultado = "Madrugada, 3:00am";
                break;
            case 2:
                resultado = "Mañana A, 6:00am";
                break;
            case 3:
                resultado = "Mañana B, 10:00am";
                break;
            case 4:
                resultado = "Tarde A, 2:00pm";
                break;
            case 5:
                resultado = "Tarde B, 4:00pm";
                break;
            case 6:
                resultado = "Noche, 10:00pm";
                break;
            default:
                resultado = "";
                break;
        }
        return resultado;
    }
}