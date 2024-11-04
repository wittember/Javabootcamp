package com.tarea.sesion1;

public class Ejercicio2 {
    public static String getEstacionByMonth (int monthNumber) {
        String resultado;
        if (monthNumber > 12) {
            resultado = "Fuera de rango";
        } else if (monthNumber > 9) {
            resultado = "Primavera";
        } else if (monthNumber > 6) {
            resultado = "Invierno";
        } else if (monthNumber > 3) {
            resultado = "Otoño";
        } else if (monthNumber > 0) {
            resultado = "Verano";
        } else {
            resultado = "Fuera de rango";
        }
        return  resultado;
    }

    public static void main(String[] args) {
        System.out.println(getEstacionByMonth(13));
        System.out.println(getEstacionByMonth(2));
        System.out.println(getEstacionByMonth(5));
        System.out.println(getEstacionByMonth(8));
        System.out.println(getEstacionByMonth(11));
        System.out.println(getEstacionByMonth(0));
    }
}
