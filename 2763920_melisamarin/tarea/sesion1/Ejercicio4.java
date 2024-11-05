package com.tarea.sesion1;

import java.util.Scanner;

public class Ejercicio4 {
    public static boolean esVocal (char letra) {
        char[] vocales= {'a', 'e', 'i', 'o', 'u'};
        boolean flag = false;
        int i = 0;
        do {
            if (i < 5) {
                if (letra == vocales[i])
                    flag = true;
                i++;
            }else {
                break;
            }
        }while (!flag);
        return flag;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();

        System.out.println("Texto a mayuscula > " + texto.toUpperCase());

        char[] letras = texto.toCharArray();
        char vocal;

        for (char c : letras) {
            if (esVocal(c)) {
                System.out.print(c + " ");
            }
        }
    }
}
