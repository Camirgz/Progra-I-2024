package PrimerExamen;

import java.util.Scanner;

public class NumeroPerfecto {

    public static boolean numeroPerfecto(int a){
        if(sumatoria(a)==a){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sumatoria(int a){
        int suma = 0;
        for(int i = 1; i < a; i++){
            if(a%i==0){
                suma += i;
            }
        }
        return suma;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! Ingrese su número: ");
        int numA = sc.nextInt();
        if(numeroPerfecto(numA)==true){
            System.out.println("El numero es perfecto!");
        }
        else{
            System.out.println("El numero no es perfecto :c");
        }
    }
}
