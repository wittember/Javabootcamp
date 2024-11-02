import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha en formato yyyy-MM-dd: ");
        String fechaInput = sc.nextLine();
        convertidor(fechaInput);
    }

    public static void convertidor(String fechaInput){
        // Convertir la fecha de String a LocalDate
        LocalDate fecha = LocalDate.parse(fechaInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // Obtener el día de la semana
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        // Imprimir el día de la semana en texto
        System.out.println("El día de la semana es: \n" + diaDeLaSemana);
    }
}