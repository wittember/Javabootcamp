package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        System.out.println("Ingrese su fecha de nacimiento (yyyy/mm/dd): ");
        String diaDeFecha = input.nextLine();

        LocalDate fechaActual= LocalDate.parse(diaDeFecha, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println("La fecha ingresada corresponde al dia: " +fechaActual.getDayOfWeek());;
    }

}
