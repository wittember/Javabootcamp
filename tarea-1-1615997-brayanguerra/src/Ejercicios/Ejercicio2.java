package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    //2. Elaborar un programa en java que permita mostrar las estaciones del año:
//Verano: 22 diciembre al 19 de marzo;
//Otoño; 20 de Marzo al 19 de Junio
//Invierno: 20 de junio al 21 de Setiembre
//Primavera: del 22 de setiembre al 21 de diciembre

    //Declarando metodo
    public static String estacionDelAnio(String mes, int dia ) {
        if (mes.equalsIgnoreCase("Diciembre") == true && dia >= 22 && dia <= 30) {
            return "Verano";
        } else if (mes.equalsIgnoreCase("Enero") == true && dia >= 1 && dia <= 31) {
            return "verano";
        } else if (mes.equalsIgnoreCase("Febrero") == true && dia >= 1 && dia <= 28) {
            return "verano";
        } else if (mes.equalsIgnoreCase("Marzo") == true && dia >= 1 && dia <= 19) {
            return "verano";
        } else if (mes.equalsIgnoreCase("Marzo") == true && dia >= 20 && dia <= 31) {
            return "Otoño";
        } else if (mes.equalsIgnoreCase("Abril") == true && dia >= 1 && dia <= 30) {
            return "Otoño";
        } else if (mes.equalsIgnoreCase("Mayo") == true && dia >= 1 && dia <= 31) {
            return "Otoño";
        } else if (mes.equalsIgnoreCase("Junio") == true && dia >= 1 && dia <= 19) {
            return "Otoño";
        } else if (mes.equalsIgnoreCase("Junio") == true && dia >= 20 && dia <= 30) {
            return "Invierno";
        } else if (mes.equalsIgnoreCase("Julio") == true && dia >= 1 && dia <= 31) {
            return "Invierno";
        } else if (mes.equalsIgnoreCase("Agosto") == true && dia >= 1 && dia <= 31) {
            return "Invierno";
        } else if (mes.equalsIgnoreCase("Setiembre") == true && dia >= 1 && dia <= 21) {
            return "Invierno";
        } else if (mes.equalsIgnoreCase("Setiembre") == true && dia >= 20 && dia <= 30) {
            return "Primavera";
        } else if (mes.equalsIgnoreCase("Octubre") == true && dia >= 1 && dia <= 31) {
            return "Primavera";
        } else if (mes.equalsIgnoreCase("Noviembre") == true&& dia >= 1 && dia <= 30) {
            return "Primavera";
        } else if (mes.equalsIgnoreCase("Diciembre") == true && dia >= 1 && dia <= 21) {
            return "Primavera";
        } else {
            return "Estacion no válida";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese mes del año");
        String Unmes = input.next();
        System.out.println("Ingrese día del mes");
        int Undia = input.nextInt();
        String estacion = estacionDelAnio(Unmes, Undia);
        System.out.println("La estación del año es: " + estacion);
    }
}
