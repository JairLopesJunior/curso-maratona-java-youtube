package com.youtube.maratonajava.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain05 {

    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna tudo o que não for digito
        // \s = Retorna os espaços em branco (\t, \n, \f, \r)
        // \S = Retorna todos os caracters excluindo os espaços em branco
        // \w = Retorna todos os a-z, A-Z, digitos, _
        // \W = Retorna tudo que não for incluso no \w
        // []
        // ? = Zero ou uma ocorrencia
        // * = Zero ou mais ocorrencias
        // + = Uma ou mais ocorrencias
        // {n, m} = De n até m ocorrencias
        // () = Agrupamento
        // | = Ou
        // $ = Representa o fim da linha
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            //System.out.print(matcher.start() + " " + matcher.group() + "\n");
            System.out.print(matcher.group() + " ");
        }
    }
}






















