import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dias que tiene el mes a evaluar: ");
        int mes = scanner.nextInt();
        diasImpares(mes);
    }

    public static void diasImpares(int mes){
        System.out.print("Dias impares: ");
        for (int dia = 0; dia <= mes; dia++) {
            if (dia % 2 != 0){
                System.out.print(dia + " ");
            }
        }
    }
}