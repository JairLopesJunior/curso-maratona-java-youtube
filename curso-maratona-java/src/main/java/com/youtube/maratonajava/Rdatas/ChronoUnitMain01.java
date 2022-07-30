package com.youtube.maratonajava.Rdatas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain01 {

    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        long between = ChronoUnit.DAYS.between(aniversario, now);
        long between2 = ChronoUnit.WEEKS.between(aniversario, now);
        long between3 = ChronoUnit.MONTHS.between(aniversario, now);
        long between4 = ChronoUnit.YEARS.between(aniversario, now);
        System.out.println(between);
        System.out.println(between2);
        System.out.println(between3);
        System.out.println(between4);
    }
}
