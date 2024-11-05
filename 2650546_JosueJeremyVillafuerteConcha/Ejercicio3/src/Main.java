import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    static String resultado = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        Double num2 = scanner.nextDouble();
        System.out.print("Seleccione operación: 1. Sumar, 2. Restar, 3. Dividir, 4. Potencia \nOpción seleccionada: ");
        int op = scanner.nextInt();
        System.out.println(calculadora(num1,num2,op));
    }

    public static String calculadora(Double num1, Double num2, int op){
        switch (op) {
            case 1:
                resultado = String.valueOf(num1 + num2);
                break;
            case 2:
                resultado = String.valueOf(num1 - num2);
                break;
            case 3:
                resultado = (num2 != 0) ? String.valueOf(new BigDecimal(num1 / num2).setScale(2, RoundingMode.HALF_UP)) : "No se puede dividir entre cero.";
                break;
            case 4:
                resultado = String.valueOf(Math.pow(num1, num2));
                break;
            default:
                return "Operación no válida.";
        }
        return "El resultado de la operación seleccionada es: " + resultado;
    }
}