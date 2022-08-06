package com.youtube.maratonajava.Uregex;

import java.util.Arrays;

public class ScannerMain01 {

    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        Arrays.asList(nomes).forEach(System.out::println);
    }
}
