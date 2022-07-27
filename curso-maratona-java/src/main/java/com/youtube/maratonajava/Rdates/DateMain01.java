package com.youtube.maratonajava.Rdates;

import java.util.Date;

public class DateMain01 {

    public static void main(String[] args) {
        Date date = new Date(1_000_000_000); // long 100000
        date.setTime(date.getTime() + 3_600_000); // Adicionando 1 hora
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
