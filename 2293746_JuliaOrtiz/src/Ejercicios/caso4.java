package Ejercicios;

public class caso4 {
    public static void main(String[] args) {
        String cadena = "prueba  java" ;
        String cambiocadena = cadena.toUpperCase();
        String solovocales = "";
        String soloconsonantes = "";
        int largo = cadena.length();
        char k=' ';

        for (int l = 0; l < largo; l++){
            k = cadena.charAt(l);
            if ( (k == 97) || (k == 111) || (k == 101) || (k == 105) || (k == 117) ){
               solovocales += k;
            }else{
               soloconsonantes += k;
            }

        }

        System.out.println(" " + cadena + " ->  " + cambiocadena);
        System.out.println(" solo vocales   ->  " + solovocales);
        System.out.println(" solo consonantes ->  " + soloconsonantes);

    }
}
