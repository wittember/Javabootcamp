package Ejercicios;

public class Ejercicio1 {

    //1.Elaborar un programa en java que permita recorrer los 30 días del mes y
    // muestre a los días impares.

    public static void main(String[] args) {
        System.out.println("Numeros impares del mes");
        for (int i=1; i<30; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
