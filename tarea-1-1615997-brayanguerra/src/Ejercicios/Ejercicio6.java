package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    //Elaborar un programa que permite resolver si un numero es primo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ") ;
        int numero = input.nextInt();
        int multiplo = 0;
        int iteracion= 1;
        while(iteracion <= numero){
            if(numero % iteracion == 0){
                multiplo++;
            }
            iteracion++;
        }
        if(multiplo ==2){
            System.out.println("El número " + numero + " se primo");
        }else {
            System.out.println("El número" + numero + " no es primo");
        }
    }
}
