package com.youtube.maratonajava.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMain02 {

    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nfs = new NumberFormat[4];
        nfs[0] = NumberFormat.getCurrencyInstance();
        nfs[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfs[2] = NumberFormat.getCurrencyInstance(localePT);
        nfs[3] = NumberFormat.getCurrencyInstance(localeIT);

        for(NumberFormat nf: nfs) {
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(1000));
        }
    }
}
