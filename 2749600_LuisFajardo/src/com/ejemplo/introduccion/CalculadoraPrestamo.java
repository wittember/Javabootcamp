package com.ejemplo.introduccion;
import java.math.BigDecimal;

public class CalculadoraPrestamo {
    public static void main(String[] args) {

        BigDecimal prestamo = new BigDecimal("35500.0");
        //double prestamo = 35500.0;
        BigDecimal tasaInteres = new BigDecimal("25.5");
        BigDecimal tasaIGV = new BigDecimal("18.0");

        System.out.println("Monto del préstamo: " + prestamo);

        BigDecimal interes = prestamo.multiply(tasaInteres).divide(new BigDecimal("100"));
        System.out.println("Interés calculado (25.5%): " + interes);

        BigDecimal igv = interes.multiply(tasaIGV).divide(new BigDecimal("100"));
        System.out.println("IGV calculado (18% sobre el interés): " + igv);

        BigDecimal totalConIGV = interes.add(igv); // Suma el interés con el IGV
        System.out.println("Total incluyendo IGV: " + totalConIGV);
    }
}
