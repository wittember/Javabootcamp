import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.println(mayusculas(texto));
        vocales(texto);

    }
    public static String mayusculas(String texto){
        String textoMayusculas = texto.toUpperCase();
        return "Texto en mayusculas:\n" + textoMayusculas;
    }

    public static void vocales(String texto){
        System.out.println("Vocales en el texto: ");
        for(char letra : texto.toCharArray()){
            if ("aeiou".indexOf(letra) != -1 || "AEIOU".indexOf(letra) != -1 ){
                System.out.print(letra + " ");
            }
        }
    }
}