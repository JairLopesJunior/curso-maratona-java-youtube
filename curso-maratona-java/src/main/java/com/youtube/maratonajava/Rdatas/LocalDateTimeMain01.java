package com.youtube.maratonajava.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeMain01 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime localTime = LocalTime.of(9, 45, 00);
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(date);
        System.out.println(localTime);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
