import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o cadena de texto: ");
        String texto = scanner.nextLine();
        mayusculas(texto);
        vocales(texto);

    }
    public static void mayusculas(String texto){
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayusculas:\n" + textoMayusculas);
    }

    public static void vocales(String texto){
        System.out.println("Vocales en el texto: ");
        for(char letra : texto.toCharArray()){
            if ("aeiou".indexOf(letra) != -1){
                System.out.print(letra + " ");
            }
        }
    }
}