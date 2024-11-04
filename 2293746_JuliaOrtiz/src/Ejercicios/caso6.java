package Ejercicios;

public class caso6 {
    public static void main(String[] args) {
        int numero = 21;
        boolean ValorPrimo = true;

        for (int p = 2; p < numero; p++){
            if ( numero % p==0){
               ValorPrimo =false;
               break;
            //}else{
             //
            }
           // System.out.println( numero + "no  es primo ");
       }
       if(ValorPrimo){   System.out.println( numero + "si es primo "); }


    }
}
