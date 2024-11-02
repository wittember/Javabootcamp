package com.ejemplo.introduccion;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        // Operaciones
        System.out.println("Operaciones realizadas con los números " + numero1 + " y " + numero2 + ":");
        // Suma
        double suma = numero1 + numero2;
        System.out.println("Suma: " + suma);
        // Resta
        double resta = numero1 - numero2;
        System.out.println("Resta: " + resta);
        // Multiplicación
        double multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);
        // División
        if (numero2 != 0) {
            double division = numero1 / numero2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División: Error - No se puede dividir por cero");
        }
        // Potencia (numero1 elevado a numero2)
        double potencia = Math.pow(numero1, numero2);
        System.out.println("Potencia: " + potencia);

        scanner.close();
    }
}
