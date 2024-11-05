import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static double IGV = 0.18;
    static double INTERES = 0.255;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del prestamo: ");
        double prestamo = scanner.nextDouble();

        double valor_interes = calculoInteres(prestamo);
        double prestamoConInteres = prestamoConInteres(prestamo,valor_interes);
        double valor_igv = calculoIgv(prestamoConInteres);

        System.out.println("El valor de interes es: " + new BigDecimal(valor_interes).setScale(2, RoundingMode.HALF_UP) + "\nEl valor del igv con el interes calculado es: " + new BigDecimal(valor_igv).setScale(2,RoundingMode.HALF_UP));
    }

    public static double calculoInteres(double prestamo){
        return prestamo * INTERES;
    }

    public static double prestamoConInteres(double prestamo, double valor_interes){
        return prestamo + valor_interes;
    }

    public static double calculoIgv(double prestamoConInteres){
        return prestamoConInteres * IGV;
    }

}