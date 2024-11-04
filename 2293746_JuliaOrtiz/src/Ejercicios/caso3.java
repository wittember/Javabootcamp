package Ejercicios;

public class caso3 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplica = numero1 * numero2;
        float division = numero1 / numero2;
        int potenciar = numero1;

        for (int p=1; p< numero2; p++ ){
            potenciar = potenciar * numero1;
        }

        System.out.println("Suma:  " + suma);
        System.out.println("Resta:  " + resta);
        System.out.println("Multiplicacion:  " + multiplica);
        System.out.println("Division:  " + division);
        System.out.println("Potencia:  " + potenciar);

    }
}
