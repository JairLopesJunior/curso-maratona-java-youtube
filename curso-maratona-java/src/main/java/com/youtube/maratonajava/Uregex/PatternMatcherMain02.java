package com.youtube.maratonajava.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain02 {

    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna tudo o que não for digito
        // \s = Retorna os espaços em branco (\t, \n, \f, \r)
        // \S = Retorna todos os caracters excluindo os espaços em branco
        // \w = Retorna todos os a-z, A-Z, digitos, _
        // \W = Retorna tudo que não for incluso no \w
        String regex = "\\W";
        String texto2 = "asd  1a 3__?34s5d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            //System.out.print(matcher.start() + " " + matcher.group() + "\n");
            System.out.print(matcher.group());
        }
    }
}






















