package com.ejemplo.introduccion;

import java.util.Scanner;

public class EstacionesRangos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita mes
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion;
        String rangoMeses;

        // Determina estación y rangos
        switch (mes) {
            case 12: case 1: case 2:
                estacion = "Verano";
                rangoMeses = "Diciembre - Febrero";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                rangoMeses = "Marzo - Mayo";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                rangoMeses = "Junio - Agosto";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                rangoMeses = "Septiembre - Noviembre";
                break;
            default:
                System.out.println("Mes inválido, eliga un mes en el rango de 1 a 12.");
                scanner.close();
                return;
        }

        // Muestra salida
        System.out.println("Estación: " + estacion);
        System.out.println("Rango de meses de la estación: " + rangoMeses);

        scanner.close();
    }
}
