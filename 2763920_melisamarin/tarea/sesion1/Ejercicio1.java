package com.tarea.sesion1;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static int getTotalDiasMes (Month monthText) {
        YearMonth yearMonth = YearMonth.of(LocalDate.now(ZoneId.of("America/Lima")).getYear(), monthText);
        return yearMonth.lengthOfMonth();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number > ");
        int monthNumber = scanner.nextInt();

        int monthDays = getTotalDiasMes(Month.of(monthNumber));;

        int c = 1;
        while (c < monthDays) {
            for (int i = 0; i < 7; i++){
                System.out.print(c + "\t");
                c++;
                if (c > monthDays) {
                    break;
                }
            }
            System.out.println("");
        }

        List<Integer> lst = null;

        for (int i = 0; i < monthDays; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
