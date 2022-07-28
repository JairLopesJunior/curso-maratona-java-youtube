package com.youtube.maratonajava.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain01 {

    public static void main(String[] args) {

        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        System.out.println(dateFormat.format(new Date()));
    }
}
