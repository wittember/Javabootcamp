package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    //laborar un programa en java que permita calcular el interés del 25.5 %
    // de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prestamo=0;
        System.out.println("Ingrese el monto del prestamo:");
        prestamo = input.nextInt();
        double interes = prestamo * 0.25;
        double igv = interes * 0.18;

        System.out.println("El prestamo es de " + prestamo);
        System.out.println("El interés es de " + interes);
        System.out.println("El IGV es de " + igv);
    }
}
