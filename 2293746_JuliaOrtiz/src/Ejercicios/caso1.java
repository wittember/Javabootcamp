package Ejercicios;

public class caso1 {
    public static void main(String[] args) {
        //bucle for
        for (int i=0; i<31; i++){
            int residuo = i % 2 ;
            if(residuo==0) {
                System.out.println(("Numero Par:" + i));
            }else{
                System.out.println(("Numero Impar:" + i));
            }
        }
    }
}
