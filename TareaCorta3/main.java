package PrimerExamen.TareaCorta3;

public class main {
    public static void main(String[] args) {
        // Instanciando dos matrices
        Matriz matriz1 = new Matriz(3, 2);
        Matriz matriz2 = new Matriz(2, 3);

        // Multiplicando las matrices
        int[][] resultado = matriz1.multiplicar(matriz2);

        // Imprimiendo las matrices y el resultado
        System.out.println("Matriz 1:");
        matriz1.imprimirMatriz();
        System.out.println("\nMatriz 2:");
        matriz2.imprimirMatriz();
        System.out.println("\nResultado de la multiplicación:");
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