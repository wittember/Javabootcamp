package com.ejemplo.introduccion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ImprimeFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // fecha en formato dd/MM/yyyy
        System.out.print("Ingrese una fecha en formato dd/MM/yyyy: ");
        String fechaIngresada = scanner.nextLine();

        // formato de la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Pasa fecha ingresada a un objeto LocalDate
            LocalDate fecha = LocalDate.parse(fechaIngresada, formato);

            // Obtiene el día de la semana
            String diaDeLaSemana = fecha.getDayOfWeek().toString();

            // Muestra el día de la semana
            System.out.println("El día de la semana es: " + traducirDia(diaDeLaSemana));
        } catch (DateTimeParseException e) {
            System.out.println("La fecha ingresada no es válida. Debe emplear el formato dd/MM/yyyy.");
        }

        scanner.close();
    }

    // Traduce el día de la semana al español
    public static String traducirDia(String dia) {
        switch (dia) {
            case "MONDAY":
                return "Lunes";
            case "TUESDAY":
                return "Martes";
            case "WEDNESDAY":
                return "Miércoles";
            case "THURSDAY":
                return "Jueves";
            case "FRIDAY":
                return "Viernes";
            case "SATURDAY":
                return "Sábado";
            case "SUNDAY":
                return "Domingo";
            default:
                return "Día no reconocido";
        }
    }
}
