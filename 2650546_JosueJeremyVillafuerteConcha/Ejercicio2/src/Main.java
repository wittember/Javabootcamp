import java.util.Scanner;

public class Main {

    static String estacion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes del año a consultar: ");
        int mes = scanner.nextInt();
        String estacion = estaciones(mes);
        resultado(mes, estacion);
    }

    public static String estaciones(int mes){
        if (mes >= 3 && mes <= 5) {
            return estacion = "Otoño";
        } else if (mes >= 6 && mes <= 8) {
            return estacion = "Invierno";
        } else if (mes >= 9 && mes <= 11) {
            return estacion = "Primavera";
        } else if (mes == 12 || mes == 1 || mes == 2) {
            return estacion = "Verano";
        } else {
            return "El mes ingresado no es correcto";
        }
    }

    public static void resultado(int mes, String estacion){
        System.out.println((mes <= 12) ? "La estación del mes " + mes + " es: " + estacion : estacion);
    }
}