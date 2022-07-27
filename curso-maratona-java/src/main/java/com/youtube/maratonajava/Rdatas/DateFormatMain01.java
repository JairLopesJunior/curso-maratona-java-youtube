package com.youtube.maratonajava.Rdatas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatMain01 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dfs = new DateFormat[7];
        dfs[0] = DateFormat.getDateInstance();
        dfs[1] = DateFormat.getDateInstance();
        dfs[2] = DateFormat.getDateTimeInstance();
        dfs[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfs[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfs[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfs[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat: dfs) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}





















