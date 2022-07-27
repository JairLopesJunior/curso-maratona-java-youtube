package com.youtube.maratonajava.Qstring;

import java.util.Locale;

public class StringMain02 {

    public static void main(String[] args) {

        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Retorna o caracter da String
        System.out.println(nome.length()); // Retorna o tamanho da String
        System.out.println(nome.replace("f", "J")); // Modifica a String
        System.out.println(nome.toLowerCase()); // Deixa tudo minusculo
        System.out.println(nome.toUpperCase()); // Deixa tudo maiusculo
        System.out.println(numeros.substring(0, 4)); // Recorta a String
    }
}
