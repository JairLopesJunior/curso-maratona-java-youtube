package com.youtube.maratonajava.Rdatas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationMain01 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);

        Duration d2 = Duration.between(timeNow, timeMinusSevenHours);
        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d3);

        Duration d4 = Duration.ofDays(20);
        System.out.println(d4);
    }
}














