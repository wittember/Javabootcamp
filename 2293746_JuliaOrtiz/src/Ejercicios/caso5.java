package Ejercicios;
// 5. Elaborar un programa en java que permita calcular el interés del 25.5 % de un préstamo de 35,500 y calcular el igv del 18% del interés calculado.
public class caso5 {
    public static void main(String[] args) {
        int prestamo = 35500;
        double interes = 25.5;
        int igv = 18;
        double totalinteres = prestamo * interes/100;
        double totalpagar = totalinteres + prestamo;
        double totaligv = totalpagar * igv/100;
        double totalfinal = totalpagar + totaligv;

        System.out.println("Prestamo   :  " + prestamo );
        System.out.println("+ intereses:   " + totalinteres );
        System.out.println("Total      :  " + totalpagar);
        System.out.println("+ igv      :   " + totaligv  );
        System.out.println("= total    :  " + totalfinal );

    }
}
