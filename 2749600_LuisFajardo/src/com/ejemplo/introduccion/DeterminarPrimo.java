package com.ejemplo.introduccion;

import java.util.Scanner;

public class DeterminarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Comprueba si es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        scanner.close();
    }

    // Verificar si es primo
    public static boolean esPrimo(int numero) {
        // Menores que 2 no son primos
        if (numero < 2) {
            return false;
        }

        // Comprobar divisores hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por i, no es primo
            }
        }

        return true; // Si no tiene divisores, es primo
    }
}
