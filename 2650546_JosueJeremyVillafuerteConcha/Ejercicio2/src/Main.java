import java.util.Scanner;

public class Main {

    static String estacion = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes del año a consultar: ");
        int mes = scanner.nextInt();
        estaciones(mes);
    }

    public static void estaciones(int mes){
        if (mes >= 3 && mes <= 5) {
            estacion = "Otoño";
            resultado(mes, estacion);
        } else if (mes >= 6 && mes <= 8) {
            estacion = "Invierno";
            resultado(mes, estacion);
        } else if (mes >= 9 && mes <= 11) {
            estacion = "Primavera";
            resultado(mes, estacion);
        } else if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Verano";
            resultado(mes, estacion);
        } else {
            System.out.println("El mes ingresado no es correcto");
        }
    }

    public static void resultado(int mes, String estacion){
        System.out.println("La estación del mes " + mes + " es: " + estacion);
    }
}