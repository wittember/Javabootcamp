package Ejercicios;

import java.time.LocalDate;

public class caso7 {
    public static void main(String[] args) {
        int dia = 24;
        int mes = 8;
        int anio = 2001;

        LocalDate  fecha = LocalDate.of(anio, mes, dia);
        String DiaSemana = fecha.getDayOfWeek().toString();

        System.out.println("Fecha  " + fecha + " -> Dia de la semana " + DiaSemana);

    }
}
