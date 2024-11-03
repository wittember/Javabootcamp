package com.tarea.sesion1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("SUMA | RESTA | MULTI | DIVIS | POTENCIA > ");
        String operation = scanner.nextLine();

        System.out.print("Num 1 > ");
        int num1 = scanner.nextInt();

        System.out.print("Num 2 > ");
        int num2 = scanner.nextInt();

        if (operation.toUpperCase().equals("SUMA"))
            System.out.println(num1 + num2);
        else if (operation.toUpperCase().equals("RESTA"))
            System.out.println(num1 - num2);
        else if (operation.toUpperCase().equals("MULTI"))
            System.out.println(num1 * num2);
        else if (operation.toUpperCase().equals("DIVIS"))
            System.out.println(num1 / num2);
        else if (operation.toUpperCase().equals("POTENCIA"))
            System.out.println(Math.pow(num1, num2));
        else
            System.err.println("Operation is not valid");
    }
}
