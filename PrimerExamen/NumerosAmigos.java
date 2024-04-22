package PrimerExamen.PrimerExamen;

import java.util.Scanner;

public class NumerosAmigos {

    public static boolean numerosAmigos(int a, int b){

        if(sumaDivisores(a)==b && sumaDivisores(b)==a){
            return true;
        }
        else{
            return false;
        }

    }

    public static int sumaDivisores(int a){
        int suma = 0;
        for (int i = 1; i < a; i++){
            if(a%i==0){
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! Ingrese su primer número: ");
        int numA = sc.nextInt();
        System.out.println("Ingrese su segundo número: ");
        int numB = sc.nextInt();
        if(numerosAmigos(numA, numB) == true){
            System.out.println(numA + " y " + numB + " son amigos! ");
        }
        else{
            System.out.println(numA + " y " + numB + " no son amigos :c ");
        }
    }

}
