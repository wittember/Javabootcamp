package com.tarea.sesion1;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia > ");
        int day = scanner.nextInt();
        System.out.print("Mes > ");
        int month = scanner.nextInt();
        System.out.print("Año > ");
        int year = scanner.nextInt();

        LocalDate fecha = LocalDate.of(year, month, day);
        String diaText = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(diaText);
    }
}
