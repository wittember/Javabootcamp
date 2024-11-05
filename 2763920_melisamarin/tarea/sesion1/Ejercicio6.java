package com.tarea.sesion1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number > ");
        int numero = scanner.nextInt(), c = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                c++;
            }
        }

        String resultado = c > 0 ? "No es primo" : "El numero ingresado es primo";
        System.out.println(resultado);
    }
}
