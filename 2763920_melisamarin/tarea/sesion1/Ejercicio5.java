package com.tarea.sesion1;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        interes del 25.5
        prestamo total 35500
        igv 0.18 del interes
        */
        double prestamo = 35500.00;
        double interes = prestamo * 0.255;
        double igv = interes * 0.18;

        System.out.println(String.format("%.2f", prestamo));
        System.out.println(String.format("%.2f", interes));
        System.out.println(String.format("%.2f", igv));
    }
}
