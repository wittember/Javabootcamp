import java.util.Scanner;

public class Main {
    static Double _igv = 0.18;
    static Double _interes = 0.255;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del prestamo: ");
        Double prestamo = scanner.nextDouble();

        Double valor_interes = calculoInteres(prestamo);
        Double prestamoConInteres = prestamoConInteres(prestamo,valor_interes);
        Double valor_igv = calculoIgv(prestamoConInteres);

        System.out.println("El valor de interes es: " + valor_interes + "\nEl valor del igv con el interes calculado es: " + valor_igv);
    }

    public static Double calculoInteres(Double prestamo){
        return prestamo * _interes;
    }

    public static Double prestamoConInteres(Double prestamo, Double valor_interes){
        return prestamo + valor_interes;
    }

    public static Double calculoIgv(Double prestamoConInteres){
        return prestamoConInteres * _igv;
    }

}