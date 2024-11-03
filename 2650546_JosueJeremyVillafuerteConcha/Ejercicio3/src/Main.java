import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        Double num2 = scanner.nextDouble();
        System.out.print("Seleccione operación: 1. Sumar, 2. Restar, 3. Dividir, 4. Potencia \nOpción seleccionada: ");
        int op = scanner.nextInt();
        calculadora(num1,num2,op);
    }

    public static void calculadora(Double num1, Double num2, int op){
        switch (op) {
            case 1:
                System.out.println("La suma de los dos valores es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de los dos valores es: " + (num1 - num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("La división de los dos valores es: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            case 4:
                System.out.println("La potencia de los dos valores es: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}