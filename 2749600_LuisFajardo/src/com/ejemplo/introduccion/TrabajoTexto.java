package com.ejemplo.introduccion;

import java.util.Scanner;

public class TrabajoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingresar texto en minusculas
        System.out.print("Ingrese una palabra u oración en minúsculas: ");
        String texto = scanner.nextLine();

        // Convierte texto a mayúsculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);

        // las vocales
        String vocalesEncontradas = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (esVocal(letra)) {
                vocalesEncontradas += letra; // Concatena vocal
            }
        }

        // Muestra las vocales encontradas
        System.out.println("Vocales encontradas en el texto: " + vocalesEncontradas);

        scanner.close();
    }

    // verifica si caracter es vocal
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra); // Convertir la letra a minúscula para facilitar la comparación
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
