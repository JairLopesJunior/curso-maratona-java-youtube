package com.youtube.maratonajava.Qstring;

public class StringBuilderMain01 {

    public static void main(String[] args) {

        String nome = "Jair Lopes";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Jair Lopes");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
