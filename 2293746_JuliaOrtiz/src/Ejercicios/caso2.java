package Ejercicios;

public class caso2 {
    public static void main(String[] args) {
        int mes = 10;
        String resultadoMes = "";
        String resultadoEstacion = "";

        resultadoMes = switch(mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Setiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Dato Ilegal";
        };

        resultadoEstacion = switch(mes) {
            case 1,2,3 -> "Verano";
            case 4,5,6 -> "Otoño";
            case 7,8,9 -> "Invierno";
            case 10,11,12 -> "Primavera";
            default -> "Dato Ilegal";
        };
        System.out.println("Mes " + resultadoMes + " -> Estacion " + resultadoEstacion);

    }
}
