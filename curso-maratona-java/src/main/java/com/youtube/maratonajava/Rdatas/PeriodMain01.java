package com.youtube.maratonajava.Rdatas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusYears(2).plusDays(7);
        Period period = Period.between(now, nowAfterTwoYears);
        System.out.println(period);

        Period p2 = Period.ofDays(10);
        System.out.println(p2);

        Period p3 = Period.ofWeeks(58);
        System.out.println(p3);

        Period p4 = Period.ofMonths(3);
        System.out.println(p4);

        Period p5 = Period.ofYears(3);
        System.out.println(p5);
    }
}
