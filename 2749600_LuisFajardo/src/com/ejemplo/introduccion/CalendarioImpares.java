package com.ejemplo.introduccion;
import java.util.Scanner;

public class CalendarioImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar mes y año
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Determinar cantidad de días del mes ingresado
        int diasEnMes;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasEnMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            case 2:
                // Verificar si es un año bisiesto
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                System.out.println("Mes inválido.");
                return;
        }

        System.out.println("El mes " + mes + " del año " + anio + " tiene " + diasEnMes + " días.");
        System.out.println("Días impares de este mes:");

        // Mostrar los días impares del mes
        for (int dia = 1; dia <= diasEnMes; dia++) {
            if (dia % 2 != 0) {
                System.out.println("Día: " + dia);
            }
        }

        scanner.close();
    }
}



