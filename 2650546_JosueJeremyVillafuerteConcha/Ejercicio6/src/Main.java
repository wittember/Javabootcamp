import java.util.Scanner;

public class Main {

    static boolean esPrimo = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        validador(num);
    }

    public static void validador(int num){
        if(num <= 1){
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        resultado(num);
    }

    public static void resultado(int num){
        if(esPrimo){
            System.out.println(num + " es un número primo");
        }else {
            System.out.println(num + " no es un número primo");
        }
    }
}