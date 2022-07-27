package com.youtube.maratonajava.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMain01 {

    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nfs = new NumberFormat[4];
        nfs[0] = NumberFormat.getInstance();
        nfs[1] = NumberFormat.getInstance(localeJP);
        nfs[2] = NumberFormat.getInstance(localePT);
        nfs[3] = NumberFormat.getInstance(localeIT);

        for(NumberFormat nf: nfs) {
            System.out.println(nf.format(1000));
        }
    }
}
